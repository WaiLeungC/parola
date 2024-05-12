import java.util.ArrayList;
import java.util.List;

public class ParolaService {
    public Quiz getRandomQuiz() {
        List<Vraag> vragen = new ArrayList<>();
        Vraag vraag;
        Antwoord antwoord;
        List<Antwoord> alternatieven;
        Antwoord goedAntwoord;
        List<Antwoord> goedeAntwoorden;
        Categorie categorie;

        alternatieven = new ArrayList<>();
        antwoord = new Antwoord("Bayda");
        alternatieven.add(antwoord);
        antwoord = new Antwoord("Benghazi");
        alternatieven.add(antwoord);
        antwoord = new Antwoord("Misrata");
        alternatieven.add(antwoord);
        goedAntwoord = new Antwoord("Tripoli");
        alternatieven.add(goedAntwoord);
        categorie = new Categorie("Geografie");
        vraag = new MeerkeuzeVraag("Wat is de hoofdstad van Libië?", "T", categorie, alternatieven, goedAntwoord);
        vragen.add(vraag);

        alternatieven = new ArrayList<>();
        goedAntwoord = new Antwoord("Davis Cup");
        alternatieven.add(goedAntwoord);
        antwoord = new Antwoord("Diamond League");
        alternatieven.add(antwoord);
        antwoord = new Antwoord("Fed Cup");
        alternatieven.add(antwoord);
        antwoord = new Antwoord("Nations League");
        alternatieven.add(antwoord);
        categorie = new Categorie("Sport");
        vraag = new MeerkeuzeVraag("Hoe heet het officieuze landenkampioenschap tennis voor mannen?", "D", categorie, alternatieven, goedAntwoord);
        vragen.add(vraag);

        alternatieven = new ArrayList<>();
        antwoord = new Antwoord("Henning Mankell");
        alternatieven.add(antwoord);
        antwoord = new Antwoord("Jo Nesbø");
        alternatieven.add(antwoord);
        antwoord = new Antwoord("Lars Kepler");
        alternatieven.add(antwoord);
        goedAntwoord = new Antwoord("Stieg Larsson");
        alternatieven.add(goedAntwoord);
        categorie = new Categorie("Literatuur");
        vraag = new MeerkeuzeVraag("Hoe heet de schrijver van de Millennium-trilogie, een reeks misdaadromans? " +
                "Het eerste boek uit de reeks heet Mannen die vrouwen haten.", "L", categorie, alternatieven, goedAntwoord);
        vragen.add(vraag);

        alternatieven = new ArrayList<>();
        antwoord = new Antwoord("Arsenal");
        alternatieven.add(antwoord);
        antwoord = new Antwoord("Chelsea");
        alternatieven.add(antwoord);
        goedAntwoord = new Antwoord("Everton");
        alternatieven.add(goedAntwoord);
        antwoord = new Antwoord("Tottenham Hotspur");
        alternatieven.add(antwoord);
        categorie = new Categorie("Sport");
        vraag = new MeerkeuzeVraag("Welke van de volgende Engelse voetbalclubs is afkomstig uit Liverpool?", "E", categorie, alternatieven, goedAntwoord);
        vragen.add(vraag);

        goedeAntwoorden = new ArrayList<>();
        antwoord = new Antwoord("California");
        goedeAntwoorden.add(antwoord);
        antwoord = new Antwoord("Californië");
        goedeAntwoorden.add(antwoord);
        categorie = new Categorie("Geografie");
        vraag = new KortAntwoordVraag("In welke staat van de VS ligt de stad Los Angeles?", "C", categorie, goedeAntwoorden);
        vragen.add(vraag);

        goedeAntwoorden = new ArrayList<>();
        antwoord = new Antwoord("Eminem");
        goedeAntwoorden.add(antwoord);
        categorie = new Categorie("Muziek");
        vraag = new KortAntwoordVraag("Wat is de artiestnaam van de rapper Marshall Bruce Mathers III?", "E", categorie, goedeAntwoorden);
        vragen.add(vraag);

        goedeAntwoorden = new ArrayList<>();
        antwoord = new Antwoord("Adri");
        goedeAntwoorden.add(antwoord);
        antwoord = new Antwoord("Adrie");
        goedeAntwoorden.add(antwoord);
        categorie = new Categorie("Sport");
        vraag = new KortAntwoordVraag("Mathieu van der Poel en zijn vader, die ook wielrenner was, hebben allebei de gele trui gedragen in " +
                "de Tour de France. Wat is de voornaam van de vader van Mathieu?", "A", categorie, goedeAntwoorden);
        vragen.add(vraag);

        goedeAntwoorden = new ArrayList<>();
        antwoord = new Antwoord("imker");
        goedeAntwoorden.add(antwoord);
        antwoord = new Antwoord("bijker");
        goedeAntwoorden.add(antwoord);
        categorie = new Categorie("Trivia");
        vraag = new KortAntwoordVraag("Hoe noem je een persoon die zich bezighoudt met bijenteelt?", "I", categorie, goedeAntwoorden);
        vragen.add(vraag);

        return new Quiz(vragen);
    }
}