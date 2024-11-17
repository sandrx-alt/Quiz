import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "What is the capital of France?",
                "What is 2+2",
                "What is the color of the sky?"
        };

        String[][] options = {
                {"a) London", "b) Paris", "C) Rome"},
                {"a)3", "b) 4", "c)5"},
                {"a) Blue", "b) Green", "c)Red"}
        };

        char[] answers = {'b', 'b', 'a'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
            }

            System.out.println(" Your answer: ");
            char answer = scanner.next().charAt(0);

            if (answer == answers[i]) {
                score++;
            }
        }

        System.out.println("Your scored " + score + " out of " + questions.length);

        scanner.close();
    }
}
