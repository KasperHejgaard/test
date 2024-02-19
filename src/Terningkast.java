import java.util.Random;
import java.util.stream.IntStream;

public class Terningkast {
    public static void main(String[] args) {
        Random rand = new Random();
        int resultat = 0;

        while (!(resultat == 7)) {
            int terningKast = rand.nextInt(1, 6);
            int terningKast2 = rand.nextInt(1, 6);
            resultat = terningKast + terningKast2;
            System.out.println(terningKast + " + " + terningKast2 + " = " + resultat);
        }

    }
}
