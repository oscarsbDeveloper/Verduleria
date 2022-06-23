/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Verdureria.repository;

import com.Verdureria.entity.Sede;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author madri
 */
@Repository
public interface SedeRepository extends CrudRepository<Sede,Integer>{
    
}
