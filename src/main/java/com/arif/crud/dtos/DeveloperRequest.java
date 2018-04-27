package com.arif.crud.dtos;

import java.io.Serializable;

/**
 * @author Arif Pehlivan
 */
public class DeveloperRequest implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
