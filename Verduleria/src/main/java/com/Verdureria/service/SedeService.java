/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Verdureria.service;
import com.Verdureria.entity.Sede;
import com.Verdureria.repository.SedeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author madri
 */
@Service
public class SedeService implements ISedeService{
    
    //Autowired para la inyeccion de dependencias, en este caso Sede
    @Autowired
    private SedeRepository sedeRepository;

    @Override
    public List<Sede> listSede() {
        //Aqui devolvemos una lista de sede de sedeRepository.
        return (List<Sede>) sedeRepository.findAll();
    }
}
