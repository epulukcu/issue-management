package com.elifpulukcu.issuemanagement.service.impl;

import com.elifpulukcu.issuemanagement.entity.Project;
import com.elifpulukcu.issuemanagement.entity.User;
import com.elifpulukcu.issuemanagement.repository.ProjectRepository;
import com.elifpulukcu.issuemanagement.repository.UserRepository;
import com.elifpulukcu.issuemanagement.service.ProjectService;
import com.elifpulukcu.issuemanagement.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        if(user.getEmail()==null){
            throw new IllegalArgumentException("Username can not be null!");
        }
        user = userRepository.save(user);
        return user;
    }

    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User getByUsername (String username){
        return userRepository.findByUsername(username);
    }
}
