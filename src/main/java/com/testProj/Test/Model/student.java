package com.testProj.Test.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class student {

    @Id
    private int rollno;
    private String name;
    private String city;
    private Date createddate;
    private Timestamp column1;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Timestamp getColumn1() {
        return column1;
    }

    public void setColumn1(Timestamp column1) {
        this.column1 = column1;
    }


}
