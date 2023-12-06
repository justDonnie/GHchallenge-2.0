package models;

import enumClass.Gender;
import service.ReaderService;

import java.util.List;

public class Reader {
    private Long ID;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Gender gender;

    public Reader(Long ID, String fullName, String email, String phoneNumber, Gender gender) {
        this.ID = ID;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nReader- " +
                "ID: " + ID +
                " fullName: " + fullName + '\'' +
                " email: " + email + '\'' +
                " phoneNumber: " + phoneNumber + '\'' +
                " gender: " + gender;
    }
}
