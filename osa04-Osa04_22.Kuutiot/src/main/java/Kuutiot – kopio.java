
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String syote = lukija.nextLine();

            if (syote.equals("loppu")) {
                break;
            }

            int luku = Integer.parseInt(syote);
            System.out.println(luku * luku * luku);
        }
    }
}
