package com.tp1.GestionBibliotheque.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Utilisateur")
public class Utilisateur extends SuperClasse{
    private String noms;
    private String prenoms;
    private String email;
    private String nomUtilisateur;
    private String motDePasse;
    private Boolean etat;
    @OneToMany(mappedBy = "utilisateur")
    private List<Emprunt> emprunts;
    @ManyToMany
    @JoinTable(
            name = "role_utilisateur",
            joinColumns = @JoinColumn(name = "utilisateur_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;
}
