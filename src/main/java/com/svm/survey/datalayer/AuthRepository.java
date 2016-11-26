package com.svm.survey.datalayer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.svm.survey.model.Auth;

@RepositoryRestResource(collectionResourceRel = "auth", path = "auth")
public interface AuthRepository extends CrudRepository<Auth, Long>{
	
	Auth findById(@Param("id") Long id);
	List<Auth> findByUserId(@Param("id") Long id);
	List<Auth> findBySessionId(@Param("id") Long id);
	List<Auth> findByRole(@Param("role") String role);
	List<Auth> findByRoleLike(@Param("role") String role);
}
