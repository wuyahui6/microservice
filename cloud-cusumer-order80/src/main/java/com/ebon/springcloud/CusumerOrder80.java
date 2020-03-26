package com.ebon.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: wyh
 * @Date: 2020/3/26 16:31
 * @Description:
 */
@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class CusumerOrder80 {
     public static void main(String[] args) {
             SpringApplication.run(CusumerOrder80.class, args);
      }
}
