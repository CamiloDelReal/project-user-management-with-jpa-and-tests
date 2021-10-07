package com.example.usermanagementwithjpaandtests.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginResponse {
    private String email;
    private String tokenType;
    private String token;
}
