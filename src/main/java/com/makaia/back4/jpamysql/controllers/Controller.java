package com.makaia.back4.jpamysql.controllers;

import com.makaia.back4.jpamysql.dtos.CrearDTO;
import com.makaia.back4.jpamysql.entities.Mensaje;
import com.makaia.back4.jpamysql.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/mensaje")
public class Controller {
    private Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping()
    public Mensaje crearMensaje(@RequestBody CrearDTO dto) {
        return this.service.crear(dto);
    }

    @GetMapping()
    public List<Mensaje> listarMensaje(){
        return  this.service.listar();
    }
}
