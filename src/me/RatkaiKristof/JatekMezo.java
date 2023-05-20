package me.RatkaiKristof;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JatekMezo {
    private final int mezoMeret;
    private Harcos harcos;
    private Varazslo varazslo;

    public JatekMezo(Harcos harcos, Varazslo varazslo){
        this.harcos=harcos;
        this.varazslo=varazslo;
        this.mezoMeret = 3;
    }
    public void kiir(Harcos harcos, Varazslo varazslo){
        ArrayList<Character> mezosz;
        mezosz = new ArrayList<>(mezoMeret);
        for (int i = 0; i < mezoMeret; i++) {
                mezosz.add('_');
            }
        if (harcos.getMezo() != varazslo.getMezo()){
                mezosz.set(harcos.getMezo(), 'H');
                mezosz.set(varazslo.getMezo(), 'V');
            }
        else if(varazslo.getMezo() == harcos.getMezo()){
                mezosz.set(varazslo.getMezo() ,'X');
            }
        for (char c : mezosz){
            System.out.print(c);
        }
    }

    public void lepes(Harcos harcos, Varazslo varazslo){
        Random rnd = new Random();
        harcos.setMezo(rnd.nextInt(3));
        varazslo.setMezo(rnd.nextInt(3));
    }

   /* public void mezo(){
        for (char c : mezosz){
            System.out.print(c);
        }
    }*/
}
