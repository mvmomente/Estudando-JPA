package com.mvmomente.jpaestudo.services;

import com.mvmomente.jpaestudo.dto.RegisterDto;
import com.mvmomente.jpaestudo.entity.User;
import com.mvmomente.jpaestudo.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    private UserRepository repository;

    public UserServices(UserRepository repository) {
        this.repository = repository;
    }

    public User createUser(RegisterDto dto) {
        if(repository.existsByEmail(dto.email())) {
            throw new RuntimeException("Email já cadastrado");
        }

        User user = new User();

        user.setName(dto.name());
        user.setEmail(dto.email());
        user.setPassword(dto.password());

        return repository.save(user);
    }

    public List<User> showAllUser() {
        return repository.findAll();
    }
}
