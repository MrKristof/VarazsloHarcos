package me.RatkaiKristof;

public class Jatek {
    public static void main (String[] args){
        Harcos harcos = new Harcos();
        Varazslo varazslo = new Varazslo();
        JatekMezo jatekMezo = new JatekMezo();
        Harc harc = new Harc();

        jatekMezo.lepes(harcos,varazslo);

        while (harcos.getEletero() > 0 && varazslo.getEletero() > 0 ) {
            jatekMezo.mezo();
            System.out.println(" --> H: " + harcos.getEletero() + ", V: " + varazslo.getEletero());
            harc.Harc(varazslo,harcos);
            System.out.println("X__ Harc: H: " + harcos.getEletero() + ", V: " + varazslo.getEletero());
        }

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