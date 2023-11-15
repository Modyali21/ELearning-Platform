package com.example.demo.Registeration;

import lombok.Data;
@Data
public class RegistrationRequest {
        private String name;

        private String email;

        private String password;

        private boolean gender;

        private int role;
}
