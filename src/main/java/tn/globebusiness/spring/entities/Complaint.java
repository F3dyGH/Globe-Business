package tn.globebusiness.spring.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Complaint {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idC")
	private Long idC;
	private String title;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	Date complaintDateAndTime;
	/*@Temporal(TemporalType.TIME)
	Date feedbackHour;*/
	
	/*@ManyToOne
	@JsonIgnore
	private Company company;*/

}
