package com.ps.demopractica.controller;

import com.ps.demopractica.model.Prestamo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prestamo")
public class PrestamoController {

    @GetMapping
    public List<Prestamo> getAllPrestamo(){
        return  null;
    }

}
