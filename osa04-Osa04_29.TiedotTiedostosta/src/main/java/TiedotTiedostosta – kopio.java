
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) throws IOException {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mikä tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        try ( Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto))) {

            while (tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();

                String[] palat = rivi.split(",");
                String nimi = palat[0];
                int ika = Integer.valueOf(palat[1]);
                String ikaternary = ika == 1 ? " vuosi" : " vuotta";

                System.out.println(nimi + "," + "ikä: " + ika  + ikaternary);

                /*if (ika == 1) {
                    System.out.println(" vuosi");
                } else {
                    System.out.println(" vuotta");
                    }
                }
            }
        catch (Exception e) {
            System.out.println("Virhe tiedoston " + tiedosto + " lukemisessa!");
*/
            }
        }
    }
}