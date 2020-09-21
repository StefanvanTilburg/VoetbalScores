package controller;

import model.Wedstrijd;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht
 * <p>
 * Doel
 */
public class VoetbalScoresLauncher {
    public static void main(String[] args) {
        Wedstrijd eersteWedstrijd = new Wedstrijd("PEC",5,0);
        eersteWedstrijd.printUitslag();
        eersteWedstrijd.printWedstrijdPunten();
    }
}
