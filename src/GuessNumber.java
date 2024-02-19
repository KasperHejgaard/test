import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) + 1;
        int usersGuess = -1;
        int guess = 1;
        System.out.println("Indtast et tal mellem 1-10 for at gætte.");

        while (usersGuess != numberToGuess) {
            usersGuess = scanner.nextInt();
            if (usersGuess == numberToGuess) {
                System.out.println("Det er korrekt. Det tal jeg tænkte på er " + numberToGuess + ". Du har brugt " + guess + " forsøg på at gætte korrekt.");
            }
            if (usersGuess > numberToGuess) {
                System.out.println("Det forkert - tallet er lavere.");
                guess++;
            }
            if (usersGuess < numberToGuess) {
                System.out.println("Det er forkert - tallet er højere.");
                guess++;
            }

        }

    }
}
