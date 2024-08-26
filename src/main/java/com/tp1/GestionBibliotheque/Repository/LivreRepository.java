package com.tp1.GestionBibliotheque.Repository;

import com.tp1.GestionBibliotheque.Model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LivreRepository extends JpaRepository<Livre, Integer> {
}