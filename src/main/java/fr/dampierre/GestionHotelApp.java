package fr.dampierre;

public class GestionHotelApp {

  public static void main(String[] args) {
    System.out.println("Bienvenue dans l'application de gestion d'hôtel.");

  Chambre c1 = new Chambre(100, Chambre.TypeChambre.SIMPLE);
  System.out.println(c1);
  }
}

