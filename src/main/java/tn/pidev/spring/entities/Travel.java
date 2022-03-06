package tn.pidev.spring.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Travel implements Serializable {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id ;
	@Temporal(TemporalType.DATE)
	private Date date ;
	private String destination ;
	private int duration ;
	private String objective ;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="travel")
	private List<FeedBack> feedBacks;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="travel")
	private List<Complaint> complaints;

}
