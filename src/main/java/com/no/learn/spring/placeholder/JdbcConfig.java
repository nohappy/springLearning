package com.no.learn.spring.placeholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: suolongxiang  Date: 16/9/24 Time: 下午5:41
 */
@Component
public class JdbcConfig {

    @Value("${url}")
    private String url;

    @Value("${usename}")
    private String usename;

    @Value("${namespace}")
    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }
}