import java.util.Scanner;

public class virtaama {
    

    public static void main(String[] args) {
        double kerroin = 0;

        Scanner lukija = new Scanner(System.in);
                
        System.out.println("Paljonko mittasit vettä? Anna vastaus desilitroina.");
            int vesi = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Kuinka paljon aikaa kului? Anna aika sekunteina.");
            int aika = Integer.valueOf(lukija.nextLine());
            
            kerroin = 60 / aika;
            //System.out.println(kerroin);
            
            System.out.println("Virtaama on " + kerroin + " litraa minuutissa " + "tai " + kerroin*0.26 + " gallonaa minuutissa.");
            System.out.println("Virtaaman voisi ilmoittaa myös muodossa " + kerroin*66.6 + " ruokalusikallista minuutissa tai " +kerroin*33.81 + " nesteunssia minuutissa.");
            System.out.println("Virtaaman voi ilmoittaa myös " + kerroin*0.0062 + " barrelia minuutissa mutta se onko siinä enää mitään järkeä, jääköön käyttäjän päätettäväksi.");
    }
}