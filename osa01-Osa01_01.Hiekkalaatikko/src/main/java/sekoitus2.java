
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marko.keskitalo
 */
public class sekoitus2 {

    public static void main(String args[]) {
        Random r = new Random();

        //määritellään array-lista nimeltään nimet
        ArrayList<String> nimet = new ArrayList<>();
        nimet.add("Aku");
        nimet.add("Bertta");
        nimet.add("Cecilia");
        nimet.add("Daavid");
        nimet.add("Erkki");
        nimet.add("Fidelio");
        nimet.add("Gideon");
        nimet.add("Heikki");
        nimet.add("Iiro");


        System.out.println(nimet);

        //luodaan tyhjä arraylista, johon tulee nimet sekoitettuna
        ArrayList<String> sekoitetutNimet = new ArrayList<>();

        int i = nimet.size();

        while (i > 0) {
            int satu = r.nextInt(nimet.size());
            String poiminta = nimet.get(satu);
            sekoitetutNimet.add(poiminta);
            nimet.remove(satu);
            i = i - 1;

        }
        System.out.println(sekoitetutNimet);
    }
}
