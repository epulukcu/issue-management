package com.elifpulukcu.issuemanagement.service;

import com.elifpulukcu.issuemanagement.dto.IssueDto;
import com.elifpulukcu.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);
}
