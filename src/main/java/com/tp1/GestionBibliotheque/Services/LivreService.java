package com.tp1.GestionBibliotheque.Services;

import com.tp1.GestionBibliotheque.Model.Livre;

import java.util.List;

public interface LivreService {
    Livre save(Livre livre);
    Livre findById(Integer id);
    Livre findByNom(String nom);
    List<Livre> findAll();
    void delete(Integer id);
}
