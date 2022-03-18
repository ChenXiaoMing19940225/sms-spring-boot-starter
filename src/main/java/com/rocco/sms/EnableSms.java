package com.rocco.sms;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 发送短信注解 使用时在启动类上加上这个注解就行了
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SmsAutoConfiguration.class)
public @interface EnableSms {

}
