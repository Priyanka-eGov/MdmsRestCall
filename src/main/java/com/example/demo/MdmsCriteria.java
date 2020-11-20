package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tenantId",
        "moduleDetails"
})
@Data
public class MdmsCriteria {

    @JsonProperty("tenantId")
    private String tenantId;
    @JsonProperty("moduleDetails")
    private List<ModuleDetails> moduleDetails = null;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
