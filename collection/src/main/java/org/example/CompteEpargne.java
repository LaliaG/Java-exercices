package org.example;

import jdk.dynalink.Operation;

import java.util.List;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(double solde, Client client, List<Operation> operations, double tauxInteret) {
        super(solde, client, operations);
        this.tauxInteret = tauxInteret;
    }

    @Override
    public void deposer(double montant) {
        solde += montant;
        operations.add(new Operation("dépot", montant));

    }

    @Override
    public void retirer(double montant) {
        solde -= montant;
        operations.add(new Operation("retrait", - montant));

    }
    public void appliquerInterets() {
        double interets = solde * tauxInteret / 100;
        solde += interets;
        operations.add(new Operation( "intérêts", interets);

    }
}
