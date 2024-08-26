package com.tp1.GestionBibliotheque.Services;

import com.tp1.GestionBibliotheque.Model.Emprunt;

import java.util.List;


public interface EmpruntService {
    Emprunt save(Emprunt emprunt);
    Emprunt findById(Integer id);
    Emprunt findByNom(String nom);
    List<Emprunt> findAll();
    void delete(Integer id);
}