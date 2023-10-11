
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marko.keskitalo
 */
public class testiequals {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä teksti:");
        String teksti = lukija.nextLine();

        System.out.println("Syötä toinen teksti:");
        String toinenTeksti = lukija.nextLine();

        if (teksti.equals(toinenTeksti)) {
            System.out.println("Oikein, syötit samat tekstit!");
        } else {
            System.out.println("Väärin, syötit eri tekstit!");
        }
    }
}
