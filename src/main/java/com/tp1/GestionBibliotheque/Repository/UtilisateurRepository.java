package com.tp1.GestionBibliotheque.Repository;

import com.tp1.GestionBibliotheque.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
}