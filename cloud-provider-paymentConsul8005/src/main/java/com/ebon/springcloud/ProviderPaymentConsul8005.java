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
public class ProviderPaymentConsul8005 {
     public static void main(String[] args) {
             SpringApplication.run(ProviderPaymentConsul8005.class, args);
      }
}
