package com.ebon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: wyh
 * @Date: 2020/3/26 14:32
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderPayment8001 {
     public static void main(String[] args) {
             SpringApplication.run(ProviderPayment8001.class, args);
      }
}
