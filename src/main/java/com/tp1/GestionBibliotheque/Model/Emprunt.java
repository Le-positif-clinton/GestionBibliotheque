package com.tp1.GestionBibliotheque.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Emprunt")
public class Emprunt extends SuperClasse{
    private String motif;
    private Instant dateDebut;
    private Instant dateFin;
    private Instant dateRestitution;
    private Boolean etat;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
    @ManyToOne
    @JoinColumn(name = "livre_id")
    private Livre livre;
}
