package org.example;

import org.example.Dao.IDao;
import org.example.Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/main/java/Config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();
            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();
            Method m = cMetier.getMethod("setDao",IDao.class);
            m.invoke(metier,dao);
            System.out.println(" Resultat de calcul :" + metier.calcul());
        }catch (Exception e) {e.printStackTrace();}
    }
    }
