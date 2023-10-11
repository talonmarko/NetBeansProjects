
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int vanhin = 0;

        while (true) {
            String syote = lukija.nextLine();

            if (syote.isEmpty()) {
                break;
            }

            String[] osat = syote.split(",");
            int ika = Integer.valueOf(osat[1]);
            if (ika > vanhin) {
                vanhin = ika;
            }
        }
        System.out.println("Vanhimman ikä on: " + vanhin);
    }
}
