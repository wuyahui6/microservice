package com.ebon.springcloud.controller;

import com.ebon.springcloud.entities.CommonResult;
import com.ebon.springcloud.entities.Payment;
import com.ebon.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @Auther: wyh
 * @Date: 2020/3/30 18:48
 * @Description:
 */
@RestController
@Slf4j
public class PaymentOpenFeinController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentForEntity(@PathVariable("id") Long id)
    {
        CommonResult<Payment> entity = paymentService.getPaymentById(id);
        return entity;
    }
}
