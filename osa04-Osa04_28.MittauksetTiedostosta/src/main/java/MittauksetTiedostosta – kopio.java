
import java.nio.file.Paths;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        

        Scanner lukija = new Scanner(System.in);
        System.out.println("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.println("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.println("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        
        try ( Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto))) {
            int maara = 0;
            while (tiedostonlukija.hasNextLine()) {
                
                String lukumerkkijonona = tiedostonlukija.nextLine();
                int luku = Integer.valueOf(lukumerkkijonona);                
                
                if (luku >= alaraja && luku <= ylaraja) {
                    maara++;
                }
            }
            
            System.out.println("Lukuja: " + maara);
        } catch (Exception e) {
            System.out.println("Virhe tiedoston " +tiedosto + " lukemisessa!");
        }
    }
}