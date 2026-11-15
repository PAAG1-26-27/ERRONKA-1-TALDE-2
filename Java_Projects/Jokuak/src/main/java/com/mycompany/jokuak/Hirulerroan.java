
package com.mycompany.jokuak;

import java.util.Random;
import java.util.Scanner;

public class Hirulerroan {

    static Scanner sc;
    static Random rand = new Random();
    static char[][] taula = new char[3][3];

    public static void jokatu(Scanner scanner) {
        sc = scanner;

        System.out.println("===== HIRU LERROAN =====");
        System.out.println("Jokalaria X da eta ordenagailua O.");
        System.out.println("Aukeratu 1etik 9ra posizio bat.");
        System.out.println("Hiru lerroan lortzen duenak irabazten du.");

        partidaBat();

        System.out.println("Menu nagusira bueltatzen...");
    }

    static void partidaBat() {
        taulaHustu();

        char txanda = 'X';
        int mugimenduak = 0;
        boolean amaitu = false;

        do {
            taulaInprimatu();

            if (txanda == 'X') {
                jokalariarenTxanda();
            } else {
                ordenagailuarenTxanda();
            }

            mugimenduak++;

            if (irabazlea('X') || irabazlea('O') || mugimenduak == 9) {
                amaitu = true;
            } else {
                if (txanda == 'X') {
                    txanda = 'O';
                } else {
                    txanda = 'X';
                }
            }

        } while (!amaitu);

        taulaInprimatu();

        if (irabazlea('X')) {
            System.out.println("IRABAZI DUZU!");
        } else if (irabazlea('O')) {
            System.out.println("GALDU EGIN DUZU!");
        } else {
            System.out.println("BERDINKETA!");
        }
    }

    static void jokalariarenTxanda() {
        int aukera;
        int errenkada;
        int zutabea;
        boolean zuzena = false;

        do {
            System.out.println("Aukeratu posizioa (1-9):");
            aukera = irakurriZenbakia();

            if (aukera >= 1 && aukera <= 9) {
                errenkada = (aukera - 1) / 3;
                zutabea = (aukera - 1) % 3;

                if (taula[errenkada][zutabea] == ' ') {
                    taula[errenkada][zutabea] = 'X';
                    zuzena = true;
                } else {
                    System.out.println("Posizioa okupatuta dago.");
                }
            } else {
                System.out.println("Posizio okerra.");
            }

        } while (!zuzena);
    }

    static void ordenagailuarenTxanda() {
        int errenkada;
        int zutabea;

        do {
            errenkada = rand.nextInt(3);
            zutabea = rand.nextInt(3);
        } while (taula[errenkada][zutabea] != ' ');

        taula[errenkada][zutabea] = 'O';

        System.out.println("Ordenagailuak jokatu du.");
    }

    static boolean irabazlea(char ikurra) {
        for (int i = 0; i < 3; i++) {
            if (taula[i][0] == ikurra &&
                    taula[i][1] == ikurra &&
                    taula[i][2] == ikurra) {
                return true;
            }

            if (taula[0][i] == ikurra &&
                    taula[1][i] == ikurra &&
                    taula[2][i] == ikurra) {
                return true;
            }
        }

        if (taula[0][0] == ikurra &&
                taula[1][1] == ikurra &&
                taula[2][2] == ikurra) {
            return true;
        }

        if (taula[0][2] == ikurra &&
                taula[1][1] == ikurra &&
                taula[2][0] == ikurra) {
            return true;
        }

        return false;
    }

    static void taulaHustu() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                taula[i][j] = ' ';
            }
        }
    }

    static void taulaInprimatu() {
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(" " + taula[i][0] + " | " +
                    taula[i][1] + " | " +
                    taula[i][2]);

            if (i < 2) {
                System.out.println("---+---+---");
            }
        }

        System.out.println();
    }

    static int irakurriZenbakia() {
        int zenbakia;

        try {
            zenbakia = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            zenbakia = -1;
        }

        return zenbakia;
    }
}
