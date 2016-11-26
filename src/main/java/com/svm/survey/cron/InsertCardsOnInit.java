package com.svm.survey.cron;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.PostConstruct;
import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.svm.survey.datalayer.CardDAO;
import com.svm.survey.model.Card;

@Component
public class InsertCardsOnInit {

	@Autowired
	private CardDAO cardDAO;

	private Timer timer;
	private List<Card> cards = new ArrayList<>();

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
				if (!cardDAO.cardExists()) {
					makeCards();
					cardDAO.save(cards);
				}
			} catch (NoResultException e) {
				makeCards();
				cardDAO.save(cards);
			} catch (Exception e) {
			}
		}
	}

	private void makeCards() {
		Card card = new Card();
		card.setLetter("E");
		card.setGreen("I feel appreciated and valued");
		card.setRed("My accomplishments and sacrifices are not apprechated or valued");
		cards.add(card);

		card = new Card();
		card.setLetter("E");
		card.setGreen("I get a lot of training and skill development- I'm developing new capabilities");
		card.setRed("I get a lot of training and skill development - I'm developing new capabilities");
		cards.add(card);

		card = new Card();
		card.setLetter("E");
		card.setGreen("I love the flexibility");
		card.setRed("This place is too ridgid and in flexible to meet my needs");
		cards.add(card);

		card = new Card();
		card.setLetter("W");
		card.setGreen("I am dispatched to locations that are close together");
		card.setRed("I am dispatched to locations that are too far apart to get the amount of work done in time");
		cards.add(card);

		card = new Card();
		card.setLetter("E");
		card.setGreen("It's not fun here");
		card.setRed("It's Fun Here");
		cards.add(card);

		card = new Card();
		card.setLetter("E");
		card.setGreen("I am thanked and praised for my work");
		card.setRed("I am not thanked or praised for my work");
		cards.add(card);

		card = new Card();
		card.setLetter("E");
		card.setGreen("I have a network of people I can turn to if I need help");
		card.setRed("I have no one to go to if I need help");
		cards.add(card);

		card = new Card();
		card.setLetter("E");
		card.setGreen("My work schedule and/or work arrangements are not flexible");
		card.setRed("I can adjust my work schedule and/or work arrangements to meet my needs");
		cards.add(card);

		card = new Card();
		card.setLetter("E");
		card.setGreen("I have a great balance between work and my personal life");
		card.setRed("I feel like I live at work");
		cards.add(card);

		card = new Card();
		card.setLetter("E");
		card.setGreen("We have great teamwork- people pull together");
		card.setRed("We have no teamwork - people compete against each other");
		cards.add(card);

		card = new Card();
		card.setLetter("E");
		card.setGreen("New ideas are valued and supported");
		card.setRed("We criticize and beat up new ideas");
		cards.add(card);

		card = new Card();
		card.setLetter("E");
		card.setGreen("I can make a positive impact here");
		card.setRed("It's very difficult to make a positive impact here");
		cards.add(card);

		card = new Card();
		card.setLetter("E");
		card.setGreen("We laugh a lot around here");
		card.setRed("People never laugh around here");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("My salary is competitive in the marketplace");
		card.setRed("Other organizations are paying a lot more for people with my capabilities");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("The organization's real values are consistent with my personal values");
		card.setRed("The organization's real values are significantly different from what I value");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("I get to use the hottest technology - I'm on the cutting edge");
		card.setRed("The technology used here does not allow me to perform at a satisfactorily level");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("We have great company benefits - my neeeds and/or my family needs are met");
		card.setRed("The company benefits do not cover my needs and/or my family needs");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("Working here has great financial payoffs (bonus, stock options)");
		card.setRed("Working here does not have great financial payoffs (bonus, stock options)");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("I like the job security here - it feels good to have stability");
		card.setRed("My job is not secure - I'm not sure if i'll be needed here in the future");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("This organization cares about its customers, each individual employee, as well as making money");
		card.setRed("This organization only cares about making money");
		cards.add(card);

		card = new Card();
		card.setLetter("M");
		card.setGreen("My manager and I have values which allow us to work very well together");
		card.setRed("What my manager values is causing significant problems between us");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("I believe in the orgaization's reputation, products, and services");
		card.setRed("I'm embarrassed by the organization's reputation, products, and/or services");
		cards.add(card);

		card = new Card();
		card.setLetter("M");
		card.setGreen("My manager gets the facts before making judgements or taking action");
		card.setRed("My manager is quick to blame and take action before finding out the facts");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("The organization's mission and purpose does nothing to inspire me");
		card.setRed("The organization's mission and purpose is exciting and inspires me to do my best");
		cards.add(card);

		card = new Card();
		card.setLetter("W");
		card.setGreen("My job is challenging and therefore entertaining");
		card.setRed("My job is not challenging and therefore boring");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("I can see a number of great career opportunities here");
		card.setRed("Career opportunities are very limited here");
		cards.add(card);

		card = new Card();
		card.setLetter("W");
		card.setGreen("I am given substantial responsibility");
		card.setRed("I am not given enough responsibility here");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("Our organization is on the right track - we will be very competitive");
		card.setRed("Our organization is not on track - I'm not sure if we'll survive");
		cards.add(card);

		card = new Card();
		card.setLetter("W");
		card.setGreen("I have the necessary resources to do a good job");
		card.setRed("I don't have the resourceds I need to do a good job");
		cards.add(card);

		card = new Card();
		card.setLetter("O");
		card.setGreen("My salary is fair compared to what others are paid within the organization");
		card.setRed("My salary is too low compared to what others are paid within the organization");
		cards.add(card);

		card = new Card();
		card.setLetter("W");
		card.setGreen("My job capitalizes on my strengths and capabilities");
		card.setRed("My strengths and capabilities are not utilized here");
		cards.add(card);

		card = new Card();
		card.setLetter("W");
		card.setGreen("The work I do day-to-day is what I expected to be doing");
		card.setRed("The work I do day-to-day is very different from what I want to be doing");
		cards.add(card);

		card = new Card();
		card.setLetter("W");
		card.setGreen("I love to do what I'm doing");
		card.setRed("My day is full of stuff I hate to do");
		cards.add(card);

	}
}