package com.example.demo;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "ResponseInfo",
        "MdmsRes"
})
@Data
public class ResponseData {

    @JsonProperty("ResponseInfo")
    private Object responseInfo;
    @JsonProperty("MdmsRes")
    private MdmsRes mdmsRes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();



}