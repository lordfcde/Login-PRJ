/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author vinhh
 */
public class DtoHuman {
    private int humanId;
    private String humanName;
    private Date dob;
    private boolean gender;
    private DtoHumanType type;
    private String userHuman;
    private String passHuman;
    private String role;
    private boolean active; 

    public DtoHuman() {
    }

    public DtoHuman(int humanId, String humanName, Date dob, boolean gender, DtoHumanType type, String userHuman, String passHuman, String role, boolean active) {
        this.humanId = humanId;
        this.humanName = humanName;
        this.dob = dob;
        this.gender = gender;
        this.type = type;
        this.userHuman = userHuman;
        this.passHuman = passHuman;
        this.role = role;
        this.active = active;
    }

    public int getHumanId() {
        return humanId;
    }

    public void setHumanId(int humanId) {
        this.humanId = humanId;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public DtoHumanType getType() {
        return type;
    }

    public void setType(DtoHumanType type) {
        this.type = type;
    }

    public String getUserHuman() {
        return userHuman;
    }

    public void setUserHuman(String userHuman) {
        this.userHuman = userHuman;
    }

    public String getPassHuman() {
        return passHuman;
    }

    public void setPassHuman(String passHuman) {
        this.passHuman = passHuman;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
