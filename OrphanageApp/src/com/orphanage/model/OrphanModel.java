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
    
    private short orphanID;
    private String firstName;
    private String lastName;
    private short age;
    private short weight;
    private short height;
    private String gender;
    private String bloodGroup;
    


    public OrphanModel() {
    }

    public OrphanModel(short orphanID, String firstName, String lastName, short age, short weight, short height, String gender, String bloodGroup) {
        this.orphanID = orphanID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
    }

    
    public short getOrphanID() {
        return orphanID;
    }

    public void setOrphanID(short orphanID) {
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

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
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



    