package com.ebon.springcloud;

import com.ebon.myselfRule.MySelfRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Auther: wyh
 * @Date: 2020/3/26 16:31
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUDPAYMENTSERVICE",configuration = MySelfRule.class)
public class CusumerOrder80 {
     public static void main(String[] args) {
             SpringApplication.run(CusumerOrder80.class, args);
      }
}
