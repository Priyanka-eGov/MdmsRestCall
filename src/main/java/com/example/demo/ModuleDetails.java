package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "moduleName",
        "masterDetails"
})
public class ModuleDetails {

    @JsonProperty("moduleName")
    private String moduleName;
    @JsonProperty("masterDetails")
    private List<MasterDetails> masterDetails = null;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}