package com.furnigo.furniture.interfaces.rest.resources;

public record CreateNewUserResource(
        String email,
        String password,
        String name,
        String lastName,
        String role,
        String phone,
        String pic
) {
}
