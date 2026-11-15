package com.mycompany.jokuak;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author burunza.aitor
 */
public class ZenbakiaAsmatu {

    public static void main(String[] args) {
        Scanner irakurlea = new Scanner(System.in);
        zenbakiaAsmatuJokoa(irakurlea);
    }

    public static void zenbakiaAsmatuJokoa(Scanner irakurlea) {
        Random random = new Random();
        boolean berrizJokatu = true;

        while (berrizJokatu) {

            System.out.println("\n--- ZENBAKIA ASMATU ---");
            System.out.println("1- Jokalariak 1 eta 100 arteko zenbakia asmatu behar du.");
            System.out.println("2- Ordenagailuak ausazko zenbaki bat aukeratuko du.");
            System.out.println("3- Saiakera bakoitzean, esango dizut zure zenbakia txikiagoa edo handiagoa den.");
            System.out.println("4- Saiatu ahalik eta saiakera gutxienetan asmatzen!");
            System.out.println("5- Jokoa amaitzean, berriro jokatzeko aukera izango duzu.");

            System.out.print("\nHasi nahi duzu? (1- Bai / 2- Ez): ");

            // Sartutakoa zenbaki bat den begiratu
            if (!irakurlea.hasNextInt()) {
                System.out.println("Aukera okerra.");
                irakurlea.next(); // Garbitu sarrera okerra
                continue;
            }

            int aukera = irakurlea.nextInt();

            switch (aukera) {
                case 1 -> {
                    int ausazkoZenbakia = random.nextInt(100) + 1; // 1 eta 100 artean
                    int saiakerak = 0;
                    boolean amaituta = false;

                    while (!amaituta) {
                        System.out.print("Sartu zure zenbakia (1-100 edo 0 uzteko): ");

                        if (irakurlea.hasNextInt()) {
                            int sartutakoZenbakia = irakurlea.nextInt();

                            if (sartutakoZenbakia == 0) {
                                System.out.println("JOKOA AMAITU DUZU! Zenbakia: " + ausazkoZenbakia + " zen. Egindako saiakerak: " + saiakerak);
                                amaituta = true; // Ez da saiakerarik gehitzen
                            } else if (sartutakoZenbakia < 1 || sartutakoZenbakia > 100) {
                                // 1-100 tartetik kanpo: abisatu eta ez gehitu saiakerarik
                                System.out.println("Zenbakiak 1 eta 100 artean egon behar du!");
                            } else {
                                saiakerak++;

                                if (sartutakoZenbakia == ausazkoZenbakia) {
                                    System.out.println("Zorionak! Asmatu duzu " + saiakerak + " saiakeratan!");
                                    amaituta = true;
                                } else if (sartutakoZenbakia < ausazkoZenbakia) {
                                    System.out.println("Zenbakia handiagoa da!");
                                } else {
                                    System.out.println("Zenbakia txikiagoa da!");
                                }
                            }
                        } else {
                            System.out.println("Karaktere okerra! Sartu zenbaki bat!");
                            irakurlea.next();
                        }
                    }

                    System.out.print("\nBerriz jokatu nahi duzu? (1- Bai / 2- Ez): ");
                    if (irakurlea.hasNextInt()) {
                        int berrizAukera = irakurlea.nextInt();
                        if (berrizAukera != 1) {
                            berrizJokatu = false;
                        }
                    } else {
                        irakurlea.next();
                        berrizJokatu = false;
                    }
                }
                case 2 -> berrizJokatu = false;
                default -> System.out.println("Aukera okerra.");
            }
        }

        // MenuNagusiak nextLine() erabiltzen du, beraz lerro-saltoa garbitu
        if (irakurlea.hasNextLine()) {
            irakurlea.nextLine();
        }
    }
}
