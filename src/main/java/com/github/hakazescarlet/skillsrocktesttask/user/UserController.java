package com.github.hakazescarlet.skillsrocktesttask.user;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public UserDto getUserByUUID(@NotNull @RequestParam("uuid") UUID uuid) {
        return userService.getByUUID(uuid);
    }

    @PostMapping("/createNewUser")
    public ResponseEntity<UserDto> createUser(@RequestBody @Valid CreateUpdateUserCommand command) {
        return ResponseEntity.ok(userService.create(command));
    }

    @PutMapping("/userDetailsUpdate")
    public ResponseEntity<UserDto> updateUserInfo(
        @RequestBody @Valid CreateUpdateUserCommand command,
        @NotNull @RequestParam("uuid") UUID uuid
    ) {
        if (command.getRole().getUuid() == null) {
            throw new NoRoleUUIDException("Role's UUID is null.");
        }
        return ResponseEntity.ok(userService.update());
    }

    @DeleteMapping("/users")
    public ResponseEntity<UserDto> deleteUser(@NotNull @RequestParam("uuid") UUID uuid) {
        userService.deleteByUUID(uuid);
        return ResponseEntity.ok().build();
    }

    private static class NoRoleUUIDException extends RuntimeException {
        public NoRoleUUIDException(String message) {
            super(message);
        }
    }
}
