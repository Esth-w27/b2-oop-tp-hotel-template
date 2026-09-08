package fr.dampierre;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nom;
    private List<Chambre> chambres;
    private int nbChambres;

    public Hotel(String nom, int nbChambres, int nombreEtages) {
        this.nom = nom;
        this.nbChambres = nbChambres;
        this.chambres = new ArrayList<>();
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public int nbChambresOccupées() {
        int compteur = 0;
        for (Chambre v : chambres) {
            if (v.getNomOccupant() != null) {
                compteur++;
            }
        }
        return compteur;
    }  

    public double tauxOccupation() {
        return (double) nbChambresOccupées() / nbChambres * 100;
    }

    public boolean louerChambre(TypeChambre type, String nomClient, int nbJours) {
        for (Chambre c : chambres) {
            if (c.getType() == type && c.estLibre()) {
                c.définirOccupant(nomClient, nbJours);
                return true;
            }
        }
        return false;
    }


    public void jourSuivant() {
        for (Chambre v : chambres) {
            v.jourSuivant();
        }
    }

    private static void validerEntrees(int nombreChambres, int nombreEtages) {
    }

    @Override
    public String toString() {
        return "";
    }
}