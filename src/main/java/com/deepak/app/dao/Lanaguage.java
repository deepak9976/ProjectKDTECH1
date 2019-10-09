package com.deepak.app.dao;


import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Lanaguage {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    public Lanaguage(){


    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    public boolean equals(Object ojb){
        if(this == ojb)
            return true;
        if(!(ojb instanceof Lanaguage))
            return false;
        final Lanaguage other = (Lanaguage) ojb;
        if (name == null) {
            if (other.name != null)
                return false;

        }
        else if (!name.equals(other.name))
            return false;

        return true;
    }

}
