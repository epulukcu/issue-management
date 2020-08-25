package com.elifpulukcu.issuemanagement.service;

import com.elifpulukcu.issuemanagement.entity.Issue;
import com.elifpulukcu.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User save(User user);

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable);

    User getByUsername (String username);
}
