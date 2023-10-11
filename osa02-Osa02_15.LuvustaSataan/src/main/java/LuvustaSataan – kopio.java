
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        //System.out.println("Mistä?");
        int mista = Integer.valueOf(lukija.nextLine());
        //System.out.println("Mihin?");
        //int mihin = Integer.valueOf(lukija.nextLine());
        for (int i = mista; i <= 100; i++){
            System.out.println(i);
        }
    }
}
