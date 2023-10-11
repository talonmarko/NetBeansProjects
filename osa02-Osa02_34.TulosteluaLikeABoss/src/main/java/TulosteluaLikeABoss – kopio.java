
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
        for (int i = 1; i <= maara; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        for (int i = 1; i <= maara; i++) {
            System.out.print(" ");
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2
        for (int i = koko; i > 0; i--) {
            tulostaTyhjaa(i - 1);
            tulostaTahtia(koko - i + 1);
        }
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        for (int i = 1; i <= korkeus; i++) {
            tulostaTyhjaa(korkeus - i);
            tulostaTahtia(i+(i-1));
        }
        for (int i = 0; i < 2; i++) {
            tulostaTyhjaa(korkeus - 2);
            tulostaTahtia(3);
        }
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(3);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}