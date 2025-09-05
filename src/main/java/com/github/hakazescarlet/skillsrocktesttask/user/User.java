package com.github.hakazescarlet.skillsrocktesttask.user;

import com.github.hakazescarlet.skillsrocktesttask.role.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String fio; // fullName
    private String phoneNumber;
    private String avatar;

    @ManyToOne(optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "role_uuid")
    private Role role;

    public User() {
    }

    public User(@NotNull String fio) {
        if (fio == null) {
            throw new NoFioException("Fio is null.");
        }
        this.fio = fio;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(fio, user.fio) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(avatar, user.avatar) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, phoneNumber, avatar, role);
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", fio='" + fio + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", avatar='" + avatar + '\'' +
            ", role=" + role +
            '}';
    }

    private static class NoFioException extends RuntimeException {
        public NoFioException(String message) {
            super(message);
        }
    }
}
