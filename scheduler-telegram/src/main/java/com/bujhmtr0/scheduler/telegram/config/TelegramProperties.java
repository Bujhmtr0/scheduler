package com.bujhmtr0.scheduler.telegram.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;


@ConstructorBinding
@ConfigurationProperties("bot")
public class TelegramProperties {
    private final String username;
    private final String token;

    public TelegramProperties(String username, String token) {
        this.username = username;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public String getToken() {
        return token;
    }
}
