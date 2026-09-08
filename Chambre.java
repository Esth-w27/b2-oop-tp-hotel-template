package fr.dampierre;

public class Chambre {
    private int numero;
    private int joursRestants;
    private TypeChambre type;
    private String nomOccupant;

    public Chambre(int numero, TypeChambre type) {
        this.numero = numero;
        joursRestants = 0;
        this.type = type;
        nomOccupant = null;
    }
    
    public int getnumero() {
        return numero;
    }

    public int getjoursRestants() {
        return joursRestants;
    }

    public TypeChambre getType() {
        return type;
    }

    public boolean estLibre() {
        return nomOccupant == null;
    }

    public enum TypeChambre {
        SIMPLE, 
        DOUBLE,
        SUITE
    }

    public String getNomOccupant() {
        return nomOccupant;
    }

    public boolean définirOccupant(String nom, int jours) {
        if (nomOccupant != null) {
            return false;
        }
        nomOccupant = nom;
        joursRestants = jours;
        return true;
    }

    public void jourSuivant() {
        if (joursRestants > 0) {
            joursRestants--;
            if (joursRestants == 0) {
                nomOccupant = null;
            }
        }
    }

    @Override
    public String toString() {
        String typeStr = type.toString().toLowerCase();
        if (nomOccupant == null) {
            return "Chambre " + numero + " : " + typeStr + " - libre";
        } else {
            return "Chambre " + numero + " : " + typeStr + " - louée à " + nomOccupant + " - " + joursRestants + " jour(s) restant(s)";
        }
    }
}
