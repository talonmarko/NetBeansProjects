/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marko.keskitalo
 */
import java.util.Arrays;
import java.util.Random;

public class pinkoodi {

    public static void main(String args[]) {

        String muotti = "ABBACC";
        //String lukujono = "1357908642";    
        String lukujono = randomize();
        String abcLista = "ABCDEFGHIJ";
        String pin = "";
        
        for (int i = 0; i < muotti.length(); i++) {

            //char kirjain = pinkoodi.charAt(i);
            //int kirjaimenSijainti = abcLista.indexOf(kirjain);
            //char vastaavaNumero = lukujono.charAt(kirjaimenSijainti);
            pin = pin + lukujono.charAt(abcLista.indexOf(muotti.charAt(i)));

        }
        System.out.println("pin-koodi on " + pin);
    }

    static String muotinArpoja() {
        Random arpoja = new Random();
        String[] muotit = {"AABBCB", "ABCABC", "ABAACA", "AABCCA", "ABABBA", "AAABCB"};
        String arvottuMuotti = muotit[arpoja.nextInt(5)];
        return arvottuMuotti;
    }
    
    static String randomize() {
        Random r = new Random();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        String palautus = Arrays.toString(arr);
        String joinedString = String.join("", palautus);               
        palautus=palautus.replaceAll(", " ,"").substring(1, 11);
        return palautus;
    }

}
