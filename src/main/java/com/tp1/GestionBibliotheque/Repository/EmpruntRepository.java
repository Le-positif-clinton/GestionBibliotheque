package com.tp1.GestionBibliotheque.Repository;

import com.tp1.GestionBibliotheque.Model.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpruntRepository extends JpaRepository<Emprunt, Integer> {
}
