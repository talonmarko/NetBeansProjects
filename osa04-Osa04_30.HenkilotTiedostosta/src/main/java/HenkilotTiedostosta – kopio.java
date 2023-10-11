
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        ArrayList<Henkilo> henkilot = lueHenkilot(tiedosto);
        System.out.println("");
        System.out.println("Henkilöitä: " + henkilot.size());
        System.out.println("");
        System.out.println("Henkilöt:");
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);
        }
    }

    public static ArrayList<Henkilo> lueHenkilot(String tiedosto){
        ArrayList<Henkilo> henkilot = new ArrayList<>();

        // toteuta henkilöiden lukeminen ja luominen tänne
        try ( Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto))) {

            while (tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();

                String[] palat = rivi.split(",");
                String nimi = palat[0];
                int ika = Integer.valueOf(palat[1]);

                henkilot.add(new Henkilo(nimi, ika));
            }
        } catch (Exception e) {
            System.out.println("Virhe tiedoston " + tiedosto + " lukemisessa!");
        }
        return henkilot;
    }
}
