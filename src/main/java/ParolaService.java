import java.util.ArrayList;

public class ParolaService {
    public Quiz getRandomQuiz() {
        ArrayList<Vraag> vragen = new ArrayList<>();
        Vraag vraag;
        ArrayList<Antwoord> antwoorden;
        Antwoord antwoord;
        Antwoord goedAntwoord;
        Categorie categorie;

        antwoorden = new ArrayList<>();
        antwoord = new Antwoord("Bayda");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Benghazi");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Misrata");
        antwoorden.add(antwoord);
        goedAntwoord = new Antwoord("Tripoli");
        antwoorden.add(goedAntwoord);
        categorie = new Categorie("Geografie");
        vraag = new MeerkeuzeVraag("Wat is de hoofdstad van Libië?", antwoorden, goedAntwoord, "T", categorie);
        vragen.add(vraag);

        antwoorden = new ArrayList<>();
        goedAntwoord = new Antwoord("Davis Cup");
        antwoorden.add(goedAntwoord);
        antwoord = new Antwoord("Diamond League");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Fed Cup");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Nations League");
        antwoorden.add(antwoord);
        categorie = new Categorie("Sport");
        vraag = new MeerkeuzeVraag("Hoe heet het officieuze landenkampioenschap tennis voor mannen?", antwoorden, goedAntwoord, "D", categorie);
        vragen.add(vraag);

        antwoorden = new ArrayList<>();
        antwoord = new Antwoord("Henning Mankell");
        antwoorden.add(antwoord);
        antwoord = new Antwoord(" Jo Nesbø");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Lars Kepler");
        antwoorden.add(antwoord);
        goedAntwoord = new Antwoord("Stieg Larsson");
        antwoorden.add(goedAntwoord);
        categorie = new Categorie("Literatuur");
        vraag = new MeerkeuzeVraag("Hoe heet de schrijver van de Millennium-trilogie, een reeks misdaadromans? " +
                "Het eerste boek uit de reeks heet Mannen die vrouwen haten.", antwoorden, goedAntwoord, "L", categorie);
        vragen.add(vraag);

        antwoorden = new ArrayList<>();
        antwoord = new Antwoord("Arsenal");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Chelsea");
        antwoorden.add(antwoord);
        goedAntwoord = new Antwoord("Everton");
        antwoorden.add(goedAntwoord);
        antwoord = new Antwoord("Tottenham Hotspur");
        antwoorden.add(antwoord);
        categorie = new Categorie("Sport");
        vraag = new MeerkeuzeVraag("Welke van de volgende Engelse voetbalclubs is afkomstig uit Liverpool?", antwoorden, goedAntwoord, "E", categorie);
        vragen.add(vraag);

        antwoorden = new ArrayList<>();
        antwoord = new Antwoord("California");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Californië");
        antwoorden.add(antwoord);
        categorie = new Categorie("Geografie");
        vraag = new KortAntwoordVraag("In welke staat van de VS ligt de stad Los Angeles?", antwoorden, "C", categorie);
        vragen.add(vraag);

        antwoorden = new ArrayList<>();
        antwoord = new Antwoord("Eminem");
        antwoorden.add(antwoord);
        categorie = new Categorie("Muziek");
        vraag = new KortAntwoordVraag("Wat is de artiestnaam van de rapper Marshall Bruce Mathers III?", antwoorden, "E", categorie);
        vragen.add(vraag);

        antwoorden = new ArrayList<>();
        antwoord = new Antwoord("Adri");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Adrie");
        antwoorden.add(antwoord);
        categorie = new Categorie("Sport");
        vraag = new KortAntwoordVraag("Mathieu van der Poel en zijn vader, die ook wielrenner was, hebben allebei de gele trui gedragen in " +
                "de Tour de France. Wat is de voornaam van de vader van Mathieu?", antwoorden, "A", categorie);
        vragen.add(vraag);

        antwoorden = new ArrayList<>();
        antwoord = new Antwoord("imker");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("bijker");
        antwoorden.add(antwoord);
        categorie = new Categorie("Trivia");
        vraag = new KortAntwoordVraag("Hoe noem je een persoon die zich bezighoudt met bijenteelt?", antwoorden, "I", categorie);
        vragen.add(vraag);

        return new Quiz(vragen);
    }
}