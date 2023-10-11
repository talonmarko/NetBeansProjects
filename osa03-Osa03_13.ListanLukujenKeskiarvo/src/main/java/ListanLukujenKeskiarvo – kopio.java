
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        int summa = 0;
        for (int luettu : lista) {
            summa = summa + luettu;

            System.out.println("");

            // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
            // lukuja listalle kunnes käyttäjä syöttää luvun -1.
            // ohjelma laskee tämän jälkeen listalla olevien lukujen
            // keskiarvon, ja tulostaa sen käyttäjän näkyville
            double keskiarvo = 1.0 * summa / lista.size();

            System.out.println("Keskiarvo:" + keskiarvo);
        }
    }
}
