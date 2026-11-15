package com.mycompany.gaztelekua;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

// Gaztelekuan eta beste programetan berrerabiltzeko metodo praktikoak.
//Sarrerak irakurri eta beste klaseetan berrerabiltzeko metodoak.
public class MetodoPraktikoak
{
    public static Scanner teklatua = new Scanner(System.in);
    private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("uuuu/MM/dd").withResolverStyle(ResolverStyle.STRICT);

    //Testua irakurtzeko metodo sinplea
    //Mezua erakutsi eta teklatutik irakurritako testua bueltatu.
    public static String HauIrakurri(Scanner sc, String mezua)
    {
        System.out.print(mezua);

        //Testua bueltatzen du.
        return sc.nextLine().trim();
    }//HauIrakurri

    //Zenbaki bat irakurtzeko metodo sinplea
    //Zenbaki osoa irakurri; oker sartuz gero berriro eskatu.
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

    //Lerro hutsak idatzi aurreko pantaila goian uzteko.
    public static void pantallaGarbitu()
    {
        //Pantaila garbitzen du
        for (int i = 0; i < 30; i++)
        {
            System.out.println();
        }//for
    }//pantallaGarbitu

    //Bai edo ez irakurri; editatzean aurreko balioa mantendu daiteke.
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

    //Testua letra xeheetara pasatu eta espazioak eta tabulazioak kendu.
    public static String sarreraKonpondu(String testua)
    {
        return testua.toLowerCase().replace(" ", "").replace("\t", "");
    }//sarreraKonpondu

    //Ordua irakurri, formatua zuzena izan arte.
    public static LocalTime SartuOrdua(Scanner sc, String mezua, LocalTime aurrekoa)
    {
        DateTimeFormatter orduFormato = DateTimeFormatter.ofPattern("HH:mm").withResolverStyle(ResolverStyle.STRICT);
        LocalTime ordua = aurrekoa;
        boolean orduZuzena = false;
        do
        {
            String sarrera = HauIrakurri(sc, mezua + " (HH:mm) [" + aurrekoa + "]: ");
            if (sarrera.isEmpty())
            {
                orduZuzena = true;
            }//if
            else
            {
                try
                {
                    ordua = LocalTime.parse(sarrera, orduFormato);
                    orduZuzena = true;
                }//try
                catch (DateTimeParseException error)
                {
                    System.out.println("Ordua ez da zuzena.");
                }//catch
            }//else
        }//do
        while (!orduZuzena);
        return ordua;
    }//SartuOrdua

    //Zenbaki hamartarra irakurri, balio negatiborik onartu gabe.
    public static double SartuDezimala(Scanner sc, String mezua, double aurrekoa)
    {
        double balioa = aurrekoa;
        boolean balioZuzena = false;
        do
        {
            String sarrera = HauIrakurri(sc, mezua + " [" + aurrekoa + "]: ");
            if (sarrera.isEmpty())
            {
                balioa = aurrekoa;
                balioZuzena = true;
            }//if
            else
            {
                try
                {
                    sarrera = sarrera.replace(',', '.');
                    balioa = Double.parseDouble(sarrera);
                    if (balioa >= 0)
                    {
                        balioZuzena = true;
                    }//if
                }//try
                catch (NumberFormatException error)
                {
                }//catch
                if (!balioZuzena)
                {
                    System.out.println("Sartu zero edo zenbaki positiboa.");
                }//if
            }//else
        }//do
        while (!balioZuzena);
        return balioa;
    }//SartuDezimala
    //Testua irakurri; Enter sakatuz gero aurreko testua mantendu.
    public static String PertsonaBerba(Scanner sc, String mezua, String aurrekoa)
    {
        String sarrera = HauIrakurri(sc, mezua + " [" + aurrekoa + "]: ");
        if (sarrera.isEmpty())
        {
            return aurrekoa;
        }//if
        return sarrera;
    }//PertsonaBerba

    //Derrigorrezko testua eskatu hutsik ez dagoen arte.
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

    //Bai edo ez irakurri; editatzean aurreko balioa mantendu daiteke.
    public static boolean BaiEz(Scanner sc, String izena, boolean aurrekoa, boolean berria)
    {
        if (berria)
        {
            return BaiEz(sc, izena);
        }//if
        boolean balioa = aurrekoa;
        boolean erantzunZuzena = false;
        do
        {
            String aurrekoTestua = "ez";
            if (aurrekoa)
            {
                aurrekoTestua = "bai";
            }//if
            String s = HauIrakurri(sc, izena + " (bai/ez, hutsik = mantendu) [" + aurrekoTestua + "]: ");
            if (s.isEmpty())
            {
                erantzunZuzena = true;
            }//if
            else if (s.equalsIgnoreCase("bai"))
            {
                balioa = true;
                erantzunZuzena = true;
            }//else if
            else if (s.equalsIgnoreCase("ez"))
            {
                balioa = false;
                erantzunZuzena = true;
            }//else if
            else
            {
                System.out.println("Balio okerra.");
            }//else
        }//do
        while (!erantzunZuzena);
        return balioa;
    }//BaiEz

    //Erabiltzailearen zenbakia zerrendaren posiziora pasatu: 1etik 0ra.
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

    //Data irakurri; Enter sakatuz gero aurreko data mantendu.
    public static LocalDate SartuData(Scanner sc, String mezua, LocalDate aurrekoa)
    {
        LocalDate data = aurrekoa;
        boolean dataZuzena = false;
        do
        {
            String aurrekoTestua = "";
            if (aurrekoa != null)
            {
                aurrekoTestua = aurrekoa.format(formato);
            }//if
            String sarrera = HauIrakurri(sc, mezua + " (uuuu/MM/dd) [" + aurrekoTestua + "]: ");
            if (sarrera.isEmpty())
            {
                dataZuzena = true;
            }//if
            else
            {
                try
                {
                    data = LocalDate.parse(sarrera, formato);
                    dataZuzena = true;
                }//try
                catch (DateTimeParseException error)
                {
                    System.out.println("Data ez da zuzena.");
                }//catch
            }//else
        }//do
        while (!dataZuzena);
        return data;
    }//SartuData

    //HauIrakurri baina enter jasotzeko bakarrik (itxaroteko)
    //Enter sakatu arte itxaron, emaitza irakurtzeko denbora emanez.
    public static void EnterItxaron(Scanner sc)
    {
        HauIrakurri(sc, "\nSakatu Enter jarraitzeko: ");
    }//EnterItxaron
}//MetodoPraktikoak
