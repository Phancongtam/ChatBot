package com.pct.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Lấy số lượng tin nhắn đc nhắn cho bot.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class BotStatus {

    @JsonProperty("mention_num")
    public int mentionRoomNum;
}
