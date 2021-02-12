package B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;


    public Voetbalclub(String naam, int aantalGewonnen, int aantalVerloren, int aantalGelijk){
        this.naam = naam;
        this.aantalGewonnen = aantalGewonnen;
        this.aantalVerloren = aantalVerloren;
        this.aantalGelijk = aantalGelijk;

        if (naam == null){
            this.naam = "FC";
        }

        if (naam == ""){
            this.naam = "FC";
        }

    }


    public Voetbalclub(String naam){
        this.naam = naam;

        if (naam == null){
            this.naam = "FC";
        }

        if (naam == ""){
            this.naam = "FC";
        }
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


    public String getNaam() {
        return naam;
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
        return    naam + "  "
                + aantalGespeeld() + " " +
                getAantalGewonnen() + " " +
                + getAantalGelijk() + " "
                + getAantalVerloren() + " "+
                aantalPunten();

    }


}
