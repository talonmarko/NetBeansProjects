
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
public class koodiralli2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int mista = Integer.valueOf(lukija.nextLine());
        int mihin = Integer.valueOf(lukija.nextLine());
        for (int i = mista; i <= mihin; i++) {
            System.out.println(i);
        }

    }
}
