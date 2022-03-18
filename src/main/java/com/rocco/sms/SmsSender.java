package com.rocco.sms;

/**
 * 信息发送接口
 */
public interface SmsSender {
    boolean send(String message);
}
