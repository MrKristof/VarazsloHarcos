package me.RatkaiKristof;

import java.util.Random;

public class Harc {

    public void Harc(Varazslo varazslo, Harcos harcos){
        Random rnd = new Random();
        int Hsebzes = rnd.nextInt(6)+1; //D6 sebzes 1-6
        int Vsebzes = rnd.nextInt(6)+1;
        varazslo.setEletero(varazslo.getEletero() - Hsebzes);
        harcos.setEletero(harcos.getEletero()- Vsebzes);
    }
}
