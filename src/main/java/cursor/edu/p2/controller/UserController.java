package cursor.edu.p2.controller;

import cursor.edu.p2.model.User;
import cursor.edu.p2.services.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping
    public ResponseEntity addUser(@RequestBody User user) {
        userService.addNewUser(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable(name = "id") Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable(name = "id") Long userId, @RequestBody User newUser) {
        userService.updateUser(userId, newUser);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }
}
