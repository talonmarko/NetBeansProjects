
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String syote = lukija.nextLine();

            String[] splitteri = syote.split(" ");

            System.out.println(splitteri[splitteri.length-1]);

            if (syote.equals("")) {
                break;
            }
        }
    }
}
