package tn.globebusiness.spring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    private String email;

    private Long phone;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String image;

    @JsonBackReference(value = "employee_profession")
    @ManyToOne
    @JoinColumn(name = "profession_id")
    private Profession profession;

    @JsonBackReference(value = "employee_company")
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "employee")
    private List<Post> posts = new ArrayList<>();
    
    @OneToOne(mappedBy="employee")
    private Travel travel;

}