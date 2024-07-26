package com.example.minkia_pitittu.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    private String username;
    private String password;
    private String email;
    // Aggiungi altri campi necessari per la registrazione
}
