package org.example;

import jdk.dynalink.Operation;

import java.util.List;

public class CompteCourant extends CompteBancaire{
    private double decouvertAutorise;

    public CompteCourant(double solde, Client client, List<Operation> operations, double decouvertAutorise) {
        super(solde, client, operations);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void deposer(double montant) {
        solde += montant;
        operations.add(new Operation("depot", montant));

    }

    @Override
    public void retirer(double montant) {
        if (solde - montant >= - decouvertAutorise) {
            solde -= montant;
            operations.add(new Operation("retrait", -montant));
        } else  {
            System.out.println("operation impossible : découvert autorisé ");
        }

    }
}
