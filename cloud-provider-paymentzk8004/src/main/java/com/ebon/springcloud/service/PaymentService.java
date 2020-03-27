package com.ebon.springcloud.service;

import com.ebon.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: wyh
 * @Date: 2020/3/26 15:03
 * @Description:
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
