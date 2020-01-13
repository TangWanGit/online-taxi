/*
 * File Name:CustomEvent is created on 2020-01-13 10:19 by Zhao Xiaoli
 *
 * Copyright (c) 2020, xiaoyujiaoyu technology All Rights Reserved.
 *
 */
package com.tangwan.online.taxi;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Zhao Xiaoli
 * @Description : 实例取消事件监听
 * @date 2020-01-13 10:19
 * @since JDK 1.8
 */
@Component
public class CustomEvent {

    @EventListener
    public void listener(EurekaInstanceCanceledEvent event) {
        System.out.println(event.getServerId() + "下线事件");
    }

}
