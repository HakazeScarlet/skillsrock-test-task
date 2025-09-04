package com.github.hakazescarlet.skillsrocktesttask.role;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class Role {

    private UUID uuid;

    @NotNull
    private String name;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}