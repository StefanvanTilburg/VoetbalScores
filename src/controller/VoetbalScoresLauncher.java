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

        Team homeTeam = new Team("Ajax");
        Team awayTeam = new Team("PEC");
        Wedstrijd game = new Wedstrijd(homeTeam, awayTeam, 5, 0);
        game.printUitslag();
        game.printWedstrijdPunten() ;

        Team[] teams = new Team[3];
        teams[0] = new Team ("VVV");
        teams[1] = new Team ("NAC");
        teams[2] = new Team ("PEC");

        Wedstrijd[] wedstrijden = new Wedstrijd[6];
//        wedstrijden[0] = new Wedstrijd(teams[0], teams[1]); //VVV-NAC
//        wedstrijden[1] = new Wedstrijd(teams[0], teams[2]); //VVV-PEC
//        wedstrijden[2] = new Wedstrijd(teams[1], teams[2]); //NAC-PEC
//        wedstrijden[3] = new Wedstrijd(teams[2], teams[0]); //PEC-VVV
//        wedstrijden[4] = new Wedstrijd(teams[2], teams[1]); //PEC-NAC
//        wedstrijden[5] = new Wedstrijd(teams[1], teams[0]); //NAC-VVV
        wedstrijden[0] = new Wedstrijd(teams[0],teams[1]); //VVV-NAC
        wedstrijden[1] = new Wedstrijd(teams[0],teams[2]); //VVV-PEC
        wedstrijden[2] = new Wedstrijd(teams[1],teams[2]); //NAC-PEC
        wedstrijden[3] = new Wedstrijd(teams[1],teams[0]); //NAC-VVV
        wedstrijden[4] = new Wedstrijd(teams[2],teams[0]); //PEC-VVV
        wedstrijden[5] = new Wedstrijd(teams[2],teams[1]); //PEC-NAC

        // Tja als je de scores op eenzelfde wijze invoert, maar wedstrijd array anders vult.
        // Dan is het natuurlijk logisch dat doelsaldo ect anders uitkomt.

        Scanner keyboard = new Scanner(System.in);
        for (Wedstrijd wedstrijd : wedstrijden) {
            System.out.printf("\nGeef van de wedstrijd %s-%s de voordoelpunten: ",
                    wedstrijd.getTeamThuis().getTeamNaam(),
                    wedstrijd.getTeamUit().getTeamNaam());
            wedstrijd.setVoorDoelpunten(keyboard.nextInt());

            System.out.printf("\nGeef van de wedstrijd %s-%s de tegendoelpunten: ",
                    wedstrijd.getTeamThuis().getTeamNaam(),
                    wedstrijd.getTeamUit().getTeamNaam());
            wedstrijd.setTegenDoelpunten(keyboard.nextInt());

            wedstrijd.setTotaalDoelpuntenTeams();
            wedstrijd.setWedstrijdPuntenUitTeam();
            wedstrijd.setWedstrijdPuntenThuisTeam();
        }

        System.out.println();
        for (Wedstrijd wedstrijd : wedstrijden) {
            wedstrijd.printUitslag();
        }

        for (Team team : teams) {
            team.printStatusTeam();
        }
    }
}
