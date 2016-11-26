package com.svm.survey.cron;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.PostConstruct;
import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.svm.survey.datalayer.AuthRepository;
import com.svm.survey.datalayer.UserRepository;
import com.svm.survey.model.Auth;
import com.svm.survey.model.User;

@Component
public class InsertAdminOnInit {

	@Autowired
	AuthRepository authRepository;
	@Autowired
	UserRepository userRepository;

	private Timer timer;

	@PostConstruct
	public void init() {
		timer = new Timer();
		long seconds_18 = 18000;
		long minute = 60000;
		timer.schedule(new Timeslip(), seconds_18);
		timer.schedule(new Timeslip(), minute);
	}

	private class Timeslip extends TimerTask {
		public void run() {
			try {
				List<Auth> admins = new ArrayList<Auth>();
				admins = authRepository.findByRole("admin");
				if (admins.size() < 1) {
					makeDefault();
				}
			} catch (NoResultException e) {
				makeDefault();
			} catch (Exception e) {
			}
		}
	}

	private void makeDefault() {
		Auth auth = new Auth();
		auth.setRole("admin");
		auth.setPassword("augury");

		List<User> adminUserExists = userRepository.findByUsername("axxis");
		if (adminUserExists.size() > 0) {
			auth.setUserId(adminUserExists.get(0).getId());
		} else {
			User user = new User();
			user.setUsername("manager");
			user = userRepository.save(user);
			auth.setUserId(user.getId());
		}
		authRepository.save(auth);
	}

}