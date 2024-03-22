public class ParolaController {
    private static ParolaController instance;
    private ParolaService parolaService;
    private String playerName;
    private Quiz quiz;
    private Vraag huidigeVraag;
    private final String[] ANTWOORD_KEUZES = {"A", "B", "C", "D"};

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
                if (ANTWOORD_KEUZES[i].equals(answer)) {
                    huidigeVraag.processAnswer(huidigeVraag.antwoorden.get(i).getAntwoordTekst());
                    break;
                }
            }
        } else if (huidigeVraag instanceof KortAntwoordVraag) {
            huidigeVraag.processAnswer(answer);
        }
    }

    public String getLettersForRightAnswers() {
        return quiz.getLettersForRightAnswers();
    }

    public boolean quizFinished() {
        return quiz.quizFinished();
    }

    public int calculateScore(String word) {
        return 0;
    }
}