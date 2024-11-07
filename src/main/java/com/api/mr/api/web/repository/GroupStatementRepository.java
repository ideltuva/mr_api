package com.api.mr.api.web.repository;

import com.api.mr.api.web.model.GroupStatement;
import com.api.mr.api.web.model.GroupStatementId;
import org.springframework.data.repository.CrudRepository;

public interface GroupStatementRepository extends CrudRepository<GroupStatement, GroupStatementId> {
}
