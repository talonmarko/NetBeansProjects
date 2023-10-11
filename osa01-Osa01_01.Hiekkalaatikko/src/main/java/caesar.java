
public class caesar {

    public static void main(String[] args) {
        String viesti = "keisari tulee kylään torstaina, olkaa valmiina!".toUpperCase();
        int s = 1;
        System.out.println("teksti:\t" + viesti);
        System.out.println("siirtymä:\t" + s);
        System.out.println("salattuna:\t" + salaa(viesti, s));
        salaa(viesti, s);
    }

    public static StringBuffer salaa(String kasiteltavaTeksti, int siirtyma) {

        String aakkoset = "ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ";
        StringBuffer valmis = new StringBuffer();
        //String valmis = ""; ota edellisestä Buffer pois
        for (int i = 0; i < kasiteltavaTeksti.length(); i++) {
            //System.out.print(kasiteltavaTeksti.charAt(i));
            int sijainti = aakkoset.indexOf(kasiteltavaTeksti.charAt(i));
            //System.out.print("\t" + sijainti);
            char ch = aakkoset.charAt(sijainti + siirtyma % aakkoset.length());
            //System.out.println("\t" + ch);
            valmis.append(ch);
        }
        return valmis;
    }
}
