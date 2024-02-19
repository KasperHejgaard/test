public class Tid {
    public static void main(String[] args) {
        int timer = 11;
        int minut = 10;
        int sekund = 30;
        int total = timer*60*60+minut*60+sekund;
        int sekunderTilbage = 24*60*60-40230;

        String sekunder = "Sekunder: ";
        String minutter = "minutter: ";
        String time = "time: ";

        System.out.println(sekunder + sekund);
        System.out.println(minutter + minut);
        System.out.println(time + timer);
        System.out.println(timer*60*60+minut*60+sekund);
        System.out.println("Siden midnat er der gået " + total + " sekunder" );
        System.out.println("Der er " + sekunderTilbage + " til at dagen er omme.");

        int timeNu = 11;
        int minutNu = 30;
        int sekundNu = 30;
        int tidBrugt = minutNu-minut;

        System.out.println("Der er brugt " + tidBrugt + " minutter på at lave opgaven");

    }
}
