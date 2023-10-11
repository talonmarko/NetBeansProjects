
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Anna luku!");
        int vuosi = Integer.valueOf(lukija.nextLine());
        if (vuosi == 1984){
            System.out.println("Orwell");
        }

    }
}
