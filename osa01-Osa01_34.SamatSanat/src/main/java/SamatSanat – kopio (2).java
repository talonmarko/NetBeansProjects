
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Syötä ensimmäinen merkkijono:");
        String ekatsanat = lukija.nextLine();

        System.out.println("Syötä toinen merkkijono:");
        String tokatsanat = lukija.nextLine();
        if (ekatsanat.equals(tokatsanat)){
            System.out.println("Samat sanat!");
        }else {
            System.out.println("Ei sitten");
        }
    }
}
