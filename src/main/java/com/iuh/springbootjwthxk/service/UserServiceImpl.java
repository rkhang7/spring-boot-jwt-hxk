package com.iuh.springbootjwthxk.service;

import com.iuh.springbootjwthxk.entity.User;
import com.iuh.springbootjwthxk.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service @RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;


    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }
}
