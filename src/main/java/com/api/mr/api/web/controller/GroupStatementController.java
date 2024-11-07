package com.api.mr.api.web.controller;

import com.api.mr.api.web.model.GroupStatement;
import com.api.mr.api.web.service.GroupStatementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/v1/statements")
@RestController
@RequiredArgsConstructor
public class GroupStatementController {
    private final GroupStatementService groupStatementService;

    @GetMapping(path = "/all")
    public List<GroupStatement> findAll() {
        return groupStatementService.getStatements();
    }
}
