package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Department"
})
@Data
public class CommonMasters {

    @JsonProperty("Department")
    private List<Department> department ;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}