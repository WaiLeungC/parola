import java.util.ArrayList;

public class Quiz {
    private final ArrayList<Vraag> vragen;
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
            if (vraag.goedBeantwoord) {
                stringBuilder.append(vraag.letter);
                stringBuilder.append(", ");
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        return stringBuilder.toString();
    }

    public boolean quizFinished() {
        return volgendeVraagIndex >= vragen.size();
    }
}