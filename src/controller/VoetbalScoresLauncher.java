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

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Voor hoeveel teams wordt uitslagen bijgehouden? ");
        int teamsAantal = keyboard.nextInt();

        Team[] teams = new Team[teamsAantal];
        for (int team = 0; team < teams.length; team++) {
            System.out.printf("\nGeef naam voor team %d: ", team + 1);
            teams[team] = new Team(keyboard.next());
        }

        Wedstrijd[] wedstrijden = new Wedstrijd[teamsAantal * (teamsAantal - 1)];
        int wedstrijdIndex = 0;
        for (int teamThuis = 0; teamThuis < teams.length - 1; teamThuis++) {
            for (int teamUit = teamThuis + 1; teamUit < teams.length; teamUit++) {
                wedstrijden[wedstrijdIndex++] = new Wedstrijd(teams[teamThuis],teams[teamUit]);
            }
        }
        for (int teamThuis = teams.length - 1; teamThuis >= 0; teamThuis--) {
            for (int teamUit = teamThuis - 1; teamUit >= 0; teamUit--) {
                wedstrijden[wedstrijdIndex++] = new Wedstrijd(teams[teamThuis],teams[teamUit]);
            }
        }

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
