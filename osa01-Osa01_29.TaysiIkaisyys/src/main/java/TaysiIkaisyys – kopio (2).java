
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku < 18) {
            System.out.println("Et ole tysi-ikäinen");
        } else {
            System.out.println("Olet täysi-ikäinen");
        }
    }
}