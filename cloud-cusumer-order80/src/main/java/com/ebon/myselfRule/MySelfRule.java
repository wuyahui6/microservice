package com.ebon.myselfRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: wyh
 * @Date: 2020/3/30 17:29
 * @Description: RestTemplate 必须 加 @LoadBalanced
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule()
    {
        return new RandomRule();//定义为随机
    }
}
