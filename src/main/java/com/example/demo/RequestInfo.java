package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "apiId",
        "ver",
        "ts",
        "action",
        "did",
        "key",
        "msgId",
        "authToken"
})
@Data
public class RequestInfo {

    @JsonProperty("apiId")
    private String apiId;
    @JsonProperty("ver")
    private Object ver;
    @JsonProperty("ts")
    private Object ts;
    @JsonProperty("action")
    private Object action;
    @JsonProperty("did")
    private Object did;
    @JsonProperty("key")
    private Object key;
    @JsonProperty("msgId")
    private String msgId;
    @JsonProperty("authToken")
    private String authToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}