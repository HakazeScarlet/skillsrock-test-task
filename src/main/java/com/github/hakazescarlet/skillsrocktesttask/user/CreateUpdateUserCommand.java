package com.github.hakazescarlet.skillsrocktesttask.user;

import com.github.hakazescarlet.skillsrocktesttask.role.Role;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class CreateUpdateUserCommand {

    @NotNull
    private String fio; // fullName

    @Size(min = 6, max = 13)
    private String phoneNumber;

    private String avatar;

    @NotNull
    private Role role;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CreateUpdateUserCommand that = (CreateUpdateUserCommand) o;
        return Objects.equals(fio, that.fio) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(avatar, that.avatar) && Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, phoneNumber, avatar, role);
    }

    @Override
    public String toString() {
        return "CreateUpdateUserCommand{" +
            "fio='" + fio + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", avatar='" + avatar + '\'' +
            ", role=" + role +
            '}';
    }
}
