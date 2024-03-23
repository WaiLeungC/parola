import java.util.Scanner;

public class ParolaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParolaController parola = ParolaController.getInstance();

        System.out.println("Enter your player name: ");
        String playerName = scanner.nextLine();

        System.out.println("The 8-question quiz starts. Good luck!");
        assert parola != null;
        parola.startQuiz(playerName);
        do {
            System.out.println(parola.nextQuestion());
            System.out.print("Give your answer to this question: ");
            String answer = scanner.nextLine();
            parola.processAnswer(answer);
        } while (!parola.quizFinished());

        System.out.println("You've earned the following letters: " + parola.getLettersForRightAnswers());
        System.out.print("Make a word, as long as possible, that contains these letters: ");
        String word = scanner.nextLine();

        int score = 0;
        parola.setPuntentelling(new AantalGoedBeantwoordeVragen(parola.getQuiz()));
        score += parola.calculateScore(word);
        parola.setPuntentelling(new LengteWoord());
        score += parola.calculateScore(word);
        parola.setPuntentelling(new TotaleTijd(parola.getTotaleTijd()));
        score += parola.calculateScore(word);

        System.out.println("Score: " + score);
    }
}