package com.erp.pojo;

public class Money {
    private Integer id;
    private String number;
    private String name;
    private Integer area;
    private Integer cjje;
    private String statue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getCjje() {
        return cjje;
    }

    public void setCjje(Integer cjje) {
        this.cjje = cjje;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    @Override
    public String toString() {
        return "Money{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", cjje=" + cjje +
                ", statue='" + statue + '\'' +
                '}';
    }
}
