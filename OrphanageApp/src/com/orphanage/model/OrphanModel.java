/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.orphanage.model;

/**
 *
 * @author victus
 */
public class OrphanModel {
    
    private int orphanID;
    private String firstName;
    private String lastName;
    private int age;
    private int weight;
    private int height;
    private String gender;
    private String bloodGroup;
    


    public OrphanModel() {
    }

    public OrphanModel(int orphanID, String firstName, String lastName, int age, int weight, int height, String gender, String bloodGroup) {
        this.orphanID = orphanID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
    }

    public int getOrphanID() {
        return orphanID;
    }

    public void setOrphanID(int orphanID) {
        this.orphanID = orphanID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    

}

    