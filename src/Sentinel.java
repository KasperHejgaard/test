import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SENTINEL = -1;
        int sum = 0;

        System.out.println("Indtast de tal som skal udregnes eller -1 for at stoppe.");
        int tal = scanner.nextInt();
        while (!(tal == SENTINEL)) {
            sum += tal;
            System.out.println("Summen er " + sum);
            tal = scanner.nextInt();
        }
    }
}
