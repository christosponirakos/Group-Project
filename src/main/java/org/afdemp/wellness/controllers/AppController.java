/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.controllers;

import java.util.List;
import org.afdemp.wellness.entities.Product;
import org.afdemp.wellness.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Chris
 */
@Controller
@RequestMapping("/")
public class AppController {
    //private String title = 
    
    
    @Autowired
    IProductService productService;
    
    
    @RequestMapping(value = {"/nutrition"}, method = RequestMethod.GET)
    public String nutrition(ModelMap view){
        List<Product> nutrition = productService.findNutritions();
        view.addAttribute("nutrition", nutrition);
        return "nutrition";
        
        
    }
    
}
