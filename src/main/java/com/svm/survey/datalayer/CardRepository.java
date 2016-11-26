package com.svm.survey.datalayer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.svm.survey.model.Card;

@RepositoryRestResource(collectionResourceRel = "card", path = "card")
interface CardRepository extends CrudRepository<Card, Long>{
	
	Card findById(@Param("id") Long id);
	Card findByLetter(@Param("letter") String letter);
	List<Card> findByGreenLike(@Param("card") String card);
	List<Card> findByRedLike(@Param("card") String card);
	List<Card> findByIdIn(@Param("ids") Long[] ids);	
}
