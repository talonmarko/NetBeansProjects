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

public class koodiralli {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Syötä kerrottava luku:");

        int kerrottava = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(kerrottava + " * " + i + " = "
                    + kerrottava * i);
        }
    }
}
