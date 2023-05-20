//ITH2QY - Ratkai Kristof MI 2022/23/2 Eloalk - Elosztott alkalmazások

/*
    GITHUB Link: https://github.com/MrKristof/VarazsloHarcos
    Alapfeladat teljes
    feladatok:
    interfész használata öröklődéssel, polimorfizmussal - hogy a mezőket összehasonlítom.
    öröklődési hierarchia és saját kivételosztály használata - saját kivételt nem tudtam hova készíteni, de öröklődés van.
    szálkezelés bemutatása: a threaddel - nem tudom, hogy ez megfelelő-e annak mint feladat.
 */


package me.RatkaiKristof;

public class Jatek {
    public static void main (String[] args) throws InterruptedException {
        Harcos harcos = new Harcos("H");
        Varazslo varazslo = new Varazslo("V");
        JatekMezo jatekMezo = new JatekMezo(harcos, varazslo);
        Harc harc = new Harc();
            while (harcos.getEletero() > 0 && varazslo.getEletero() > 0 ) {
                if (harcos.compareTo(varazslo) == 0){
                    jatekMezo.kiir(harcos, varazslo);
                    System.out.println(" Harc: H: " + harcos.getEletero() + ", V: " + varazslo.getEletero());
                    harc.Harc(varazslo,harcos);
                    jatekMezo.lepes(harcos, varazslo);
                }
                else {
                    jatekMezo.kiir(harcos, varazslo);
                    System.out.println(" --> H: " + harcos.getEletero() + ", V: " + varazslo.getEletero());
                    jatekMezo.lepes(harcos, varazslo);
                }
                Thread.sleep(666);
            }
            System.out.println("H: " + harcos.getEletero() + ", V: " + varazslo.getEletero());

                if (harcos.getEletero() <= 0 && varazslo.getEletero() <= 0) {
                    System.out.println("Döntetlen!");
                }
                else if (harcos.getEletero() <= 0){
                    System.out.println("A Varazsló gyözött!");
                }
                else if (varazslo.getEletero() <=0){
                    System.out.println("A Harcos gyözött!");
                }
    }
}