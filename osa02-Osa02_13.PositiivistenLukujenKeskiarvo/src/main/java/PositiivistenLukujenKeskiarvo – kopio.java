
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        double summa = 0, lukuja = 0;
        while (true) {
            //System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                if (lukuja == 0) {
                    System.out.println("keskiarvon laskeminen ei ole mahdollista");
                }else{
                    System.out.println(summa / lukuja);
                }
                break;
            }
            if (luku > 0) {
                lukuja = lukuja + 1;
                summa = summa + luku;
            }
        }
    }
}
