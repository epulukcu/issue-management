package com.elifpulukcu.issuemanagement.service;

import com.elifpulukcu.issuemanagement.entity.Project;
import com.elifpulukcu.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    Project getById(Long id);

    List<Project> getByProjectCode (String projectCode);

    List<Project> getByProjectCodeContains (String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete (Project project);
}
