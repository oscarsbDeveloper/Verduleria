/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Verdureria.service;

import com.Verdureria.entity.Verduleria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Verdureria.repository.VerduleriaRepository;

/**
 *
 * @author madri
 */
//Le decimos de que es el tipo de clase que va implementar en este caso Servicio
@Service

//Implementamos IPersonaService
//Este implements es una clase implementaria, osea que tiene una
//o mas interfaces.
public class VerduleriaService implements IVerduleriaService {
    
    //Autowired para hacer inyeccion de dependencias. 
    @Autowired
    //Inyectamos la clase de personaRepository
    private VerduleriaRepository verduleriaRepository;

    //Aqui nada mas generamos todos los metodos abstractos.
    @Override
    public List<Verduleria> getAllVerdura() {
        //Aqui devolvemos una lista de personas de personaRepository.
        return (List<Verduleria>) verduleriaRepository.findAll();
    }

    @Override
    public Verduleria getVerduleriaById(Integer id) {
        //Vamos a  devolver el id de la persona o sino nulo
        return verduleriaRepository.findById(id).orElse(null);
    }

    //==========================================================================
    //Estos no devuelven nada porque son de tipo void ==========================
    //==========================================================================
    @Override
    public void saveVerduleria(Verduleria verduleria) {
        //Para guardar la verdura, fruta o vegetal
        verduleriaRepository.save(verduleria);
    }

    @Override
    public void delete(Integer id) {
        //Eliminamos por id
        verduleriaRepository.deleteById(id);
    }

}
