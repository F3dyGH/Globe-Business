package tn.globebusiness.spring.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="complaint")
public class Complaint {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idC",nullable = false)
	private Long idC;
	@Column(name ="title")
	private String title;
	@Column(name ="description")
	private String description;
	@Temporal(TemporalType.DATE)
	Date feedbackDate;
	@Temporal(TemporalType.TIME)
	Date feedbackHour;

}
