package com.ebon.springcloud.service;

import com.ebon.springcloud.entities.CommonResult;
import com.ebon.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Auther: wyh
 * @Date: 2020/3/30 18:46
 * @Description:
 */
@Component
@FeignClient(value = "CLOUDPAYMENTSERVICE")
public interface PaymentService {

    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment);

    @GetMapping("/payment/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/provider/timeOut")
    public String timeOut();

}
