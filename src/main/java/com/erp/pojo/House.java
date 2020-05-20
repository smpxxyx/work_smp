package com.erp.pojo;

public class House {
    private Integer id;
    private String ldxx;
    private Integer totals;
    private Integer telphone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLdxx() {
        return ldxx;
    }

    public void setLdxx(String ldxx) {
        this.ldxx = ldxx;
    }

    public Integer getTotals() {
        return totals;
    }

    public void setTotals(Integer totals) {
        this.totals = totals;
    }

    public Integer getTelphone() {
        return telphone;
    }

    public void setTelphone(Integer telphone) {
        this.telphone = telphone;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", ldxx='" + ldxx + '\'' +
                ", totals=" + totals +
                ", telphone=" + telphone +
                '}';
    }
}
