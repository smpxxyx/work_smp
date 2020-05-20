package com.erp.pojo;

public class Zhxx {
    private Integer id;
    private String name;
    private Integer gender;
    private Integer age;
    private String loudong;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLoudong() {
        return loudong;
    }

    public void setLoudong(String loudong) {
        this.loudong = loudong;
    }

    @Override
    public String toString() {
        return "Zhxx{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", loudong='" + loudong + '\'' +
                '}';
    }
}
