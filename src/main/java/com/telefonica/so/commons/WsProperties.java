package com.telefonica.so.commons;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
@ConfigurationProperties(prefix = "ws")
public class WsProperties {

    private String  urlElegibleMo;
    private String  urlElegibleFi;
    private String  urlElegibleMt;
    private String  urlSuggestedMo;
    private String  urlSuggestedFi;
    private String  urlSuggestedMt;
    private Integer connectiontimeout;
    private Integer readtimeout;

}
