/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Verdureria.service;

import com.Verdureria.entity.Sede;
import java.util.List;

/*
    Aqui implementamos lo metodos que vamos a utilizar para 
    hacer las consultas a nuestra base de datos
 */
public interface ISedeService {

    public List<Sede> listSede();
}
