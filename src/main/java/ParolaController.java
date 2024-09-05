import java.util.Timer;
import java.util.TimerTask;

public class ParolaController {
    private static ParolaController instance;
    private ParolaService parolaService;
    private Speler speler;
    private Quiz quiz;
    private Puntentelling puntentelling;
    private Timer timer = new Timer();
    private TimerTask timerTask;
    private int bestedeTijd;

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
        speler = new Speler(playerName);
        speler.verwijderCredits(40);

        quiz = parolaService.getRandomQuiz();
        startTimer();
    }

    public String nextQuestion() {
        return quiz.nextQuestion().getVraagTekst();
    }

    public void processAnswer(String playername, String answer) {
        quiz.processAnswer(answer);
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

    public boolean quizFinished(String playername) {
        if (quiz.quizFinished()) {
            stopTimer();
        }
        return quiz.quizFinished();
    }

    public int calculateScore(String playername, String word) {
        return puntentelling.calculateScore(word);
    }

    private void startTimer() {
        bestedeTijd = 0;
        timerTask = new TimerTask() {
            @Override
            public void run() {
                bestedeTijd++;
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

    public int getBestedeTijd() {
        return bestedeTijd;
    }

    public void setPuntentelling(Puntentelling puntentelling) {
        this.puntentelling = puntentelling;
    }
}