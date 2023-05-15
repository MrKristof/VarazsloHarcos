package me.RatkaiKristof;

public class Jatek {
    public static void main (String[] args){
        Harcos harcos = new Harcos();
        Varazslo varazslo = new Varazslo();

        System.out.println("H_V --> H: " + harcos.getEletero() + ", V: " + varazslo.getEletero());

        if (harcos.getEletero() != 0 && varazslo.getEletero() != 0) {
            harcos.tamad(varazslo);
            varazslo.tamad(harcos);
            System.out.println("X__ Harc: H:" + harcos.getEletero() + ", V:" + varazslo.getEletero());
        }
    }
}