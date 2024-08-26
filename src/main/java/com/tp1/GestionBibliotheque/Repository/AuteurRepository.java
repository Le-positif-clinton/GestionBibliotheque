package com.tp1.GestionBibliotheque.Repository;

import com.tp1.GestionBibliotheque.Model.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur, Integer> {
}
