package controller;

import model.Team;
import model.Wedstrijd;

import java.util.Scanner;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 3.2 Voetbalscores, Main methode
 * <p>
 * Doel     VoetbalScoresLauncher fungeert als controller voor de Wedstrijd class en Team class.
 */
public class VoetbalScoresLauncher {
    public static void main(String[] args) {

        Team newTeam = new Team("Twente", 15,28,12);
        newTeam.printStatusTeam();
    }
}
