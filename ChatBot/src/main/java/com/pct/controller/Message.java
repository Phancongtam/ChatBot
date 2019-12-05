package com.pct.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *Lấy các tin nhắn từ chat...
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Message {

    @JsonProperty("account")
    public Acount account;

    @JsonProperty("body")
    public String body;
}