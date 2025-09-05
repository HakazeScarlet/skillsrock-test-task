package com.github.hakazescarlet.skillsrocktesttask.user;

import com.github.hakazescarlet.skillsrocktesttask.role.Role;
import com.github.hakazescarlet.skillsrocktesttask.role.RoleDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getByUUID(UUID uuid) {
        User user = userRepository.getReferenceById(uuid);
        return new UserDto(user);
    }

    public UserDto create(CreateUpdateUserCommand command) {
        User user = new User();
        User savedUser = save(user, command, new Role());
        return new UserDto(savedUser);
    }

    public UserDto update(UUID uuid, CreateUpdateUserCommand command) {
        User user = userRepository.getReferenceById(uuid);
        User updatedUser = save(user, command, user.getRole());
        return new UserDto(updatedUser);
    }

    public void deleteByUUID(UUID uuid) {
        userRepository.deleteById(uuid);
    }

    private User save(User user, CreateUpdateUserCommand command, Role role) {
        user.setFio(command.getFio());
        user.setPhoneNumber(command.getPhoneNumber());
        user.setAvatar(command.getAvatar());

        RoleDto roleDto = command.getRole();
        role.setName(roleDto.getRoleName());
        user.setRole(role);

        return userRepository.save(user);
    }
}
