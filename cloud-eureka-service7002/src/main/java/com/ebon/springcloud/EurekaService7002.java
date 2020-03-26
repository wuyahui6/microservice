package com.ebon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: wyh
 * @Date: 2020/3/26 16:45
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService7002 {
     public static void main(String[] args) {
             SpringApplication.run(EurekaService7002.class, args);
      }
}
