package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht Voetbalscores, class Wedstrijd
 * <p>
 * Doel     Ontwerp class Wedstrijd volgens opdracht, waarbij naam Tegenstander, voor doelpunten en tegendoelpunten
 *          geadministreerd kunnen worden. Op basis van gegevens wedstrijdpunten bepalen en wedstrijdstand teruggeven.
 */
public class Wedstrijd {
    private Team teamThuis;
    private Team teamUit;
    private int voorDoelpunten;
    private int tegenDoelpunten;
    private int totaalWedstrijdpunten;

    public Wedstrijd(Team teamThuis, Team teamUit, int voorDoelpunten, int tegenDoelpunten) {
        this.setTeamThuis(teamThuis);
        this.setTeamUit(teamUit);
        this.setVoorDoelpunten(voorDoelpunten);
        this.setTegenDoelpunten(tegenDoelpunten);
    }

    public Wedstrijd(Team teamThuis, Team teamUit) {
        this(teamThuis, teamUit, 0,0);
    }

    public Wedstrijd() {
        this(new Team(), new Team());
    }

    public int getWedstrijdPuntenThuisTeam() {
        if (getVoorDoelpunten() > getTegenDoelpunten()) {
            return 3;
        } else if (getVoorDoelpunten() == getTegenDoelpunten()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getWedstrijdPuntenUitTeam() {
        if (getTegenDoelpunten() > getVoorDoelpunten()) {
            return 3;
        } else if (getTegenDoelpunten() == getVoorDoelpunten()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void setWedstrijdPuntenThuisTeam() {
        teamThuis.setTotaalWedstrijdPunten(teamThuis.getTotaalWedstrijdPunten() + getWedstrijdPuntenThuisTeam());
    }

    public void setWedstrijdpuntenUitTeam() {
        teamUit.setTotaalWedstrijdPunten(teamUit.getTotaalWedstrijdPunten() + getWedstrijdPuntenUitTeam());
    }

    public void setTotaalDoelpuntenTeams() {
        teamThuis.setTotaalVoorDoelpunten(getVoorDoelpunten());
        teamThuis.setTotaalTegenDoelpunten(getTegenDoelpunten());
        teamUit.setTotaalVoorDoelpunten(getTegenDoelpunten());
        teamUit.setTotaalTegenDoelpunten(getVoorDoelpunten());
    }

    public void printUitslag() {
        System.out.printf("Uitslag van de wedstrijd %s-%s: %d-%d\n",
                            teamThuis.getTeamNaam(), teamUit.getTeamNaam(), getVoorDoelpunten(), getTegenDoelpunten());
    }

    public void printWedstrijdPunten() {
        System.out.printf("Dit levert %d wedstrijdpunten voor %s en %d wedstrijdpunten voor %s",
                getWedstrijdPuntenThuisTeam(), teamThuis.getTeamNaam(),
                getWedstrijdPuntenUitTeam(), teamUit.getTeamNaam());
    }

    public Team getTeamThuis() {
        return teamThuis;
    }

    public void setTeamThuis(Team teamThuis) {
        this.teamThuis = teamThuis;
    }

    public Team getTeamUit() {
        return teamUit;
    }

    public void setTeamUit(Team teamUit) {
        this.teamUit = teamUit;
    }

    public int getVoorDoelpunten() {
        return voorDoelpunten;
    }

    public void setVoorDoelpunten(int voorDoelpunten) {
        this.voorDoelpunten = voorDoelpunten;
    }

    public int getTegenDoelpunten() {
        return tegenDoelpunten;
    }

    public void setTegenDoelpunten(int tegenDoelpunten) {
        this.tegenDoelpunten = tegenDoelpunten;
    }
}
