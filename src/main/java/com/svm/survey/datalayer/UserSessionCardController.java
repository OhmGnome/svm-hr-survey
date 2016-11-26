package com.svm.survey.datalayer;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.svm.survey.model.UserSessionCard;

@RestController
public class UserSessionCardController {
	
	@Autowired
	UserSessionCardRepository repo;

    @RequestMapping(value = "/userSessionCard/batch/save", method = RequestMethod.POST)
     ResponseEntity<List<UserSessionCard>> save(@RequestBody List<UserSessionCard> data) {
    	List<UserSessionCard> cards = (List<UserSessionCard>) repo.save(data);
    	return new ResponseEntity<List<UserSessionCard>>(cards, HttpStatus.OK);
    }
}
