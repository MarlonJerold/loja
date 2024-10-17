package com.loja.loja.adm;


import com.loja.loja.person.Person;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends Person {

    private String role;

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}
