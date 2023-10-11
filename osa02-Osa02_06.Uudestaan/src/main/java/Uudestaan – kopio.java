import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true){
            System.out.println("Syötä luku");
            String lopetus = lukija.nextLine();
            if (lopetus.equals("4")){
                break;
            }
        }
    }
}
