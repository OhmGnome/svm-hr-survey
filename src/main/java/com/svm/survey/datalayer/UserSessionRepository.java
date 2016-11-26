package com.svm.survey.datalayer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.svm.survey.model.Card;
import com.svm.survey.model.UserSession;

@RepositoryRestResource(collectionResourceRel = "userSession", path = "userSession")
interface UserSessionRepository extends CrudRepository<UserSession, Long>{
	
	UserSession findById(@Param("id") Long id);
	List<UserSession> findByUserIdAndSessionId(@Param("userId") Long userId, @Param("sessionId") Long sessionId);
	List<UserSession> findByUserId(@Param("id") Long id);
	List<UserSession> findBySessionId(@Param("id") Long id);
}
