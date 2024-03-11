package com.codeki.vuelosApi.services;

import com.codeki.vuelosApi.model.Vuelo;
import com.codeki.vuelosApi.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloService {
    @Autowired
    private VueloRepository vueloRepository;

    public void crearVuelo(Vuelo vuelo) {
        vueloRepository.save(vuelo);
    }

    public Vuelo mostrarVuelo() {
        return null;
    }

    public List<Vuelo> mostrarTodosVuelos() {
        return vueloRepository.findAll();
    }

    public Vuelo buscarVueloXId(Long id) {
        return vueloRepository.findById(id).orElse(null);
    }

    public void borrarVueloXId(Long id) {
        vueloRepository.deleteById(id);
    }

    public Vuelo modificar(Vuelo vuelo) {
        vueloRepository.save(vuelo);
        return vueloRepository.findById(vuelo.getId()).orElse(null);
    }

}
