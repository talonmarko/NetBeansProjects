
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String syote = lukija.nextLine();

            String[] splitteri = syote.split(" ");

            for (String osa : splitteri) {
                if (osa.contains("av")) {
                    System.out.println(osa);
                }

            }
            if (syote.equals("")) {
                break;
            }
        }
    }
}
