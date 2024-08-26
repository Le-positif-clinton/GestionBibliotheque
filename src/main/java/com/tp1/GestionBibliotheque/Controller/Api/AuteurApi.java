package com.tp1.GestionBibliotheque.Controller.Api;

import com.tp1.GestionBibliotheque.Model.Auteur;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.tp1.GestionBibliotheque.Utils.Constante.routeAuteur;

@Api("Auteurs")
public interface AuteurApi {
    @PostMapping(value = routeAuteur + "/create")
    Auteur save(@RequestBody Auteur auteur);
    @GetMapping(value = routeAuteur + "/all")
    List<Auteur> findAll();
    @GetMapping(value = routeAuteur + "/{idAuteur}")
    Auteur findById(@PathVariable("idAuteur") Integer id);
    @DeleteMapping( value = routeAuteur + "/delete/{idAuteur}")
    void delete(@PathVariable("idAuteur") Integer id);
}
