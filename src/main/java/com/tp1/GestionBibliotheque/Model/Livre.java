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
@Table(name = "Livre")
public class Livre extends SuperClasse{
    private String titre;
    private String isbn;
    private String description;
    private String dateParution;
    private String maisonEdition;
    private String genre;
    private Integer stock;
    private String photo;
    @ManyToMany
    @JoinTable(
            name = "livre_auteur",
            joinColumns = @JoinColumn(name = "livre_id"),
            inverseJoinColumns = @JoinColumn(name = "auteur_id"))
    private List<Auteur> auteurs;
}
