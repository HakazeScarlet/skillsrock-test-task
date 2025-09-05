package com.github.hakazescarlet.skillsrocktesttask.user;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getByUUID(UUID uuid) {
        return null;
    }

    public UserDto create(CreateUpdateUserCommand command) {
        User user = new User();
        user.setFio(command.getFio());
        user.setPhoneNumber(command.getPhoneNumber());
        user.setAvatar(command.getAvatar());
        user.setRole(command.getRole());
        User savedUser = userRepository.save(user);
        return new UserDto(savedUser);
    }

    public UserDto update() {
        return null;
    }

    public void deleteByUUID(UUID uuid) {
    }
}
