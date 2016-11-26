package com.svm.survey.cron;

import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.svm.survey.datalayer.SessionRepository;
import com.svm.survey.model.Session;

@Component
public class SessionDeactivator {

	@Autowired
	SessionRepository sessionRepository;

	private Timer timer;
	 private final long DAY = 86400000;

	@PostConstruct
	public void init() {
		timer = new Timer();
		timer.schedule(new Timeslip(), DAY);
	}

	private class Timeslip extends TimerTask {
		public void run() {
			Date date = new Date();
			try {
				List<Session> sessions = (List<Session>) sessionRepository.findAll();
				for (Session session : sessions) {
					if (session.getEndDate() != null) {
						if (session.getEndDate().compareTo(date) < 0) {
							session.setIsActive(false);
							sessionRepository.save(session);
						}
					}
				}
				timer.schedule(new Timeslip(), DAY);
			} catch (Exception e) {
				e.printStackTrace();
				timer.schedule(new Timeslip(), DAY);
			}
		}
	}

}