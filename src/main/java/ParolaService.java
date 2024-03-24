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
        antwoord = new Antwoord("California");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Californië");
        antwoorden.add(antwoord);
        categorie = new Categorie("Geografie");
        vraag = new KortAntwoordVraag("In welke staat van de VS ligt de stad Los Angeles?", antwoorden, "C", categorie);
        vragen.add(vraag);

        return new Quiz(vragen);
    }
}