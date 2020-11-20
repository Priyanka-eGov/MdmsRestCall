 package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

// @JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "common-masters"
})
@Data
public class MdmsRes {

    @JsonProperty("common-masters")
    private CommonMasters commonMasters;

     @JsonIgnore
     private Map<String, Object> additionalProperties = new HashMap<String, Object>();

 }