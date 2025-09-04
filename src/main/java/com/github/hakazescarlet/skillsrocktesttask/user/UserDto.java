package com.github.hakazescarlet.skillsrocktesttask.user;

import com.github.hakazescarlet.skillsrocktesttask.role.Role;

import java.util.UUID;

public class UserDto {

    private UUID uuid;
    private String fio; // fullName
    private String phoneNumber;
    private String avatar;
    private Role role;

    public UUID getUuid() {
        return uuid;
    }

    public String getFio() {
        return fio;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public Role getRole() {
        return role;
    }
}
