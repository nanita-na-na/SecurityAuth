package com.cursor.demoSecurity.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue

    private Long id;
    private String firstname;
    private String lastname;
    private String username;
    private int age;
    private String password;
}
