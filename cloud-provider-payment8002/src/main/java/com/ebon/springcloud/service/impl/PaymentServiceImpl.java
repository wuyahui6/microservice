package com.ebon.springcloud.service.impl;

import com.ebon.springcloud.dao.PaymentDao;
import com.ebon.springcloud.entities.Payment;
import com.ebon.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: wyh
 * @Date: 2020/3/26 15:04
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
