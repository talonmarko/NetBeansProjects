
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0, lukujenmaara = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                System.out.println("Lukuja yhteensä " + lukujenmaara);
                System.out.println("Lukujen summa " + summa);
                break;
            }
            summa = summa + luku;
            lukujenmaara = lukujenmaara + 1;
        }
    }
}
