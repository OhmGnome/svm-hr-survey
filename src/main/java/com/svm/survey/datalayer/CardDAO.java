package com.svm.survey.datalayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.svm.survey.model.Card;

@Repository
@Transactional
public class CardDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public boolean cardExists(){
		String sql = "FROM Card";
		Query query = entityManager.createQuery(sql);
		List result = query.setMaxResults(1).getResultList();
		
		if (result.isEmpty()) return false;
		else return true;
	}

	public void save(List<Card> cards) {
		for(Card card : cards){
			entityManager.persist(card);
		}
	}
}
