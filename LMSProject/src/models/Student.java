package models;

import enumClass.Gender;

public class Student {

    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private String email;
    private String password;
    private Gender gender;
    private static Long idCounter = 0L;

    public Student(String name, String lastName, Integer age, String email, String password, Gender gender) {
        this.id = generateUniqueId();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }
    private synchronized Long generateUniqueId(){
        idCounter++;
        return idCounter;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "\n Student- " +
                "\nid: " + id +
                "\n name: " + name +
                "\n lastName: " + lastName +
                "\n gender: " + gender +
                "\n email: " + email;
    }
}
