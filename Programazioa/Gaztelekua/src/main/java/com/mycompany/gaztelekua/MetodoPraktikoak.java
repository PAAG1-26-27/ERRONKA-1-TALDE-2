package com.mycompany.gaztelekua;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

// Gaztelekuan eta beste programetan berrerabiltzeko metodo praktikoak.
public class MetodoPraktikoak
{
    public static Scanner teklatua = new Scanner(System.in);
    private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("uuuu/MM/dd").withResolverStyle(ResolverStyle.STRICT);

    //Testua irakurtzeko metodo sinplea
    public static String HauIrakurri(Scanner sc, String mezua)
    {
        System.out.print(mezua);

        //Testua bueltatzen du.
        return sc.nextLine().trim();
    }//HauIrakurri

    //Zenbaki bat irakurtzeko metodo sinplea
    public static int SartuZenbakia(Scanner sc, String mezua)
    {
        //Aldagaiak sortu eta hasierarazi
        int zbk1 = 0;
        boolean ezDaInt;

        do
        {
            //Zenbaki oso bat sartu arte errepikatu du eskaria
            ezDaInt = false;
            try
            {
                System.out.print(mezua);
                zbk1 = Integer.parseInt(sc.nextLine().trim());
            }//try
            catch (NumberFormatException error)
            {
                System.out.println("Sartu zenbaki bat, mesedez.\n");
                ezDaInt = true;
            }//catch
        }//do
        while (ezDaInt);

        //Zenbakia bueltatzen du.
        return zbk1;
    }//SartuZenbakia

    //Data bat irakurtzeko metodoa (nahiak egindakua)
    public static LocalDate SartuData(Scanner sc)
    {
        //Aldagaiak sortu eta hasierarazi
        String sarrera;
        LocalDate data = null;
        boolean arazorik;
        do
        {
            //Zenbaki egoki bat sartu arte errepikatu du eskaria
            arazorik = false;
            try
            {
                System.out.print("\nSartu data(uuuu/HH/ee) formatuan: ");
                sarrera = sc.nextLine().trim();
                data = LocalDate.parse(sarrera, formato);
            }//try
            catch (DateTimeParseException error)
            {
                System.out.println("Datarentzako formatu desegokia erabili duzu.");
                arazorik = true;
            }//catch
        }//do
        while (arazorik);
        return data;
    }//SartuData

    public static void pantallaGarbitu()
    {
        //Pantaila garbitzen du
        for (int i = 0; i < 30; i++)
        {
            System.out.println();
        }//for
    }//pantallaGarbitu

    public static boolean BaiEz(Scanner sc, String mezua)
    {
        String erantzuna;
        do
        {
            erantzuna = HauIrakurri(sc, mezua + " (bai/ez): ").toLowerCase();
            if (!erantzuna.equals("bai") && !erantzuna.equals("ez"))
            {
                System.out.println("Sarturiko balioa ez da zuzena.");
            }//if
        }//do
        while (!erantzuna.equals("bai") && !erantzuna.equals("ez"));
        return erantzuna.equals("bai");
    }//BaiEz

    public static String HauIrakurri(String mezua)
    {
        return HauIrakurri(teklatua, mezua);
    }//HauIrakurri

    public static String normalizatu(String testua)
    {
        return testua.toLowerCase().replace(" ", "").replace("\t", "");
    }//normalizatu

    public static LocalTime SartuOrdua(Scanner sc, String mezua, LocalTime aurrekoa)
    {
        DateTimeFormatter orduFormato = DateTimeFormatter.ofPattern("HH:mm").withResolverStyle(ResolverStyle.STRICT);
        while (true)
        {
            String sarrera = HauIrakurri(sc, mezua + " (HH:mm) [" + aurrekoa + "]: ");
            if (sarrera.isEmpty())
            {
                return aurrekoa;
            }//if
            try
            {
                return LocalTime.parse(sarrera, orduFormato);
            }//try
            catch (DateTimeParseException error)
            {
                System.out.println("Ordua ez da zuzena.");
            }//catch
        }//while
    }//SartuOrdua

