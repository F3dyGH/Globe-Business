package tn.globebusiness.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Employee implements Serializable {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    private String lastName;

	    @Temporal(TemporalType.DATE)
	    private Date birthday;

	    private String email;

	    private Long phone;
	    private String image;
	   

	   /* @JsonBackReference(value = "employee_profession")
	    @ManyToOne
	    @JoinColumn(name = "profession_id")
	    private Profession profession;

	    @JsonBackReference(value = "employee_company")
	    @ManyToOne
	    @JoinColumn(name = "company_id")
	    private Company company;

	    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "employee")
	    private List<Post> posts = new ArrayList<>();*/

	}

