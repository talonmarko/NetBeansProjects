
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int ekaluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int tokaluku = Integer.valueOf(lukija.nextLine());
        int summa = ekaluku + tokaluku;
        int erotus = ekaluku - tokaluku;
        int tulos = ekaluku * tokaluku;
        double osamaara = 1.0 * ekaluku / tokaluku;

        System.out.println(ekaluku + " + " + tokaluku + " = " + summa);
        System.out.println(ekaluku + " - " + tokaluku + " = " + erotus);
        System.out.println(ekaluku + " * " + tokaluku + " = " + tulos);
        System.out.println(ekaluku + " / " + tokaluku + " = " + osamaara);


    }
}
