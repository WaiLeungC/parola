import java.util.List;

public class Quiz {
    private List<Vraag> vragen;
    private int huidigeVraagIndex;
    private boolean[] goedBeantwoordeVragen;

    public Quiz(List<Vraag> vragen) {
        this.vragen = vragen;
        this.huidigeVraagIndex = 0;
        this.goedBeantwoordeVragen = new boolean[vragen.size()];
    }

    public Vraag nextQuestion() {
        return vragen.get(huidigeVraagIndex);
    }

    public void processAnswer(String answer) {
        Vraag huidigeVraag = vragen.get(huidigeVraagIndex);
        goedBeantwoordeVragen[huidigeVraagIndex] = huidigeVraag.controleerAntwoord(answer);

        huidigeVraagIndex++;
    }

    public String getLettersForRightAnswers() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < goedBeantwoordeVragen.length; i++) {
            if (goedBeantwoordeVragen[i]) {
                stringBuilder.append(vragen.get(i).getLetter());
            }
        }
        return stringBuilder.toString();
    }

    public boolean quizFinished() {
        return huidigeVraagIndex >= vragen.size();
    }

    public boolean[] getGoedBeantwoordeVragen() {
        return goedBeantwoordeVragen;
    }
}