package com.ebon.springcloud.MyLoadBalanced;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: wyh
 * @Date: 2020/3/30 17:48
 * @Description:
 */
public interface MyLoadBalance {
    ServiceInstance instances(List<ServiceInstance> instanceList);
}
