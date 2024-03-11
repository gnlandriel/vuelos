package com.codeki.vuelosApi.controller;

import com.codeki.vuelosApi.model.Vuelo;
import com.codeki.vuelosApi.services.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {
    @Autowired
    private VueloService vueloService;

    @PostMapping("/guardar")
    public void guardarVuelo(@RequestBody Vuelo vuelo){
        vueloService.crearVuelo(vuelo);
    }

    @GetMapping("")
    public Vuelo obtenerVuelo() {
        return vueloService.mostrarVuelo();
    }

    @GetMapping("/todos")
    public List<Vuelo> obtenerTodosVuelos() {
        return vueloService.mostrarTodosVuelos();
    }

    @GetMapping("/{id}")
    public Vuelo buscarVueloXId(@PathVariable Long id) {
        return vueloService.buscarVueloXId(id);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminarVuelo(@PathVariable Long id) {
        vueloService.borrarVueloXId(id);
    }

    @PutMapping("/modificar")
    public Vuelo modificarVuelo(@RequestBody Vuelo vuelo) {
        return vueloService.modificar(vuelo);
    }
}
