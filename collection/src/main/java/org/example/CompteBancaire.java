package org.example;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.List;

public abstract class CompteBancaire {
    protected double solde;
    protected Client client;
    protected List<Operation> operations;

    public CompteBancaire(double solde, Client client, List<Operation> operations) {
        this.solde = solde = 0;
        this.client = client;
        this.operations = operations = new ArrayList<>();
    }

    public double getSolde() {return solde;}

    public void setSolde(double solde) {this.solde = solde;}

    //public Client getClient() {return client;}

   // public void setClient(Client client) {this.client = client;}

    public List<Operation> getOperations() {return operations;}

    public void setOperations(List<Operation> operations) {this.operations = operations;}

    public abstract void deposer(double montant);
    public abstract void retirer(double montant);




}
