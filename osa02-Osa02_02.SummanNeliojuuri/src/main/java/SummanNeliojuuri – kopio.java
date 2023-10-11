
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku1 = Integer.valueOf(lukija.nextLine());
        int luku2 = Integer.valueOf(lukija.nextLine());
        System.out.println(luku1 + luku2);
        double neliojuuri = Math.sqrt(luku1 + luku2);
        System.out.println(neliojuuri);
        
        
    }
}
