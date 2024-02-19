import java.util.Scanner;

public class TommeBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange tommer skal omregnes til CM?");
        double tommer = input.nextDouble();
        final double CENTIMETER_PER_TOMME = 2.54;
        double centimeter = tommer*CENTIMETER_PER_TOMME;

        System.out.println(tommer + " tommer er lig med " + centimeter + " centimeter.");

    }
}
