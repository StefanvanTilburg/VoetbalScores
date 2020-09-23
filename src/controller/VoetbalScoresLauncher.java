package controller;

import model.Team;
import model.Wedstrijd;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 3.2 Voetbalscores, Main methode
 * <p>
 * Doel     VoetbalScoresLauncher fungeert als controller voor de Wedstrijd class en Team class.
 */
public class VoetbalScoresLauncher {
    public static void main(String[] args) {

        Team homeTeam = new Team("Ajax");
        Team awayTeam = new Team("PEC");
        Wedstrijd game = new Wedstrijd(homeTeam, awayTeam, 5, 0);
        game.printUitslag();
        game.printWedstrijdPunten();
    }
}