    public static double SartuDezimala(Scanner sc, String mezua, double aurrekoa)
    {
        while (true)
        {
            String sarrera = HauIrakurri(sc, mezua + " [" + aurrekoa + "]: ");
            if (sarrera.isEmpty())
            {
                return aurrekoa;
            }//if
            try
            {
                sarrera = sarrera.replace(',', '.');
                double balioa = Double.parseDouble(sarrera);
                if (balioa >= 0)
                {
                    return balioa;
                }//if
            }//try
            catch (NumberFormatException error)
            {
            }//catch
            System.out.println("Sartu zero edo zenbaki positiboa.");
        }//while
    }//SartuDezimala
    public static String PertsonaBerba(Scanner sc, String mezua, String aurrekoa)
    {
        String sarrera = HauIrakurri(sc, mezua + " [" + aurrekoa + "]: ");
        if (sarrera.isEmpty())
        {
            return aurrekoa;
        }//if
        return sarrera;
    }//PertsonaBerba

    public static String DerrigorrezkoBerba(Scanner sc, String mezua)
    {
        String sarrera;
        do
        {
            sarrera = HauIrakurri(sc, mezua);
            if (sarrera.isEmpty())
            {
                System.out.println("Datu hau ezin da hutsik utzi.");
            }//if
        }//do
        while (sarrera.isEmpty());
        return sarrera;
    }//DerrigorrezkoBerba

    public static boolean BaiEz(Scanner sc, String izena, boolean aurrekoa, boolean berria)
    {
        if (berria)
        {
            return BaiEz(sc, izena);
        }//if
        while (true)
        {
            String aurrekoTestua = "ez";
            if (aurrekoa)
            {
                aurrekoTestua = "bai";
            }//if
            String s = HauIrakurri(sc, izena + " (bai/ez, hutsik = mantendu) [" + aurrekoTestua + "]: ");
            if (s.isEmpty())
            {
                return aurrekoa;
            }//if
            if (s.equalsIgnoreCase("bai"))
            {
                return true;
            }//if
            if (s.equalsIgnoreCase("ez"))
            {
                return false;
            }//if
            System.out.println("Balio okerra.");
        }//while
    }//BaiEz

    public static int Aukeratu(Scanner sc, int kopurua)
    {
        int aukera;
        if (kopurua == 0)
        {
            System.out.println("Ez dago daturik aukeratzeko.");
            return - 1;
        }//if
        do
        {
            aukera = SartuZenbakia(sc, "Aukeratu erregistro bat(1-" + kopurua + "): ");
            if (aukera < 1 || aukera > kopurua)
            {
                System.out.println("Aukera ez da zuzena.");
            }//if
        }//do
        while (aukera < 1 || aukera > kopurua);
        // ArrayList-aren posizioak 0tik hasten dira.
        return aukera - 1;
    }//Aukeratu

    public static LocalDate SartuData(Scanner sc, String mezua, LocalDate aurrekoa)
    {
        while (true)
        {
            String aurrekoTestua = "";
            if (aurrekoa != null)
            {
                aurrekoTestua = aurrekoa.format(formato);
            }//if
            String sarrera = HauIrakurri(sc, mezua + " (uuuu/MM/dd) [" + aurrekoTestua + "]: ");
            if (sarrera.isEmpty())
            {
                return aurrekoa;
            }//if
            try
            {
                return LocalDate.parse(sarrera, formato);
            }//try
            catch (DateTimeParseException error)
            {
                System.out.println("Data ez da zuzena.");
            }//catch
        }//while
    }//SartuData

    public static void EnterItxaron(Scanner sc)
    {
        HauIrakurri(sc, "\nSakatu Enter jarraitzeko: ");
    }//EnterItxaron
}//MetodoPraktikoak
