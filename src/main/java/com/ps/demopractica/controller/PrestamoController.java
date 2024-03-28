package com.ps.demopractica.controller;

import com.ps.demopractica.model.Prestamo;
import com.ps.demopractica.service.IPrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/prestamo")
public class PrestamoController {
    @Autowired
    private IPrestamoService iPrestamoService;

    @GetMapping("/{id}") //id del cliente que quieres ver todos los prestamos
    public  ResponseEntity<List<Prestamo>> allPrestamosByClient(@PathVariable Long id){
        List<Prestamo> listPrestamo = iPrestamoService.findAllPrestamo(id);
        return  ResponseEntity.ok(listPrestamo);
    }

    @GetMapping
    public  ResponseEntity<List<Prestamo>> allPrestamos(){
        List<Prestamo> allList = iPrestamoService.allPrestamos();
        return  ResponseEntity.ok(allList);
    }



    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Prestamo> createPrestamo(@RequestBody Prestamo prestamo){
        Prestamo createPrestamo = iPrestamoService.createPrestamo(prestamo);
        return  new ResponseEntity<>(createPrestamo, HttpStatus.CREATED);
    }

    @PutMapping
    public  ResponseEntity<Prestamo> updatePrestamo(@RequestBody Prestamo prestamo){
        Prestamo update = iPrestamoService.updatePrestamo(prestamo);
        return  ResponseEntity.ok(update);
    }



    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deletePrestamo(@PathVariable Long id){
        iPrestamoService.deletePrestamo(id);
        return  ResponseEntity.noContent().build();
    }

}
