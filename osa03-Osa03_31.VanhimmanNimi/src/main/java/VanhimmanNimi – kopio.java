
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int vanhin = 0;
        String vanhimmannimi = "";

        while (true) {
            String syote = lukija.nextLine();

            if (syote.isEmpty()) {
                break;
            }

            String[] osat = syote.split(",");
            int ika = Integer.valueOf(osat[1]);
            if (ika > vanhin) {
                vanhin = ika;
                vanhimmannimi = osat[0];
            }
        }
        System.out.println("Vanhimman nimi on: " + vanhimmannimi);
    }
}

