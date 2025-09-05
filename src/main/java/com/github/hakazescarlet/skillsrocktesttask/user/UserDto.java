package com.github.hakazescarlet.skillsrocktesttask.user;

import com.github.hakazescarlet.skillsrocktesttask.role.Role;
import com.github.hakazescarlet.skillsrocktesttask.role.RoleDto;

import java.util.UUID;

public class UserDto {

    private UUID uuid;
    private String fio; // fullName
    private String phoneNumber;
    private String avatar;
    private RoleDto roleDto;

    public UserDto() {
    }

    public UserDto(User user) {
        this.uuid = user.getId();
        this.fio = user.getFio();
        this.phoneNumber = user.getPhoneNumber();
        this.avatar = user.getAvatar();

        Role role = user.getRole();
        this.roleDto = new RoleDto(role);
    }

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

    public RoleDto getRole() {
        return roleDto;
    }
}
