package com.myProject.mentoriaHB.estudoDeCaso.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TB_People")
public class People implements Serializable {
    static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false,length = 20)
    private String name;

    @Column(name = "sobrenome", nullable = false, length = 20)
    private  String surname;

    @Column(name="Idade", nullable = false)
    private int age;

    public People(){}

    public People(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " Me chamo " + name + " " + surname + " e tenho "+ age +" anos.";
    }
}
