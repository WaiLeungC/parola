import java.util.Timer;
import java.util.TimerTask;

public class ParolaController {
    private static ParolaController instance;
    private ParolaService parolaService;
    private String playerName;
    private Quiz quiz;
    private Vraag huidigeVraag;
    private final String[] ANTWOORD_KEUZES = {"A", "B", "C", "D"};
    private Puntentelling puntentelling;

    private Timer timer = new Timer();
    private TimerTask timerTask;
    private int totaleTijd;

    public ParolaController(ParolaService parolaService) {
        this.parolaService = parolaService;
    }

    public static ParolaController getInstance() {
        if (instance == null) {
            instance = new ParolaController(new ParolaService());
        }
        return instance;
    }

    public void startQuiz(String playerName) {
        this.playerName = playerName;
        quiz = parolaService.getRandomQuiz();
        startTimer();
    }

    public String nextQuestion() {
        huidigeVraag = quiz.nextQuestion();

        if (huidigeVraag instanceof MeerkeuzeVraag) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\n");
            for (int i = 0; i < huidigeVraag.antwoorden.size(); i++) {
                stringBuilder.append(ANTWOORD_KEUZES[i]);
                stringBuilder.append(".    ");
                stringBuilder.append(huidigeVraag.antwoorden.get(i).getAntwoordTekst());
                stringBuilder.append("\n");
            }
            return huidigeVraag.vraagTekst + stringBuilder;
        }

        return huidigeVraag.vraagTekst;
    }

    public void processAnswer(String answer) {
        if (huidigeVraag instanceof MeerkeuzeVraag) {
            for (int i = 0; i < ANTWOORD_KEUZES.length; i++) {
                if (ANTWOORD_KEUZES[i].equalsIgnoreCase(answer)) {
                    huidigeVraag.processAnswer(huidigeVraag.antwoorden.get(i).getAntwoordTekst());
                    break;
                }
            }
        } else if (huidigeVraag instanceof KortAntwoordVraag) {
            huidigeVraag.processAnswer(answer);
        }
    }

    public String getLettersForRightAnswers() {
        String letters = quiz.getLettersForRightAnswers();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < letters.length(); i++) {
            stringBuilder.append(letters.charAt(i));
            stringBuilder.append(", ");
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        return stringBuilder.toString();
    }

    public boolean quizFinished() {
        if (quiz.quizFinished()) {
            stopTimer();
        }
        return quiz.quizFinished();
    }

    public int calculateScore(String word) {
        return puntentelling.calculateScore(word);
    }

    private void startTimer() {
        totaleTijd = 0;
        timerTask = new TimerTask() {
            @Override
            public void run() {
                totaleTijd++;
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }

    private void stopTimer() {
        if (timerTask != null) {
            timerTask.cancel();
            timerTask = null;
        }
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public int getTotaleTijd() {
        return totaleTijd;
    }

    public void setPuntentelling(Puntentelling puntentelling) {
        this.puntentelling = puntentelling;
    }
}