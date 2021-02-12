package B;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VoetbalclubTest {

    @Test
    @DisplayName("Club krijgt naam FC bij lege invoer")
    void voetbalClubnaamTest() {
        Voetbalclub club = new Voetbalclub("");
        assertEquals("FC", club.getNaam());
    }

    @Test
    @DisplayName("Club krijgt drie punten bij winst")
    void voetbalVerwerkResultaatWinst() {
        Voetbalclub club = new Voetbalclub("");
        club.verwerkResultaat('w');
        assertEquals(3, club.aantalPunten());
    }

    @Test
    @DisplayName("Club krijgt nul punten bij verlies")
    void voetbalVerwerkResultaatVelies() {
        Voetbalclub club = new Voetbalclub("");
        club.verwerkResultaat('v');
        assertEquals(0, club.aantalPunten());
    }

    @Test
    @DisplayName("Club krijgt een punt bij gelijkspel")
    void voetbalVerwerkResultaatGelijk() {
        Voetbalclub club = new Voetbalclub("");
        club.verwerkResultaat('g');
        assertEquals(1, club.aantalPunten());
    }

    @Test
    @DisplayName("De toString methode komt overeen met de verwachting")
    void verwerkResulaatTest() {
        Voetbalclub club1 = new Voetbalclub("", 2, 2, 3);
        assertEquals("FC  7 2 3 2 9", club1.toString());
    }

    @Test
    @DisplayName("Het aantal punten komt overeen")
    void aantalPuntenTest() {
        Voetbalclub club1 = new Voetbalclub("", 2, 2, 3);
        assertEquals(9, club1.aantalPunten());
    }

    @Test
    @DisplayName("Het aantal gepeelde wedstrijden komt overeen")
    void aantalGespeeldTest() {
        Voetbalclub club1 = new Voetbalclub("", 2, 2, 3);
        assertEquals(7, club1.aantalGespeeld());
    }

}