package com.github.hakazescarlet.skillsrocktesttask.role;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class RoleDto {

    private UUID uuid;

    @NotNull
    private String name;

    public RoleDto() {
    }

    public RoleDto(Role role) {
        this.uuid = role.getUuid();
        this.name = role.getName();
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getRoleName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}