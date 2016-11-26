package com.svm.survey.datalayer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.svm.survey.model.SessionCard;

@RepositoryRestResource(collectionResourceRel = "sessionCard", path = "sessionCard")
interface SessionCardRepository extends CrudRepository<SessionCard, Long>{
	
	SessionCard findById(@Param("id") Long id);
	List<SessionCard> findBySessionId(@Param("id") Long id);
	List<SessionCard> findByCardId(@Param("id") Long id);
	
}
