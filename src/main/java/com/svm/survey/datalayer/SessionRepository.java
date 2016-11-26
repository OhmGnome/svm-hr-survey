package com.svm.survey.datalayer;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.svm.survey.model.Session;

@RepositoryRestResource(collectionResourceRel = "session", path = "session")
public interface SessionRepository extends CrudRepository<Session, Long>{
	
	Session findById(@Param("id") Long id);

	List<Session> findByStartDateAfter(@Param("date") Date date);
	List<Session> findByStartDateBefore(@Param("date") Date date);
	List<Session> findByStartDateBetween(@Param("start") Date start, @Param("end") Date end);
	
	List<Session> findByLocationLike(@Param("location") String location);
	List<Session> findByIsActive(@Param("isActive") Boolean isActive);
	List<Session> findByLocationLikeAndIsActive(@Param("location") String location, @Param("isActive") Boolean isActive);
	
}
