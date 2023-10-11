/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marko.keskitalo
 */
import java.util.Scanner;

public class pakkasenPurevuus2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna lämpötila:\t");
        double lampo = Double.valueOf(lukija.nextLine());

        //System.out.println("Mitattu lämpötila: " + lampoC + "C");
        System.out.println("Mitattu tuulen nopeus: ");
        int tuuli = Integer.valueOf(lukija.nextLine());
        System.out.println("Tuuli on nyt " + tuulenNopeusTekstina(tuuli) + ".");

        System.out.println("Mitatulla tuulella lämpötila tuntuu kuin:" + purevuus(lampo, tuuli) + "°C");
    }

    private static Double purevuus(double lampo, int tuuli) {

        double dkerto = Math.pow(tuuli * 3.6, 0.16);
        double lampoTuntuuC = 13.12 + 0.6215 * lampo + (0.3965 * lampo - 11.37) * (dkerto);

        return lampoTuntuuC;
    }

    private static String tuulenNopeusTekstina(int tuulenNopeus) {
        String vastaus = "";
        if (tuulenNopeus < 4) {
            vastaus = "heikkoa";
        } else if (tuulenNopeus < 8) {
            vastaus = "kohtalaista";
        } else if (tuulenNopeus < 13) {
            vastaus = "navakkaa";
        } else if (tuulenNopeus < 20) {
            vastaus = "kovaa";
        } else if (tuulenNopeus > 21) {
            vastaus = "myrskyisää";
        }
        return vastaus;

    }

}
