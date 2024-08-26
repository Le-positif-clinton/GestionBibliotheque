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
@Table(name = "Role")
public class Role extends SuperClasse{
    private String nom;
    @ManyToMany(mappedBy = "roles")
    private List<Utilisateur> utilisateurs;
}
