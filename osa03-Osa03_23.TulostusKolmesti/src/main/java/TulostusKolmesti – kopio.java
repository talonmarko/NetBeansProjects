
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        System.out.println("Mikä tulostetaan?");
            String merkkijono = lukija.nextLine();
            System.out.println("");
        System.out.println(merkkijono+merkkijono+merkkijono);    
    }
}
