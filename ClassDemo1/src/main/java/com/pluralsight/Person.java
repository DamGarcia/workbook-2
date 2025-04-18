package com.pluralsight;

public class Person {

    private String fullname;
    private int age;
    private String profession;

    // --- the constructor method is a blueprint for creating the object Person
    // --- describes how the Person would behave
    // ---
    public Person(String fullname, int age, String profession) {
        // special method called constructor
        this.fullname = fullname;
        this.age = age;
        this.profession = profession;
    }

    public String getFullname(){
        return this.fullname;
        }

    public void setFullname(String fullname){
        this.fullname = fullname;
        }

    public int getAge(){
        return this.age;
        }

    public void setAge(int age){
        this.age = age;
        }

    public String getProfession(){
        return this.profession;
        }

    public void setProfession(String profession){
        this.profession = profession;

        }
    }
