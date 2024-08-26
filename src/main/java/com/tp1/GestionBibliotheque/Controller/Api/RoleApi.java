package com.tp1.GestionBibliotheque.Controller.Api;

import com.tp1.GestionBibliotheque.Model.Role;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.tp1.GestionBibliotheque.Utils.Constante.routeRole;

@Api("Roles")
public interface RoleApi {
    @PostMapping(value = routeRole + "/create")
    Role save(@RequestBody Role emprunt);
    @GetMapping(value = routeRole + "/all")
    List<Role> findAll();
    @GetMapping(value = routeRole + "/{idRole}")
    Role findById(@PathVariable("idRole") Integer id);
    @DeleteMapping( value = routeRole + "/delete/{idRole}")
    void delete(@PathVariable("idRole") Integer id);
}
