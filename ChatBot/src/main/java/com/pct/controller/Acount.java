package com.pct.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Lấy thông tin người chat từ ...
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Acount {

    @JsonProperty("account_id")
    public String accountId;

    @JsonProperty("name")
    public String name;
}