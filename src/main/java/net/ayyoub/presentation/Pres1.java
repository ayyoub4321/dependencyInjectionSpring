package net.ayyoub.presentation;

import net.ayyoub.ext.DaoImplV2;
import net.ayyoub.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("Le resultat est : "+metier.calcul());
    }
}
