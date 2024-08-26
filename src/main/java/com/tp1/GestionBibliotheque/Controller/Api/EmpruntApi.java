package com.tp1.GestionBibliotheque.Controller.Api;

import com.tp1.GestionBibliotheque.Model.Emprunt;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.tp1.GestionBibliotheque.Utils.Constante.routeEmprunt;

@Api("Emprunts")
public interface EmpruntApi {
    @PostMapping(value = routeEmprunt + "/create")
    Emprunt save(@RequestBody Emprunt emprunt);
    @GetMapping(value = routeEmprunt + "/all")
    List<Emprunt> findAll();
    @GetMapping(value = routeEmprunt + "/{idEmprunt}")
    Emprunt findById(@PathVariable("idEmprunt") Integer id);
    @DeleteMapping( value = routeEmprunt + "/delete/{idEmprunt}")
    void delete(@PathVariable("idEmprunt") Integer id);
}