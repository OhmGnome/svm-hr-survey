package com.svm.survey.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "userSessionCard", catalog="ad_1985960950d7006", uniqueConstraints=@UniqueConstraint(columnNames={"userSessionId", "cardId"}))
public class UserSessionCard implements java.io.Serializable {

	private Long id;
	private Long userSessionId;
	private Long cardId;
	private Boolean isTop15;
	private Boolean isGreen;
	private Boolean isMoreCritical;

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "userSessionId")
	public Long getUserSessionId() {
		return userSessionId;
	}

	public void setUserSessionId(Long userSessionId) {
		this.userSessionId = userSessionId;
	}

	@Column(name = "cardId")
	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	@Column(name = "isTop15")
	public Boolean getIsTop15() {
		return isTop15;
	}

	public void setIsTop15(Boolean isTop15) {
		this.isTop15 = isTop15;
	}

	@Column(name = "isGreen")
	public Boolean getIsGreen() {
		return isGreen;
	}

	public void setIsGreen(Boolean isGreen) {
		this.isGreen = isGreen;
	}

	public Boolean getIsMoreCritical() {
		return isMoreCritical;
	}

	public void setIsMoreCritical(Boolean isMoreCritical) {
		this.isMoreCritical = isMoreCritical;
	}
	
}