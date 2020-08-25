package com.elifpulukcu.issuemanagement.repository;

import com.elifpulukcu.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository <Issue, Long> {


}
