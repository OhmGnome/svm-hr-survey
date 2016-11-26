package com.svm.survey.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.svm.survey.model.Auth;
import com.svm.survey.model.Card;
import com.svm.survey.model.Session;
import com.svm.survey.model.SessionCard;
import com.svm.survey.model.User;
import com.svm.survey.model.UserSession;
import com.svm.survey.model.UserSessionCard;

@Configuration
public class RestMVCConfig extends RepositoryRestMvcConfiguration {
   @Override
   protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
       config.exposeIdsFor(Auth.class, User.class, Card.class, Session.class, SessionCard.class, UserSession.class, UserSessionCard.class);
   }
}