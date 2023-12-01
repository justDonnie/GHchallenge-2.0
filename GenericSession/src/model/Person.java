package model;

import enumPack.Gender;

public class Person {
    private Long id;
    private String name;
    private Integer age;
    private Gender gender;

    public Person(Long id, String name, Integer age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return " \n Person- " +
                " id: " + id +
                " name: " + name +
                "\n age: " + age +
                " gender: " + gender;
    }
}
