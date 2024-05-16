package com.lpnu.springBackEnd.impl;

import com.lpnu.springBackEnd.model.User;
import com.lpnu.springBackEnd.repository.UserRepository;
import com.lpnu.springBackEnd.service.UserService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.aspectj.lang.reflect.UnlockSignature;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
@AllArgsConstructor
public class UserImpl implements UserService {
    private final UserRepository repository;
    @Override
    public User getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public User getByEmail(@PathVariable String email) {
        return repository.findByEmail(email);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }
    @Override
    @Transactional
    public void deleteUser(Long id){
         repository.deleteById(id);
    }
}
