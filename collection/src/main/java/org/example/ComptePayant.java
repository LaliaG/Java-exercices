package org.example;

import jdk.dynalink.Operation;

import java.util.List;

public class ComptePayant extends CompteBancaire {
    private double coutOperation;

    public ComptePayant(double solde, Client client, List<Operation> operations, double coutOperation) {
        super(solde, client, operations);
        this.coutOperation = coutOperation;
    }

    @Override
    public void deposer(double montant) {
        solde += montant - coutOperation;
        operations.add(new Operation("dépot", montant));

    }

    @Override
    public void retirer(double montant) {
        solde -= montant + coutOperation;
        operations.add(new Operation("retrait", montant));

    }
}
