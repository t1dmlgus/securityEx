package com.t1dmlgus.securityEx.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.Authentication;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SecurityMessage {

    private Authentication auth;
    private String message;
}
