//Alien class with aid,aname,tech properties and their getters setters
//Class which is base for DB and for getting and storing data in this format

package com.ayushi.learn_springBoot.Components;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Alien {
    @Id
    private int aid;
    private String aname;
    private String lang;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
