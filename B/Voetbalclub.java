package B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;


    public Voetbalclub(String naam){
        this.naam = naam;
    }


    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int aantalPunten(){
        int punten_gewonnen = this.aantalGewonnen *3;
        return punten_gewonnen + this.aantalGelijk;
    }

    public int aantalGespeeld(){
        return this.aantalGelijk + this.aantalGewonnen +this.aantalVerloren;

    }


    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }


    public String toString() {
        return    naam + " "
                + aantalGespeeld() + " " +
                getAantalGewonnen() + " " +
                + getAantalGelijk() + " "
                + getAantalVerloren() + " "+
                aantalPunten();

    }


}
