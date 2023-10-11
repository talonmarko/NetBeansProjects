
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        double summa = 0, lukuja = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            lukuja = lukuja + 1;
            summa = summa + luku;
        }
        System.out.println("Lukujen keskiarvo " + summa / lukuja);
    }
}
