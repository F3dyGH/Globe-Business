package tn.pidev.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Entity
@Data
public class Like implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLike;
	@ManyToOne
	@JoinColumn(name="idEmployee")
	private Employee employee;
	@ManyToOne
	@JoinColumn(name="idPost")
	private Post post;
	
}
