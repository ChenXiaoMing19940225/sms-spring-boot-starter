package com.rocco.sms;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @programe: sms-spring-boot-starter
 * @author: Rocco
 * @create: 2022-03-18
 * @description: 映射类
 **/

@Data
@ConfigurationProperties(prefix = "sms")
public class SmsProperties {

    SmsMessage aliyun = new SmsMessage();
    SmsMessage tencent = new SmsMessage();

    @Data

    public static class SmsMessage {
        private String userName;
        private String password;
        /**
         * 密钥
         */
        private String sign;
        private String url;

        @Override
        public String toString() {
            return "SmsMessage{" +
                    "userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    ", sign='" + sign + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

}
