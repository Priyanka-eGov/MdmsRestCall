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
        "RequestInfo",
        "MdmsCriteria"
})
@Data
public class RestData {

    @JsonProperty("RequestInfo")
    private RequestInfo requestInfo;
    @JsonProperty("MdmsCriteria")
    private MdmsCriteria mdmsCriteria;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
