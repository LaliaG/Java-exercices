package org.example;

public class Operation {
    private int numeroOperation;
    private double montant;
    private StatutOperation statut;

    public enum StatutOperation {
        Depot, Retrait;
    }

    public Operation(int numeroOperation, double montant, StatutOperation statut) {
        this.numeroOperation = numeroOperation;
        this.montant = montant;
        this.statut = statut;
    }

    public String getNumeroOperation() {return numeroOperation;}

    public void setType(String numeroOperation) {this.numeroOperation = numeroOperation;}

    public double getMontant() {return montant;}

    public void setMontant(double montant) {this.montant = montant;}
}
