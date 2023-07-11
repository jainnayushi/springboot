package com.ayushi.learn_springBoot.Components;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Developer {
    @Id
    private int devId;
    private String devName;
    private String devTech;

    @Override
    public String toString() {
        return "Developer{" +
                "devId=" + devId +
                ", devName='" + devName + '\'' +
                ", devTech='" + devTech + '\'' +
                '}';
    }

    public int getDevId() {
        return devId;
    }

    public void setDevId(int devId) {
        this.devId = devId;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevTech() {
        return devTech;
    }

    public void setDevTech(String devTech) {
        this.devTech = devTech;
    }
}
