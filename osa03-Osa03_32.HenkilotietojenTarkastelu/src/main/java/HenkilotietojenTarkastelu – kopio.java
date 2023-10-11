
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa = 0;
        int maara = 0;
        int pituus = 0;
        String nimi = "";

        while (true) {
            String syote = lukija.nextLine();

            if (syote.isEmpty()) {
                break;
            }

            String[] osat = syote.split(",");

            summa = summa + Integer.valueOf(osat[1]);
            maara++;

            if (osat[0].length() > pituus) {
                pituus = osat[0].length();
                nimi = osat[0];
            }

        }

        System.out.println("Pisin nimi:" + nimi);
        System.out.println("Syntymävuoden keskiarvo:" + (double) summa / maara);

    }
}


/*import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> nimet = new ArrayList<>();
        ArrayList<Integer> vuodet = new ArrayList<>();

        while (true) {
            String syote = lukija.nextLine();
            if (syote.isEmpty()) {
                break;
            }

            String[] osat = syote.split(",");
            nimet.add(osat[0]);
            vuodet.add(Integer.valueOf(osat[1]));
        }

        String pisin = nimet.get(0);
        for (String nimi : nimet) {
            if (nimi.length() > pisin.length()) {
                pisin = nimi;
            }
        }
        System.out.println("Pisin nimi:" + pisin);

        int vuosiensumma = 0;
        for (int ika : vuodet) {
            vuosiensumma = vuosiensumma + ika;
        }
        System.out.println("Syntymävuosien keskiarvo:" + 1.0 * vuosiensumma / vuodet.size());

    }

}*/
