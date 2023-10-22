package org.example;

import org.example.Dao.DaoImpl;
import org.example.Metier.MetierImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Presentation {
    public static void main (String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Résultat:" + metier.calcul());

    }
}