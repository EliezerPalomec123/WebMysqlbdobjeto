
package com.unsis.edu.entity;
//anotanciones de HIbernet

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="user")
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    
    private long id;
    @Column(name="name", length=50, nullable=true)
    private String nombre;
    
    @Column(name= "email", length=50, nullable=true)
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
