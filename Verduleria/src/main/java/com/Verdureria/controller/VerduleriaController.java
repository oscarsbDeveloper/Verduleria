/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Verdureria.controller;

import com.Verdureria.entity.Verduleria;
import com.Verdureria.service.IVerduleriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author madri
 */

//Definimos de que tipo de objeto va a ser nuestra clase
@Controller
public class VerduleriaController {

    //Hacemos inyeccion de dependencias
    @Autowired
    //El controller utiliza el servicio, en este caso personaService
    private IVerduleriaService verduleriaService;

    /*El GetMapping crea la ruta, entonces al escribir localhost/persona 
    nos ejecuta el metodo
     */
    @GetMapping("/verduleria")

    //Puede ser cualquier nombre en vez de INDEX
    /*Aqui le pasamos un objeto de tipo model, ya que le pasamos informacion
    que puede ser sustituida ya que proviene de la bd, entonces la forma en la
    que le pasamos esos valores es por el objeto de tipo model*/
    public String index(Model model) {

        /*Aqui creamos una lista y le pasamos la informacion por medio del metodo
          getAllPersona de nuestra clase interface.*/
        List<Verduleria> listaVerduleria = verduleriaService.getAllVerdura();

        /*Aqui, en nuestro html donde se encuentre la palabra titulo lo va a 
          sustituir por tabla verduleria*/
        model.addAttribute("titulo", "Tabla Verduleria");

        /*Aqui, en nuestro html donde se encuentre la palabra verduleria lo va a 
         sustituir por la listaVerduleria*/
        model.addAttribute("verduleria", listaVerduleria);

        //Aqui retornamos un html que se llama verduleria.
        return "verduleria";
    }
}
