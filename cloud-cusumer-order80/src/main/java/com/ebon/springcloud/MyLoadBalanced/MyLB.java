package com.ebon.springcloud.MyLoadBalanced;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: wyh
 * @Date: 2020/3/30 18:05
 * @Description: 自定义负载均衡算法
 */
@Component
public class MyLB implements MyLoadBalance {
    // 原子整数
    private AtomicInteger nextServerCyclicCounter;

    public MyLB() {
        this.nextServerCyclicCounter = new AtomicInteger(0);
    }

    private int incrementAndGetModulo() {
        int current;
        int next;
        do {
            current = this.nextServerCyclicCounter.get();
            next = current >= 2147483647 ? 0 : current + 1;
        } while(!this.nextServerCyclicCounter.compareAndSet(current, next));
        System.out.println("第几次*******" + current);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> instanceList) {
        // 计算索引
        int index =  incrementAndGetModulo() % instanceList.size();
        // 获取服务
        return instanceList.get(index);
    }
}
