package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht
 * <p>
 * Doel
 */
public class Wedstrijd {
    public String naamTegenstander;
    public int voorDoelpunten;
    public int tegenDoelpunten;

    public Wedstrijd(String naamTegenstander, int voorDoelpunten, int tegenDoelpunten) {
        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = voorDoelpunten;
        this.tegenDoelpunten = tegenDoelpunten;
    }

    public Wedstrijd(String naamTegenstander) {
        this(naamTegenstander, 0, 0);
    }

    public Wedstrijd() {
        this("Onbekend");
    }

    public int bepaalWedstrijdPunten() {
        if (voorDoelpunten > tegenDoelpunten) {
            return 3;
        } else if (voorDoelpunten == tegenDoelpunten) {
            return 1;
        } else {
            return 0;
        }
    }

    public void printUitslag() {
        System.out.printf("Uitslag van de wedstrijd tegen %s: %d-%d\n",
                            naamTegenstander, voorDoelpunten, tegenDoelpunten);
    }

    public void printWedstrijdPunten() {
        System.out.printf("Dit levert %d wedstrijdpunten op.\n", this.bepaalWedstrijdPunten());
    }
}
