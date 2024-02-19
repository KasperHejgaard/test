import java.util.Scanner;

public class Tidsberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange timer er der gået?");
        int timer = input.nextInt();

        System.out.println("Hvor mange minutter er der gået?");
        int minutter = input.nextInt();
        System.out.println("Hvor mange sekunder er der gået?");
        int sekunder = input.nextInt();

        int sekunderSidenMidnat = timer*60*60+minutter*60+sekunder;

        System.out.println("Der er gået " + sekunderSidenMidnat + " sekunder siden midnat");
    }
}
