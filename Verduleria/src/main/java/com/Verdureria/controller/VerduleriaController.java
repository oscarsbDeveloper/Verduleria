/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Verdureria.controller;

import com.Verdureria.entity.Sede;
import com.Verdureria.entity.Verduleria;
import com.Verdureria.service.ISedeService;
import com.Verdureria.service.IVerduleriaService;
import com.Verdureria.service.SedeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

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
    
    //Hacemos inyeccion de dependencias
    @Autowired
    //El controller utiliza el servicio, en este caso personaService
    private ISedeService sedeService;

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
    
    @GetMapping("/verduleriaN")
    //Nuevo metodo para crear una nueva verdura
    public String crearVerduleria(Model model){
        
        List<Sede> listaSedes = sedeService.listSede();        
        //Aqui hay que crear un objeto nuevo para nuestro html
        model.addAttribute("verduleria", new Verduleria());       
        //Aqui ocupamos jalar algun foreign key de la tabla sedes
        model.addAttribute("sedes", listaSedes);
        return "crear";
    }
    
    @GetMapping("/save")
    public String guardarVerdura(@ModelAttribute Verduleria verduleria){
        //Con esto lo guardo en la bd
        verduleriaService.saveVerduleria(verduleria);
        
        //Aqui quiero que me redirija a otro get mapping
        return "redirect:/verduleria";
    }
    
    @GetMapping("/editVerduleria/{id}")
    public String editarVerduleria(@PathVariable("id") int idVerduleria, Model model){
        Verduleria verduleria = verduleriaService.getVerduleriaById(idVerduleria);
        List<Sede> listaSede = sedeService.listSede();
        model.addAttribute("verduleria", verduleria);
        model.addAttribute("sedes", listaSede);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarVerdura(@PathVariable("id")Integer idVerdura){
        verduleriaService.delete(idVerdura);
        return "redirect:/verduleria";
    } 
}

