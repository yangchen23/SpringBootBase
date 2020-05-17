package com.atguigu.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/17 14:13
 * @Description:
 */

@ConfigurationProperties(prefix = "atguigu.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
