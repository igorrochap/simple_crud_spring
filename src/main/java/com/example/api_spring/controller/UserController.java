package com.example.api_spring.controller;

import com.example.api_spring.controller.dto.UserDto;
import com.example.api_spring.controller.form.UserForm;
import com.example.api_spring.model.User;
import com.example.api_spring.repository.UserRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserDto> index(){
        List<User> users = userRepository.findAll();

        return UserDto.convert(users);
    }

    @PostMapping
    public ResponseEntity<UserDto> store(@RequestBody UserForm userForm, UriComponentsBuilder uriBuilder){
        User user = userForm.convert();
        userRepository.save(user);

        URI uri = uriBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(new UserDto(user));
    }
}
