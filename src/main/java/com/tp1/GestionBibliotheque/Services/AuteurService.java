package com.tp1.GestionBibliotheque.Services;

import com.tp1.GestionBibliotheque.Model.Auteur;

import java.util.List;

public interface AuteurService {
    Auteur save(Auteur auteur);
    Auteur findById(Integer id);
    Auteur findByNom(String nom);
    List<Auteur> findAll();
    void delete(Integer id);
}
