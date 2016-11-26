package com.svm.survey.datalayer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.svm.survey.model.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends CrudRepository<User, Long>{
	
	User findById(@Param("id") Long id);
	List<User> findByUsername(@Param("username") String username);
	List<User> findByUsernameLike(@Param("username") String username);
	List<User> findByEmail(@Param("email") String email);
	List<User> findByEmailLike(@Param("email") String email);
}
