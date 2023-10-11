
import java.util.Scanner;

public class Tunnussana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Tunnussana?");
        String salasana1 = lukija.nextLine();
        String salasana2 = "Caput Draconis";
        if (salasana1.equals(salasana2)){
            System.out.println("Tervetuloa!");
        }else {
            System.out.println("Hus siitä!");
        }   
    }
}