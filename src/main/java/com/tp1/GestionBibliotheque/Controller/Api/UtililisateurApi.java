package com.tp1.GestionBibliotheque.Controller.Api;

import com.tp1.GestionBibliotheque.Model.Emprunt;
import com.tp1.GestionBibliotheque.Model.Utilisateur;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.tp1.GestionBibliotheque.Utils.Constante.routeUtilisateur;

@Api("Utililisateurs")
public interface UtililisateurApi {
    @PostMapping(value = routeUtilisateur + "/create")
    Utilisateur save(@RequestBody Utilisateur emprunt);
    @GetMapping(value = routeUtilisateur + "/all")
    List<Utilisateur> findAll();
    @GetMapping(value = routeUtilisateur + "/{idUtilisateur}")
    Utilisateur findById(@PathVariable("idUtilisateur") Integer id);
    @DeleteMapping( value = routeUtilisateur + "/delete/{idUtilisateur}")
    void delete(@PathVariable("idUtilisateur") Integer id);
}
