package com.svm.survey.datalayer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.svm.survey.model.UserSessionCard;

@RepositoryRestResource(collectionResourceRel = "userSessionCard", path = "userSessionCard")
interface UserSessionCardRepository extends CrudRepository<UserSessionCard, Long>{
	
	UserSessionCard findById(@Param("id") Long id);
	List<UserSessionCard> findByUserSessionId(@Param("id") Long id);
	List<UserSessionCard> findByCardId(@Param("id") Long id);
	List<UserSessionCard> findByUserSessionIdIn(@Param("ids") Long[] ids);
	
}
