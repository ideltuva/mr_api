package com.api.mr.api.web.service;

import com.api.mr.api.web.model.GroupStatement;
import com.api.mr.api.web.repository.GroupStatementRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
@Slf4j
public class GroupStatementService {

    private final GroupStatementRepository groupStatementRepository;

    public List<GroupStatement> getStatements() {
        return StreamSupport.stream(groupStatementRepository.findAll().spliterator(), false)
                .toList();
    }
}
