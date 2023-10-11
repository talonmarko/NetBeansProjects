
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna pisteet:");
        int as0 = Integer.valueOf(lukija.nextLine());
        if (as0 < 0) {
            System.out.println("Arvosana: " + "mahdotonta!");
        }else if (as0 < 50) {
            System.out.println("Arvosana: " + "hylätty");
        }else if (as0 < 60) {
            System.out.println("Arvosana: " + "1");}
        else if (as0 < 70) {
            System.out.println("Arvosana: " + "2");
        
        }else if (as0 < 80) {
            System.out.println("Arvosana: " + "3");
        }
        else if (as0 < 90) {
            System.out.println("Arvosana: " + "4");
        }else if (as0 <= 100) {
            System.out.println("Arvosana: " + "5");
        }
        else{
            System.out.println("uskomatonta!");
        }
    }
}
