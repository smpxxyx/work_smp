package com.erp.pojo;

public class Result {
    private Integer id;
    private String realname;
    private String name;
    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", realname='" + realname + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
