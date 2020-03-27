package com.ebon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @Auther: wyh
 * @Date: 2020/3/26 14:32
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPaymentZK8004 {
     public static void main(String[] args) {
             SpringApplication.run(ProviderPaymentZK8004.class, args);
      }
}
