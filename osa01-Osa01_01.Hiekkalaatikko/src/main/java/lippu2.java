
import java.io.IOException;
import java.util.Scanner;

public class lippu2 {

    public static void main(String[] args) throws IOException {
        Scanner lukija = new Scanner(System.in);
        boolean lukujaSyotetty = false;
        boolean oliParillinen = false;

        int luku = 0;

        while (true) {
            System.out.println("Syötä joku luku");
            luku = Integer.valueOf(lukija.nextLine());

            if (luku == -1) {
                break;
            }
            lukujaSyotetty = true;
            System.out.println("OK");
            if (luku % 2 == 0) {
                oliParillinen = true;
            }
        }
        if (lukujaSyotetty == true) {
            if (oliParillinen == true) {
                System.out.println("Syötit ainakin yhden parillisen luvun.");
            } else {
                System.out.println("Et syöttänyt yhtään parillista lukua.");
            }

        } else {
            System.out.println("Et syöttänyt yhtään lukua.");
        }
    }
}
