/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marko.keskitalo
 */
public class koodiralli4 {

    public static void main(String[] args) {
        tulostaNelio(5);
    }

    public static void tulostaTahtia(int koko) {
        for (int i = 1; i <= koko; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void tulostaNelio(int koko) {
        for (int i = 1; i <= koko; i++) {
            tulostaTahtia(koko);
        }
    }
}
