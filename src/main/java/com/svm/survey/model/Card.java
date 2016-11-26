package com.svm.survey.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "card", catalog="ad_1985960950d7006")
public class Card implements java.io.Serializable {

	private Long id;
	private String green;
	private String red;
	private String letter;

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "letter")
	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	@Column(name = "green")
	public String getGreen() {
		return green;
	}

	public void setGreen(String green) {
		this.green = green;
	}

	@Column(name = "red")
	public String getRed() {
		return red;
	}

	public void setRed(String red) {
		this.red = red;
	}

}