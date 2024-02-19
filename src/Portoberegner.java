import java.util.Scanner;

public class Portoberegner {
    public static void main(String[] args) {
        System.out.println("Velkommen til Portoberegneren.");
        Scanner input = new Scanner(System.in);
        System.out.println("Hvor meget vejer dit brev i gram?");
        int vægt = input.nextInt();
        int pris = 0;


        if ((vægt > 2000) || (vægt <= 0)) {
            System.out.println("Et brev med denne vægt kan ikke sendes");

        } else if ((vægt <= 100) || (vægt <= 1)) {
            pris = 25;
        } else if (vægt <= 250) {
            pris = 50;
        } else if (vægt <= 2000) {
            pris = 75;
        }
        if (pris != 0) {
            System.out.println("Prisen for et brev som vejer " + vægt + " gram, koster " + pris + " kroner at sende.");
        }
    }
}
