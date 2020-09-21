package controller;

import model.Wedstrijd;

import java.util.Scanner;

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

        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.print("Wat is de tegenstander? ");
        Wedstrijd userWedstrijd = new Wedstrijd(keyboard.next());

        System.out.print("Doelpunten gescoord: ");
        userWedstrijd.voorDoelpunten = keyboard.nextInt();

        System.out.print("Doelpunten tegenstander: ");
        userWedstrijd.tegenDoelpunten = keyboard.nextInt();

        userWedstrijd.printUitslag();
        userWedstrijd.printWedstrijdPunten();
    }
}
