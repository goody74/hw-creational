package ru.netology;

import java.util.OptionalInt;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder(){};
    public PersonBuilder setName(String name) {
        this.name=name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname=surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age<1){
            throw  new IllegalArgumentException("Age must be >0");
        }
        this.age=age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address=address;
        return this;
    }


    public Person build() {
        if (name== null || surname==null){
            throw  new IllegalArgumentException("Name and Surname needed!");
        }
        Person person =new Person(name, surname,age);
        person.setAddress(address);
        return person;
    }

}
