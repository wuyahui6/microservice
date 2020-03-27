package com.ebon.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: wyh
 * @Date: 2020/3/26 16:31
 * @Description:
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class CusumerOrderConsul80 {
     public static void main(String[] args) {
             SpringApplication.run(CusumerOrderConsul80.class, args);
      }
}
