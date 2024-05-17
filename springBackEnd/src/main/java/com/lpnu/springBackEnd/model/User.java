package com.lpnu.springBackEnd.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column( length = 40)
    private String firstName;

    @Column(name = "last_name", length = 40)
    private String lastName;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "user_name", length = 40)
    private String userName;

    @Column( length = 50, unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

}
