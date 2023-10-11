/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marko.keskitalo
 */
public class PakkasenPurevuus {

    public static void main(String[] args) {
        System.out.println("Anna lämpötila:\t");
        double lampoC = -30.0; //lämpötila celsius-asteina
        double tuulenNopeus = 20.0; //tuulen nopeus metreinä sekunnissa

        System.out.println("Mitattu lämpötila: " + lampoC + "C");

        System.out.println("Mitattu tuulen nopeus: " + tuulenNopeus + "m/s");
        
        System.out.println("Mitatulla tuulella lämpötila tuntuu kuin:" + purevuus(lampoC, tuulenNopeus) + "°C");
}
    

    

    private static Double purevuus(double lampoC, double tuulenNopeus) {

        double dkerto = Math.pow(tuulenNopeus * 3.6, 0.16);
        double lampoTuntuuC = 13.12 + 0.6215 * lampoC + (0.3965 * lampoC - 11.37) * (dkerto);

        return lampoTuntuuC;
    }
}
