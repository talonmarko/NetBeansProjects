
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mihin asti?");

        int mihinasti = Integer.valueOf(lukija.nextLine());

        int laskuri = 0;
        int summa = 0;

        while (laskuri <= mihinasti) {

            summa += laskuri;
            
            laskuri++;

        }
        
        System.out.println("Lukusarjan summa on " + summa);
    }
}
