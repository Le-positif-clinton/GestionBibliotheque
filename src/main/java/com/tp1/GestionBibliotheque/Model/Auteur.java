package com.tp1.GestionBibliotheque.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Auteur")
public class Auteur extends SuperClasse{
    private String noms;
    private String prenoms;
    @ManyToMany(mappedBy = "auteurs")
    private List<Livre> livres;
}
