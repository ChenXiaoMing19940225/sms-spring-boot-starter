package com.rocco.sms;

/**
 * @programe: sms-spring-boot-starter
 * @author: Rocco
 * @create: 2022-03-18
 * @description: 短信发送实现类
 **/

public class AliyunSmsSender implements SmsSender {
    private SmsProperties.SmsMessage smsMessage;

    AliyunSmsSender(SmsProperties.SmsMessage smsMessage) {
        this.smsMessage = smsMessage;
    }

    @Override
    public boolean send(String message) {
        System.out.println(smsMessage.toString() + "开始发送短信==>短信内容" + message);
        return true;
    }
}
