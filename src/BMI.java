import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Velkommen til BMI udregneren.");

        Scanner input = new Scanner(System.in);
        System.out.println("Hvad vejer du?");
        double vægt = input.nextDouble();

        System.out.println("Hvor høj er du?");
        double højde = input.nextDouble();

        double bmiFormel = vægt / (højde * højde);
        System.out.println("Du har et BMI på " + bmiFormel);

        if (bmiFormel < 18.50) {
            System.out.println("Du er undervægtig");
        } else if (bmiFormel < 25.0) {
            System.out.println("Du er normalvægtig");
        } else if (bmiFormel < 30.0) {
            System.out.println("Du er overvægtig");
        } else
            System.out.println("Du er svært overvægtig");
    }
}
