
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
public class tilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //int maara;
        //int onnistuneet;
        //float heittoprosentti;
        //System.out.println("Syötä heittojen kokonaismäärä:");
        //    int maara = Integer.valueOf(lukija.nextLine());
        //System.out.println("Syötä onnistuneiden heittojen määrä:");
        //    int onnistuneet = Integer.valueOf(lukija.nextLine());
        //float heittoprosentti = 1.0 * maara / onnistuneet; 
        //System.out.println(maara + " / " + onnistuneet + " = " + heittoprosentti);    
        double prosentti;
        double yhteensa;
        double onnistuneet;

        Scanner sc = new Scanner(System.in);

        System.out.println("Syötä heittojen määrä yhteensä:");

        yhteensa = sc.nextInt();

        System.out.println("Syötä onnistuneiden heittojen määrä:");

        onnistuneet = sc.nextInt();        
        
        prosentti = Math.round((onnistuneet / yhteensa * 100) * 10) / 10.0;
        
        System.out.println("Heittojesi onnistumisprosessi on " + prosentti + "%");
    }
}
