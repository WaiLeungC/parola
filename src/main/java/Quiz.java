import java.util.ArrayList;

public class Quiz {
    private ArrayList<Vraag> vragen;
    private int volgendeVraagIndex;

    public Quiz(ArrayList<Vraag> vragen) {
        this.vragen = vragen;
        this.volgendeVraagIndex = 0;
    }

    public Vraag nextQuestion() {
        Vraag volgendeVraag = vragen.get(volgendeVraagIndex);
        volgendeVraagIndex++;
        return volgendeVraag;
    }

    public String getLettersForRightAnswers() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Vraag vraag : vragen) {
            if (vraag.isGoedBeantwoord()) {
                stringBuilder.append(vraag.getLetter());
            }
        }
        return stringBuilder.toString();
    }

    public boolean quizFinished() {
        return volgendeVraagIndex >= vragen.size();
    }

    public ArrayList<Vraag> getVragen() {
        return vragen;
    }
}