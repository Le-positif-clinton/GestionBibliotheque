package com.tp1.GestionBibliotheque.Controller;

import com.tp1.GestionBibliotheque.Controller.Api.EmpruntApi;
import com.tp1.GestionBibliotheque.Model.Emprunt;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmpruntController implements EmpruntApi {
    @Override
    public Emprunt save(Emprunt emprunt) {
        return null;
    }

    @Override
    public List<Emprunt> findAll() {
        return List.of();
    }

    @Override
    public Emprunt findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
