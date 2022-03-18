package com.rocco.sms;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @programe: sms-spring-boot-starter
 * @author: Rocco
 * @create: 2022-03-18
 * @description: 自动配置类
 **/

@Configuration
@EnableConfigurationProperties(SmsProperties.class)
public class SmsAutoConfiguration {

    @Bean
    public AliyunSmsSender sendAliyunMessage(SmsProperties properties) {
        return new AliyunSmsSender(properties.getAliyun());
    }

    @Bean
    public TencentSmsSender sendTencentMessage(SmsProperties properties) {
        return new TencentSmsSender(properties.getTencent());
    }

}
