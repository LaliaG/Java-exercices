package org.example;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private int identifiant;
    private String numeroTelephone;
    private List<CompteBancaire> comptes;

    public Client(String nom, String prenom, int identifiant, String numeroTelephone, List<CompteBancaire> comptes) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.numeroTelephone = numeroTelephone;
        this.comptes = comptes = new ArrayList<>();

    }
    public void ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
    }
    public List<CompteBancaire> getComptes() {return  comptes;}
}
