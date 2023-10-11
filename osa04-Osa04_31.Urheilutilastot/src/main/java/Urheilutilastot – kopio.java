
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) throws IOException {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String joukkue = lukija.nextLine();

        int ottelut = 0;
        int voitot = 0;
        int tappiot = 0;

        try ( Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();
                String[] osa = rivi.split(",");
                
                if (osa[0].equals(joukkue)) {
                    ottelut++;
                    
                    if (Integer.valueOf(osa[2]) > Integer.valueOf(osa[3])) {
                        voitot++;
                    } else {
                        tappiot++;
                    }
                } 
                
                else if (osa[1].equals(joukkue)) {
                    ottelut++;
                    if (Integer.valueOf(osa[2]) < Integer.valueOf(osa[3])) {
                        voitot++;
                    } else {
                        tappiot++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Virhe tiedoston " + tiedosto + " lukemisessa!");
        }
        System.out.println("Otteluita: " + ottelut);
        System.out.println("Voittoja: " + voitot);
        System.out.println("Tappioita: " + tappiot);
    }
}
