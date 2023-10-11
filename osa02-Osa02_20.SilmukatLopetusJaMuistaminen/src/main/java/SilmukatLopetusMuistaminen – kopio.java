
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);

        int summa = 0, maara = 0, parilliset = 0, parittomat = 0;
        double keskiarvo;
       


        System.out.println("Syötä luvut:");

        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote == -1) {
                break;
            }else{
                summa+=syote;
            }            
            
            maara++;
            if(syote%2==0){
                parilliset++;
            }else{
                parittomat++;
            }
                
            
        }
        keskiarvo=(1.0*summa)/maara;
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " +summa);
        System.out.println("Lukuja: " +maara);
        System.out.println ("Keskiarvo: " +keskiarvo);    
        System.out.println("Parillisia: " +parilliset);
        System.out.println("Parittomia: " +parittomat);
    }

}
