package com.ebon.springcloud.controller;

import com.ebon.springcloud.MyLoadBalanced.MyLoadBalance;
import com.ebon.springcloud.entities.CommonResult;
import com.ebon.springcloud.entities.Payment;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.shared.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @Auther: wyh
 * @Date: 2020/3/26 16:22
 * @Description:
 */
@RestController
@Slf4j
public class OrderController80 {
    // public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUDPAYMENTSERVICE";

    @Resource
    private RestTemplate restTemplate;
    
    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private MyLoadBalance loadBalance;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment)
    {
        return restTemplate.postForObject(PAYMENT_URL +"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(PAYMENT_URL+"/payment/getPaymentById/"+id,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/entity/{id}")
    public CommonResult<Payment> getPaymentForEntity(@PathVariable("id") Long id)
    {
        List<ServiceInstance> cloudpaymentservice = discoveryClient.getInstances("CLOUDPAYMENTSERVICE");
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/getPaymentById/" + id, CommonResult.class);
        log.info(entity.getStatusCode() + "\t" + entity.getHeaders().getAcceptLanguage() + "\t" + entity.getHeaders().getAcceptCharset());
        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new CommonResult<>(444,"操作失败");
        }

    }

    @GetMapping("/consumer/lb/{id}")
    public CommonResult<Payment> getLB(@PathVariable("id") Long id){
        List<ServiceInstance> cloudpaymentservice = discoveryClient.getInstances("CLOUDPAYMENTSERVICE");
        if (cloudpaymentservice.size() > 0) {
            ServiceInstance instances = loadBalance.instances(cloudpaymentservice);
            URI uri = instances.getUri();
            ResponseEntity<CommonResult> entity = restTemplate.getForEntity(uri + "/payment/getPaymentById/" + id, CommonResult.class);
            return entity.getBody();
        } else {
            return null;
        }
    }
}
