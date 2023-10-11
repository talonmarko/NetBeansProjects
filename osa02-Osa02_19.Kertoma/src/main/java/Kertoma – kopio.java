
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
        //Declare and Initialize the variable
        System.out.println("Anna luku: ");
        int numero = Integer.valueOf(lukija.nextLine());
        int luku = 1, kertoma = 1;
        while (luku <= numero) {
            kertoma = kertoma * luku;
            luku++;
        }
        System.out.println("Luvun kertoma on: " + kertoma);
    }
}
