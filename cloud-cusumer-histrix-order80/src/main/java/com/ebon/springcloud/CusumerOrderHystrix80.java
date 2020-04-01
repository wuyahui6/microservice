package com.ebon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: wyh
 * @Date: 2020/3/30 18:43
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CusumerOrderHystrix80 {
     public static void main(String[] args) {
             SpringApplication.run(CusumerOrderHystrix80.class, args);
      }
}
