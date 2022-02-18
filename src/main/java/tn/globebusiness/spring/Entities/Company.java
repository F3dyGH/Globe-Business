package tn.globebusiness.spring.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Long phone;

    @Column(name = "image")
    private String image;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domain_id")
    private Domain domain;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();

}