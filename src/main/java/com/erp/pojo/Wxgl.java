package com.erp.pojo;

public class Wxgl {
    private Integer id;
    private String number;
    private String name;
    private String bxrq;
    private String xlsj;
    private String xlfy;

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

    public String getBxrq() {
        return bxrq;
    }

    public void setBxrq(String bxrq) {
        this.bxrq = bxrq;
    }

    public String getXlsj() {
        return xlsj;
    }

    public void setXlsj(String xlsj) {
        this.xlsj = xlsj;
    }

    public String getXlfy() {
        return xlfy;
    }

    public void setXlfy(String xlfy) {
        this.xlfy = xlfy;
    }

    @Override
    public String toString() {
        return "Wxgl{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", bxrq='" + bxrq + '\'' +
                ", xlsj='" + xlsj + '\'' +
                ", xlfy='" + xlfy + '\'' +
                '}';
    }
}
