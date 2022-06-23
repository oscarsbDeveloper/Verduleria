/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Verdureria.entity;

/**
 *
 * @author madri
 */

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Definimos de que tipo es nuestra clase, en este caso una entidad.
@Entity
//Definir la tabla que hay en la bd en este caso se llama personas.
@Table(name = "verduleria")
public class Verduleria implements Serializable{
    
    //Creamos los atributos que asemejen la tabla (persona).	
    //Definimos la llame primaria con @id
    @Id
	
    //Con esta valor decimos que nuestra id va a obtener un valor autoincremental.
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    private int cantidad;
    private String tipo;
    private double precio;

    //Creamos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
            
}
