
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String syote = lukija.nextLine();

            String[] splitteri = syote.split(" ");

            System.out.println(splitteri[0]);

            if (syote.equals("")) {
                break;
            }
        }
    }
}
