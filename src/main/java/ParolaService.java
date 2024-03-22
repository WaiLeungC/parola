import java.util.ArrayList;

public class ParolaService {
    public Quiz getRandomQuiz() {
        ArrayList<Vraag> vragen = new ArrayList<>();
        Vraag vraag;
        ArrayList<Antwoord> antwoorden;
        Antwoord antwoord;
        Antwoord goedAntwoord;

        antwoorden = new ArrayList<>();
        antwoord = new Antwoord("Bayda");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Benghazi");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Misrata");
        antwoorden.add(antwoord);
        goedAntwoord = new Antwoord("Tripoli");
        antwoorden.add(goedAntwoord);
        vraag = new MeerkeuzeVraag("Wat is de hoofdstad van Libië?", antwoorden, goedAntwoord, "T");
        vragen.add(vraag);

        antwoorden = new ArrayList<>();
        antwoord = new Antwoord("California");
        antwoorden.add(antwoord);
        antwoord = new Antwoord("Californië");
        antwoorden.add(antwoord);
        vraag = new KortAntwoordVraag("In welke staat van de VS ligt de stad Los Angeles?", antwoorden, "C");
        vragen.add(vraag);

        return new Quiz(vragen);
    }
}