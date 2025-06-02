package com.viniciusysr.auth_api.enums.user;

public enum UserRole {
    ADMIN("Admin"),
    USER("User");

    String role;

    UserRole(String role){
        this.role = role;
    }
}
