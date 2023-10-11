
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
public class sekoitus {

    public static void main(String args[]) {
        Random r = new Random();


        String numerot = "0123456789";

        String sekNumerot = "";

        int i = numerot.length();


        //System.out.println(numerot);

        while (i>0) {

            //määritellään eli arvotaan satunnaisluku
            int satu = r.nextInt(numerot.length());
            //System.out.println(satu + "\t");
            //System.out.println(numerot + "\t");

            
            String merkki = String.valueOf(numerot.charAt(satu));
            //System.out.println(merkki+ "\t");

            
            sekNumerot = sekNumerot + merkki;
            //System.out.print(sekNumerot + "\t");

            
            String uusi = numerot.replace(merkki, "");
            numerot = uusi;
            //System.out.println(numerot);
            
            i--;
            
        }
        for(int j=0;j<sekNumerot.length();j++){
            char merkki = sekNumerot.charAt(j);
            System.out.println(merkki);
            int merkkiNumerona = Character.getNumericValue(merkki);
        }
    }
}
