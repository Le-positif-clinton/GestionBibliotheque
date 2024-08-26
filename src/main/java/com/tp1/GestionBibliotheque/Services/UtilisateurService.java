package com.tp1.GestionBibliotheque.Services;

import com.tp1.GestionBibliotheque.Model.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    Utilisateur save(Utilisateur utilisateur);
    Utilisateur findById(Integer id);
    Utilisateur findByNom(String nom);
    List<Utilisateur> findAll();
    void delete(Integer id);
}
