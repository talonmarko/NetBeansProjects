
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Ensimmäinen:");

        int mista = Integer.valueOf(lukija.nextLine());

        System.out.println("Viimeinen:");

        int mihin = Integer.valueOf(lukija.nextLine());

        //int laskuri = 0;
        int summa = 0;

        while (mista <= mihin) {

            summa += mista;

            mista++;

        }

        System.out.println("Lukusarjan summa on " + summa);
    }

}
