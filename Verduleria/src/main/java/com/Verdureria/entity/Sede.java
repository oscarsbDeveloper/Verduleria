package com.Verdureria.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sede")

public class Sede implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id_sede;
    private String ubicacion;
    private String nom_sede;

    public int getId_Sede() {
        return id_sede;
    }

    public void setId_Sede(int id_Sede) {
        this.id_sede = id_Sede;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNom_Sede() {
        return nom_sede;
    }

    public void setNom_Sede(String nom_Sede) {
        this.nom_sede = nom_Sede;
    }

     
}
