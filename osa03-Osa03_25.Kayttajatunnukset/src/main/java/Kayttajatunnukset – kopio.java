
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna tunnus:");
        String tunnus = lukija.nextLine();
        
        System.out.println("Anna salasana:");
        String salasana = lukija.nextLine();
        
        tarkistus(tunnus, salasana);
    }

    public static void tarkistus(String tunnus, String salasana) {
        if (tunnus.equals("aleksi")) {
            if (salasana.equals("tappara")) {
                System.out.println("Olet kirjautunut järjestelmään!");
            } else {
                System.out.println("Virheellinen tunnus tai salasana!");
            }
        } else if (tunnus.equals("elina")) {
            if (salasana.equals("kissa")) {
                System.out.println("Olet kirjautunut järjestelmään!");
            } else {
                System.out.println("Virheellinen tunnus tai salasana!");
            }
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
}

/*import java.util.Scanner;
 
public class Kayttajatunnukset {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        System.out.print("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna salasana: ");
        String salasana = lukija.nextLine();
 
        if ((tunnus.equals("aleksi") && salasana.equals("tappara")) ||
                 (tunnus.equals("elina") && salasana.equals("kissa"))) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
}*/
