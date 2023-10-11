
import java.nio.file.Paths;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();

        boolean loytyyko = false;

        try ( Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto))){

            while (tiedostonlukija.hasNextLine()){
                String rivi = tiedostonlukija.nextLine();

                if (etsittava.equals(rivi)){
                    loytyyko = true;
                }

            }
            if (loytyyko){
                System.out.println("Löytyi!");
            } else{
                System.out.println("Ei löytynyt!");
            }

        }catch (Exception e){
            System.out.println("Tiedoston lukeminen epäonnistui!");
        }
    }
}
