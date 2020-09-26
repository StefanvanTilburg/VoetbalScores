package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht Voetbalscores, class Team
 * <p>
 * Doel     Class voor opslaan van team gegevens voor voetbalscores
 */
public class Team {
    private String teamNaam;
    private int totaalWedstrijdPunten;
    private int totaalVoorDoelpunten;
    private int totaalTegenDoelpunten;

    public Team(String teamNaam, int totaalWedstrijdPunten, int totaalVoorDoelpunten, int totaalTegenDoelpunten) {
        this.setTeamNaam(teamNaam);
        this.setTotaalWedstrijdPunten(totaalWedstrijdPunten);
        this.setTotaalVoorDoelpunten(totaalVoorDoelpunten);
        this.setTotaalTegenDoelpunten(totaalTegenDoelpunten);
    }

    public Team(String teamNaam) {
        this(teamNaam, 0,0,0);
    }

    public Team() {
        this("");
    }

    public int getDoelSaldo() {
        return getTotaalVoorDoelpunten() - getTotaalTegenDoelpunten();
    }

    public void printStatusTeam() {
        System.out.printf("Het team %s heeft %d wedstrijdpunt(en) en een doelsaldo van %d\n",
                            this.getTeamNaam(), this.getTotaalWedstrijdPunten(), this.getDoelSaldo());
    }

    public int getTotaalWedstrijdPunten() {
        return totaalWedstrijdPunten;
    }

    public void setTotaalWedstrijdPunten(int totaalWedstrijdPunten) {
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
    }

    public int getTotaalVoorDoelpunten() {
        return totaalVoorDoelpunten;
    }

    public void setTotaalVoorDoelpunten(int totaalVoorDoelpunten) {
        this.totaalVoorDoelpunten = totaalVoorDoelpunten;
    }

    public int getTotaalTegenDoelpunten() {
        return totaalTegenDoelpunten;
    }

    public void setTotaalTegenDoelpunten(int totaalTegenDoelpunten) {
        this.totaalTegenDoelpunten = totaalTegenDoelpunten;
    }

    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }
}
