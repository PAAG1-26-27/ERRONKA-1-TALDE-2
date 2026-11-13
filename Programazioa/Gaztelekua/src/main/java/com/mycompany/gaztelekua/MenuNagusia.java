/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.gaztelekua;
import java.util.Scanner;
import java.time.LocalTime;
import static com.mycompany.gaztelekua.MetodoPraktikoak.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
/**
* @authors
*      Jon Ander Estevez Del Palacio
*      Nora Ortiz de Lejarazu Rascon
*      Huzaima Muhammad Bibi
*      Aitor Burunza Gil
*/
// Pertsonen eta ekintzen kudeaketa.
public class MenuNagusia
{

    Scanner sc = MetodoPraktikoak.teklatua;
    //Pertsona guztiak zerrenda berean gorde
    ArrayList<Pertsona> pertsonak = new ArrayList<>();
    ArrayList<Ekintza> ekintzak = new ArrayList<>();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("uuuu/MM/dd").withResolverStyle(ResolverStyle.STRICT);

    //Pertsona mota guztiek datu komun berak dituzte
    public void PertsonaDatuak(Pertsona p, boolean berria)
    {
        if (berria)
        {
            String NAN = DerrigorrezkoBerba(sc, "NAN: ");
            p.setNAN(NAN);
            String Izena = DerrigorrezkoBerba(sc, "Izena: ");
            p.setIzena(Izena);
            String Abizena = DerrigorrezkoBerba(sc, "Abizenak: ");
            p.setAbizena(Abizena);
        }//if
        else
        {
            System.out.println("Hutsik utziz gero, aurreko balioa mantenduko da.");
            String NAN = PertsonaBerba(sc, "NAN", p.getNANBalioa());
            p.setNAN(NAN);
            String Izena = PertsonaBerba(sc, "Izena", p.getIzenaBalioa());
            p.setIzena(Izena);
            String Abizena = PertsonaBerba(sc, "Abizenak", p.getAbizenaBalioa());
            p.setAbizena(Abizena);
        }//else
        String Herrialdea = PertsonaBerba(sc, "Herrialdea", p.getHerrialdeaBalioa());
        p.setHerrialdea(Herrialdea);
        String Helbidea = PertsonaBerba(sc, "Helbidea", p.getHelbideaBalioa());
        p.setHelbidea(Helbidea);
        String PostaKodea = PertsonaBerba(sc, "Posta-Kodea", p.getPostaKodeaBalioa());
        p.setPostaKodea(PostaKodea);
        String Telefonoa = PertsonaBerba(sc, "Telefonoa", p.getTelefonoaBalioa());
        p.setTelefonoa(Telefonoa);
        LocalDate JaiotzaData = SartuData(sc, "Jaiotza data", p.getJaiotzaDataBalioa());
        p.setJaiotzaData(JaiotzaData);
        String Email = PertsonaBerba(sc, "Email", p.getEmailBalioa());
        p.setEmail(Email);
    }//PertsonaDatuak
    // Menuak OntziakHondoratu jokoaren lauki eta switch eredua erabiltzen du.
    private void laukia(String titulua, String...aukerak)
    {
        System.out.println("\n┌──────────────────────────────────────┐");
        System.out.printf("│ %-36s │%n", titulua);
        System.out.println("├──────────────────────────────────────┤");
        for (String aukera : aukerak)
        {
            System.out.printf("│ %-36s │%n", aukera);
        }//for
        System.out.println("└──────────────────────────────────────┘");
    }//laukia

    private String irakurri()
    {
        return normalizatu(HauIrakurri(sc, "Aukera: "));
    }//irakurri

    public void menuNagusia(Scanner sc)
    {
        this.sc = sc;
        MetodoPraktikoak.teklatua = sc;
        while (true)
        {
            pantallaGarbitu();
            laukia("MENU NAGUSIA", "1 - EKINTZAK", "2 - PERTSONAK", "0 - IRTEN");
            switch (irakurri())
            {
                case "1":
                case "ekintzak":
                {
                    menuEkintzak();
                }//case 1, ekintzak
                break;
                case "2":
                case "pertsonak":
                {
                    menuPertsonak();
                }//case 2, pertsonak
                break;
                case "0":
                case "*":
                case "irten":
                {
                    System.out.println("Programa itxi da.");
                    return;
                }//case *, irten
                default:
                {
                    System.out.println("Aukera ez da zuzena.");
                }//default
                break;
            }//switch
        }//while
    }//menuNagusia

    public void menuPertsonak()
    {
        taldeMenua(true);
    }//menuPertsonak

    public void menuEkintzak()
    {
        taldeMenua(false);
    }//menuEkintzak

    private void taldeMenua(boolean pertsona)
    {
        while (true)
        {
            pantallaGarbitu();
            if (pertsona)
            {
                laukia("PERTSONAK", "Enter: Denak", "1 - Gazteak", "2 - Langileak", "3 - Tutoreak", "0 - Atzera");
            }//if
            else
            {
                laukia("EKINTZAK", "Enter: Denak", "1 - Asteburukoak", "2 - Udakoak", "0 - Atzera");
            }//else
            String aukera = irakurri();
            if (aukera.equals("0") || aukera.equals("atzera"))
            {
                return;
            }//if
            String mota;
            switch (aukera)
            {
                case "":
                case "denak":
                {
                    mota = "denak";
                }//case , denak
                break;
                case "1":
                {
                    if (pertsona)
                    {
                        mota = "gaztea";
                    }//if
                    else
                    {
                        mota = "asteburukoak";
                    }//else
                }//case 1
                break;
                case "2":
                {
                    if (pertsona)
                    {
                        mota = "langilea";
                    }//if
                    else
                    {
                        mota = "udakoak";
                    }//else
                }//case 2
                break;
                case "3":
                {
                    if (pertsona)
                    {
                        mota = "tutorea";
                    }//if
                    else
                    {
                        mota = "";
                    }//else
                }//case 3
                break;
                case "gazteak":
                {
                    if (pertsona)
                    {
                        mota = "gaztea";
                    }//if
                    else
                    {
                        mota = "";
                    }//else
                }//case gazteak
                break;
                case "langileak":
                {
                    if (pertsona)
                    {
                        mota = "langilea";
                    }//if
                    else
                    {
                        mota = "";
                    }//else
                }//case langileak
                break;
                case "tutoreak":
                {
                    if (pertsona)
                    {
                        mota = "tutorea";
                    }//if
                    else
                    {
                        mota = "";
                    }//else
                }//case tutoreak
                break;
                case "asteburuekintza":
                case "asteburukoekintza":
                case "asteburukoa":
                case "asteburukoak":
                {
                    if (pertsona)
                    {
                        mota = "";
                    }//if
                    else
                    {
                        mota = "asteburukoak";
                    }//else
                }//case asteburukoak
                break;
                case "udaekintza":
                case "udakoekintza":
                case "udakoa":
                case "udakoak":
                {
                    if (pertsona)
                    {
                        mota = "";
                    }//if
                    else
                    {
                        mota = "udakoak";
                    }//else
                }//case asteburukoak, udakoak
                break;
                default:
                {
                    mota = "";
                }//default
                break;
            }//switch
            if (mota.isEmpty())
            {
                System.out.println("Aukera ez da zuzena.");
            }//if
            else
            {
                eragiketak(pertsona, mota);
            }//else
        }//while
    }//taldeMenua

    private void eragiketak(boolean pertsona, String mota)
    {
        while (true)
        {
            pantallaGarbitu();
            String titulua = "EKINTZAK / ";
            if (pertsona)
            {
                titulua = "PERTSONAK / ";
            }//if
            laukia(titulua + mota.toUpperCase(), "1 - Bistaratu (B)", "2 - Berria (+)", "3 - Kendu (-)", "4 - Zuzendu (Z)", "0 - Atzera");
            String aukera = irakurri();
            if (aukera.equals("0") || aukera.equals("atzera"))
            {
                return;
            }//if
            boolean aukeraZuzena = true;
            switch (aukera)
            {
                case "1":
                case "b":
                case "bistaratu":
                {
                    aukera = "bistaratu";
                }//case bistaratu
                break;
                case "2":
                case "+":
                case "berria":
                {
                    aukera = "berria";
                }//case berria
                break;
                case "3":
                case "-":
                case "kendu":
                {
                    aukera = "kendu";
                }//case kendu
                break;
                case "4":
                case "z":
                case "zuzendu":
                {
                    aukera = "zuzendu";
                }//case zuzendu
                break;
                default:
                {
                    aukeraZuzena = false;
                }//default
                break;
            }//switch
            if (!aukeraZuzena)
            {
                System.out.println("Aukera ez da zuzena.");
                continue;
            }//if
            if (pertsona)
            {
                pertsonaEragiketa(mota, aukera);
            }//if
            else
            {
                ekintzaEragiketa(mota, aukera);
            }//else
            EnterItxaron(sc);
        }//while
    }//eragiketak

    public ArrayList<Pertsona> PertsonakIragazi(String mota)
    {
        ArrayList<Pertsona> emaitza = new ArrayList<>();
        for (int i = 0; i < pertsonak.size(); i++)
        {
            Pertsona elementua = pertsonak.get(i);
            switch (mota)
            {
                case "denak":
                {
                    emaitza.add(elementua);
                }//case denak
                break;
                case "gaztea":
                {
                    if (elementua instanceof Gaztea)
                    {
                        emaitza.add(elementua);
                    }//if
                }//case gaztea
                break;
                case "langilea":
                {
                    if (elementua instanceof Langile)
                    {
                        emaitza.add(elementua);
                    }//if
                }//case langilea
                break;
                case "tutorea":
                {
                    if (elementua instanceof Tutorea)
                    {
                        emaitza.add(elementua);
                    }//if
                }//case tutorea
                break;
                default:
                {
                }//default
                break;
            }//switch
        }//for
        return emaitza;
    }//PertsonakIragazi

    public void PertsonakIkusi(ArrayList<Pertsona> zerrenda)
    {
        if (zerrenda.isEmpty())
        {
            System.out.println("Ez dago pertsonarik.");
        }//if
        for (int i = 0; i < zerrenda.size(); i++)
        {
            System.out.println("\n--- " + (i + 1) + "." + zerrenda.get(i).getClass().getSimpleName() + "---");
            zerrenda.get(i).getALL();
        }//for
    }//PertsonakIkusi

    private String motaBerria(boolean pertsona)
    {
        pantallaGarbitu();
        while (true)
        {
            if (pertsona)
            {
                laukia("PERTSONA MOTA", "1 - Gaztea", "2 - Langile", "3 - Tutorea", "0 - Atzera");
            }//if
            else
            {
                laukia("EKINTZA MOTA", "1 - Asteburu Ekintza", "2 - Udako Ekintza", "0 - Atzera");
            }//else
            switch (irakurri())
            {
                case "0":
                case "atzera":
                {
                    return "";
                }//case atzera
                case "1":
                {
                    if (pertsona)
                    {
                        return "gaztea";
                    }//if
                    else
                    {
                        return "asteburukoak";
                    }//else
                }//case 1
                case "2":
                {
                    if (pertsona)
                    {
                        return "langilea";
                    }//if
                    else
                    {
                        return "udakoak";
                    }//else
                }//case 2
                case "3":
                {
                    if (pertsona)
                    {
                        return "tutorea";
                    }//if
                }//case 3
                break;
                case "gaztea":
                case "gazteak":
                {
                    if (pertsona)
                    {
                        return "gaztea";
                    }//if
                }//case gaztea
                break;
                case "langile":
                case "langilea":
                case "langileak":
                {
                    if (pertsona)
                    {
                        return "langilea";
                    }//if
                }//case langile
                break;
                case "tutorea":
                case "tutoreak":
                {
                    if (pertsona)
                    {
                        return "tutorea";
                    }//if
                }//case tutorea
                break;
                case "asteburukoa":
                case "asteburukoak":
                case "asteburuekintza":
                case "asteburukoekintza":
                {
                    if (!pertsona)
                    {
                        return "asteburukoak";
                    }//if
                }//case asteburuekintza
                break;
                case "udakoa":
                case "udakoak":
                case "udakoekintza":
                case "udaekintza":
                {
                    if (!pertsona)
                    {
                        return "udakoak";
                    }//if
                }//case udakoekintza
                break;
                default:
                {
                }//default
            }//switch
            System.out.println("Aukera ez da zuzena.");
        }//while
    }//motaBerria

    private void pertsonaEragiketa(String mota, String aukera)
    {
        if (aukera.equals("berria"))
        {
            String berria = mota;
            if (mota.equals("denak"))
            {
                berria = motaBerria(true);
            }//if
            if (berria.isEmpty())
            {
                return;
            }//if
            Pertsona p;
            switch (berria)
            {
                case "gaztea":
                {
                    p = new Gaztea();
                }//case gaztea
                break;
                case "langilea":
                {
                    p = new Langile();
                }//case langilea
                break;
                default:
                {
                    p = new Tutorea();
                }//default
                break;
            }//switch
            PertsonaDatuak(p, true);
            datuBereziak(p, true);
            pertsonak.add(p);
            System.out.println("Pertsona behar bezala sortu da.");
            return;
        }//if
        ArrayList<Pertsona> zerrenda = PertsonakIragazi(mota);
        PertsonakIkusi(zerrenda);
        if (aukera.equals("bistaratu") || zerrenda.isEmpty())
        {
            return;
        }//if
        Pertsona p = zerrenda.get(Aukeratu(sc, zerrenda.size()));
        if (aukera.equals("kendu"))
        {
            pantallaGarbitu();
            laukia("KENDU", "1 - Erregistroa", "2 - Datu bat", "0 - Atzera");
            switch (irakurri())
            {
                case "1":
                {
                    pertsonak.remove(p);
                    System.out.println("Erregistroa ezabatu da.");
                }//case 1
                break;
                case "2":
                {
                    PertsonaDatuaEzabatu(p);
                }//case 2
                break;
                case "0":
                case "atzera":
                {
                }//case 0, atzera
                break;
                default:
                {
                    System.out.println("Aukera ez da zuzena.");
                }//default
                break;
            }//switch
        }//if
        else
        {
            PertsonaDatuak(p, false);
            datuBereziak(p, false);
            System.out.println("Pertsonaren datuak aldatu dira.");
        }//else
    }//pertsonaEragiketa

    private void datuBereziak(Pertsona p, boolean berria)
    {
        if (p instanceof Gaztea)
        {
            Gaztea g = (Gaztea) p;
            boolean BazkideIzan = BaiEz(sc, "Bazkidea da?", g.getBazkideIzanBalioa(), berria);
            g.setBazkideIzan(BazkideIzan);
            if (g.getBazkideIzanBalioa())
            {
                String BazkideID = PertsonaBerba(sc, "BazkideID", g.getBazkideIDBalioa());
                g.setBazkideID(BazkideID);
                double UrtekoKuota = SartuDezimala(sc, "UrtekoKuota", g.getUrtekoKuotaBalioa());
                g.setUrtekoKuota(UrtekoKuota);
            }//if
            else
            {
                g.setBazkideID("");
                g.setUrtekoKuota(0.0);
            }//else
            String TutoreID = HauIrakurri(sc, "TutoreID (Enter = Tutore barik): ");
            g.setTutoreID(TutoreID);
        }//if
        if (p instanceof Langile)
        {
            Langile l = (Langile) p;
            String LangileID;
            if (berria)
            {
                LangileID = DerrigorrezkoBerba(sc, "LangileID: ");
            }//if
            else
            {
                LangileID = PertsonaBerba(sc, "LangileID", l.getLangileIDBalioa());
            }//else
            l.setLangileID(LangileID);
            String Postua = langilePostua(l.getPostuaBalioa(), berria);
            l.setPostua(Postua);
            if (l.getPostuaBalioa().equals("Monitorea"))
            {
                boolean arduraduna = BaiEz(sc, "Arduraduna da?", l.getArduraduaIzanBalioa(), berria);
                l.setArduraduaIzan(arduraduna);
            }//if
            else
            {
                l.setArduraduaIzan(false);
            }//else
        }//if
        if (p instanceof Tutorea)
        {
            Tutorea t = (Tutorea) p;
            String TutoreID;
            if (berria)
            {
                TutoreID = DerrigorrezkoBerba(sc, "TutoreID: ");
            }//if
            else
            {
                TutoreID = PertsonaBerba(sc, "TutoreID", t.getTutoreIDBalioa());
            }//else
            t.setTutoreID(TutoreID);
        }//if
    }//datuBereziak

    public void PertsonaDatuaEzabatu(Pertsona p)
    {
        pantallaGarbitu();
        boolean besteBat;
        do
        {
            System.out.println("NAN, Izena, Abizenak, Herrialdea, Helbidea, Posta-Kodea, Telefonoa, Jaiotza data, Email");
            if (p instanceof Gaztea)
            {
                System.out.println("BazkideID, BazkideIzan, UrtekoKuota, TutoreID");
            }//if
            if (p instanceof Langile)
            {
                System.out.println("LangileID, Postua, ArduraduaIzan");
            }//if
            if (p instanceof Tutorea)
            {
                System.out.println("TutoreID");
            }//if
            String datua = HauIrakurri(sc, "Zein datu ezabatu nahi duzu? (Atzera): ").toLowerCase();
            boolean ezabatua = true;
            switch (datua)
            {
                case "nan":
                {
                    p.setNAN("");
                }//case nan
                break;
                case "izena":
                {
                    p.setIzena("");
                }//case izena
                break;
                case "abizena":
                case "abizenak":
                {
                    p.setAbizena("");
                }//case abizenak
                break;
                case "herrialdea":
                {
                    p.setHerrialdea("");
                }//case herrialdea
                break;
                case "helbidea":
                {
                    p.setHelbidea("");
                }//case helbidea
                break;
                case "posta-kodea":
                case "postakodea":
                {
                    p.setPostaKodea("");
                }//case postakodea
                break;
                case "telefonoa":
                {
                    p.setTelefonoa("");
                }//case telefonoa
                break;
                case "jaiotza data":
                case "jaiotzadata":
                {
                    p.setJaiotzaData(null);
                }//case jaiotzadata
                break;
                case "bazkideid":
                {
                    if (p instanceof Gaztea)
                    {
                        ((Gaztea) p).setBazkideID("");
                    }//if
                    else
                    {
                        ezabatua = false;
                    }//else
                }//case bazkideid
                break;
                case "bazkideizan":
                case "erroldatua":
                {
                    if (p instanceof Gaztea)
                    {
                        ((Gaztea) p).setBazkideIzan(false);
                    }//if
                    else
                    {
                        ezabatua = false;
                    }//else
                }//case erroldatua
                break;
                case "langileid":
                {
                    if (p instanceof Langile)
                    {
                        ((Langile) p).setLangileID("");
                    }//if
                    else
                    {
                        ezabatua = false;
                    }//else
                }//case langileid
                break;
                case "tutoreid":
                {
                    if (p instanceof Tutorea)
                    {
                        ((Tutorea) p).setTutoreID("");
                    }//if
                    else if (p instanceof Gaztea)
                    {
                        Gaztea g = (Gaztea) p;
                        g.setTutoreID("");
                    }//else if
                    else
                    {
                        ezabatua = false;
                    }//else
                }//case tutoreid
                break;
                case "email":
                {
                    p.setEmail("");
                }//case email
                break;
                case "urtekokuota":
                {
                    if (p instanceof Gaztea)
                    {
                        Gaztea g = (Gaztea) p;
                        g.setUrtekoKuota(0.0);
                    }//if
                    else
                    {
                        ezabatua = false;
                    }//else
                }//case urtekokuota
                break;
                case "postua":
                {
                    if (p instanceof Langile)
                    {
                        Langile l = (Langile) p;
                        l.setPostua("");
                    }//if
                    else
                    {
                        ezabatua = false;
                    }//else
                }//case postua
                break;
                case "arduraduaizan":
                {
                    if (p instanceof Langile)
                    {
                        Langile l = (Langile) p;
                        l.setArduraduaIzan(false);
                    }//if
                    else
                    {
                        ezabatua = false;
                    }//else
                }//case arduraduaizan
                break;
                case "atzera":
                {
                    return;
                }//case atzera
                default:
                {
                    ezabatua = false;
                }//default
            }//switch
            if (ezabatua)
            {
                System.out.println("Datua ezabatu da.");
                besteBat = BaiEz(sc, "Beste datu bat ezabatu nahi duzu?");
            }//if
            else
            {
                System.out.println("Datu hori ez dago pertsona honetan.");
                besteBat = true;
            }//else
        }//do
        while (besteBat);
    }//PertsonaDatuaEzabatu

    public ArrayList<Ekintza> EkintzakIragazi(String mota)
    {
        ArrayList<Ekintza> emaitza = new ArrayList<>();
        for (int i = 0; i < ekintzak.size(); i++)
        {
            Ekintza elementua = ekintzak.get(i);
            switch (mota)
            {
                case "denak":
                {
                    emaitza.add(elementua);
                }//case denak
                break;
                case "udakoak":
                {
                    if (elementua instanceof Udakoa)
                    {
                        emaitza.add(elementua);
                    }//if
                }//case udakoak
                break;
                case "asteburukoak":
                {
                    if (elementua instanceof Asteburukoa)
                    {
                        emaitza.add(elementua);
                    }//if
                }//case asteburukoak
                break;
                default:
                {
                }//default
                break;
            }//switch
        }//for
        return emaitza;
    }//EkintzakIragazi

    private void ekintzaEragiketa(String mota, String aukera)
    {
        if (aukera.equals("berria"))
        {
            String taldea = mota;
            if (mota.equals("denak"))
            {
                taldea = motaBerria(false);
            }//if
            if (taldea.isEmpty())
            {
                return;
            }//if
            Ekintza e;
            if (taldea.equals("asteburukoak"))
            {
                String berria = asteburukoMota("", true);
                if (berria == null)
                {
                    return;
                }//if
                e = asteburukoaSortu(berria, new Ekintza());
            }//if
            else
            {
                Udakoa u = new Udakoa();
                if (!udakoMotak(u, true))
                {
                    return;
                }//if
                e = u;
            }//else
            ekintzaDatuak(e, true);
            ekintzak.add(e);
            System.out.println("Ekintza behar bezala sortu da.");
            return;
        }//if
        ArrayList<Ekintza> zerrenda = EkintzakIragazi(mota);
        if (zerrenda.isEmpty())
        {
            System.out.println("Ez dago ekintzarik.");
            return;
        }//if
        for (int i = 0; i < zerrenda.size(); i++)
        {
            System.out.println("\n--- " + (i + 1) + ". EKINTZA ---");
            zerrenda.get(i).getALL();
        }//for
        if (aukera.equals("bistaratu"))
        {
            return;
        }//if
        Ekintza aurrekoa = zerrenda.get(Aukeratu(sc, zerrenda.size()));
        if (aukera.equals("kendu"))
        {
            ekintzak.remove(aurrekoa);
            System.out.println("Ekintza ezabatu da.");
        }//if
        else
        {
            Ekintza e = aurrekoa;
            if (e instanceof Asteburukoa)
            {
                Asteburukoa a = (Asteburukoa) e;
                String berria = asteburukoMota(a.getMotaBalioa(), false);
                if (berria == null)
                {
                    return;
                }//if
                if (!berria.equals(a.getMotaBalioa()))
                {
                    e = asteburukoaSortu(berria, aurrekoa);
                }//if
            }//if
            if (e instanceof Udakoa)
            {
                Udakoa u = (Udakoa) e;
                boolean jarraitu = udakoMotak(u, false);
                if (!jarraitu)
                {
                    return;
                }//if
            }//if
            ekintzaDatuak(e, false);
            ekintzak.set(ekintzak.indexOf(aurrekoa), e);
            System.out.println("Ekintzaren datuak aldatu dira.");
        }//else
    }//ekintzaEragiketa

    private void ekintzaDatuak(Ekintza e, boolean berria)
    {
        String ID;
        if (berria)
        {
            ID = DerrigorrezkoBerba(sc, "Kodea: ");
        }//if
        else
        {
            ID = PertsonaBerba(sc, "Kodea", e.getIDBalioa());
        }//else
        e.setID(ID);
        String Izena;
        if (berria)
        {
            Izena = DerrigorrezkoBerba(sc, "Izena: ");
        }//if
        else
        {
            Izena = PertsonaBerba(sc, "Izena", e.getIzenaBalioa());
        }//else
        e.setIzena(Izena);
        LocalDate hd = SartuData(sc, "HasieraData", e.getHasieraDataBalioa());
        LocalDate bd;
        do
        {
            LocalDate aurrekoBukaera = e.getBukaeraDataBalioa();
            if (berria)
            {
                aurrekoBukaera = hd;
            }//if
            bd = SartuData(sc, "BukaeraData", aurrekoBukaera);
            if (bd.isBefore(hd))
            {
                System.out.println("Bukaera ezin da hasiera baino lehenago izan.");
            }//if
        }//do
        while (bd.isBefore(hd));
        String HasieraData = hd.format(formato);
        e.setHasieraData(HasieraData);
        String BukaeraData = bd.format(formato);
        e.setBukaeraData(BukaeraData);
        LocalTime hasieraOrdua = SartuOrdua(sc, "HasieraOrdua", e.getHasieraOrduaBalioa());
        LocalTime bukaeraOrdua;
        do
        {
            bukaeraOrdua = SartuOrdua(sc, "BukaeraOrdua", e.getBukaeraOrduaBalioa());
            if (hd.equals(bd) && bukaeraOrdua.isBefore(hasieraOrdua))
            {
                System.out.println("Egun berean, bukaera ordua ezin da hasiera baino lehenago izan.");
            }//if
        }//do
        while (hd.equals(bd) && bukaeraOrdua.isBefore(hasieraOrdua));
        e.setHasieraOrdua(hasieraOrdua);
        e.setBukaeraOrdua(bukaeraOrdua);
        double Prezioa = SartuDezimala(sc, "Prezioa", e.getPrezioaBalioa());
        e.setPrezioa(Prezioa);
        String Deskribapena = PertsonaBerba(sc, "Deskribapena", e.getDeskribapenaBalioa());
        e.setDeskribapena(Deskribapena);
        String Kokapena = PertsonaBerba(sc, "Kokapena", e.getKokapenaBalioa());
        e.setKokapena(Kokapena);
        while (true)
        {
            String s = HauIrakurri(sc, "PlazaKop [" + e.getPlazaKopBalioa() + "]: ");
            if (s.isEmpty())
            {
                break;
            }//if
            try
            {
                int plazaKop = Integer.parseInt(s);
                if (plazaKop < 0)
                {
                    System.out.println("Plaza kopurua ezin da negatiboa izan.");
                }//if
                else
                {
                    e.setPlazaKop(plazaKop);
                    break;
                }//else
            }//try
            catch (IllegalArgumentException ex)
            {
                System.out.println("Sartu zero edo zenbaki oso positiboa.");
            }//catch
        }//while
        if (e instanceof Hitzaldia)
        {
            Hitzaldia h = (Hitzaldia) e;
            String Hizlaria = PertsonaBerba(sc, "Hizlaria", h.getHizlariaBalioa());
            h.setHizlaria(Hizlaria);
        }//if
        if (e instanceof Kontzertua)
        {
            Kontzertua k = (Kontzertua) e;
            String Taldea = PertsonaBerba(sc, "Taldea", k.getTaldeaBalioa());
            k.setTaldea(Taldea);
        }//if
    }//ekintzaDatuak

    public static void main(String [] args)
    {
        MenuNagusia menu = new MenuNagusia();
        try
        {
            menu.menuNagusia(menu.sc);
        }//try
        catch (java.util.NoSuchElementException amaiera)
        {
            System.out.println("\nSarrera amaitu da.");
        }//catch
    }//main

    private String asteburukoMota(String aurrekoa, boolean berria)
    {
        pantallaGarbitu();
        while (true)
        {
            laukia("ASTEBURU EKINTZA", "1 - Hitzaldia", "2 - Kontzertua", "3 - Jolasa", "4 - Irteera", "0 - Atzera");
            if (!berria)
            {
                System.out.println("Enter: " + aurrekoa + " mantendu");
            }//if
            switch (irakurri())
            {
                case "1":
                case "hitzaldia":
                {
                    return "Hitzaldia";
                }//case hitzaldia
                case "2":
                case "kontzertua":
                {
                    return "Kontzertua";
                }//case kontzertua
                case "3":
                case "jolasa":
                {
                    return "Jolasa";
                }//case jolasa
                case "4":
                case "irteera":
                {
                    return "Irteera";
                }//case irteera
                case "0":
                case "atzera":
                {
                    return null;
                }//case atzera
                case "":
                {
                    if (!berria)
                    {
                        return aurrekoa;
                    }//if
                }//case hutsik
                break;
                default:
                {
                }//default
            }//switch
            System.out.println("Aukera ez da zuzena.");
        }//while
    }//asteburukoMota

    private Ekintza asteburukoaSortu(String mota, Ekintza aurrekoa)
    {
        switch (mota)
        {
            case "Hitzaldia":
            {
                return new Hitzaldia(aurrekoa);
            }//case hitzaldia
            case "Kontzertua":
            {
                return new Kontzertua(aurrekoa);
            }//case kontzertua
            case "Jolasa":
            case "Irteera":
            {
                return new Asteburukoa(aurrekoa, mota);
            }//case jolasa, irteera
            default:
            {
                return new Asteburukoa(aurrekoa, mota);
            }//default
        }//switch
    }//asteburukoaSortu

    private boolean udakoMotak(Udakoa u, boolean berria)
    {
        String mota = udakoMota(u.getMotaBalioa(), berria);
        if (mota == null)
        {
            return false;
        }//if
        String ekintzaMota = "";
        if (mota.equals("Egunekoa"))
        {
            boolean egunekoBerria = berria || !u.getMotaBalioa().equals("Egunekoa");
            ekintzaMota = egunekoMota(u.getEkintzaMotaBalioa(), egunekoBerria);
            if (ekintzaMota == null)
            {
                return false;
            }//if
        }//if
        u.setMota(mota);
        u.setEkintzaMota(ekintzaMota);
        return true;
    }//udakoMotak

    private String udakoMota(String aurrekoa, boolean berria)
    {
        pantallaGarbitu();
        while (true)
        {
            laukia("UDAKO EKINTZA", "1 - Egunekoa", "2 - Gauekoa", "0 - Atzera");
            if (!berria)
            {
                System.out.println("Enter: " + aurrekoa + " mantendu");
            }//if
            switch (irakurri())
            {
                case "1":
                case "egunekoa":
                case "eguneko":
                {
                    return "Egunekoa";
                }//case egunekoa
                case "2":
                case "gauekoa":
                case "gaueko":
                {
                    return "Gauekoa";
                }//case gauekoa
                case "0":
                case "atzera":
                {
                    return null;
                }//case atzera
                case "":
                {
                    if (!berria)
                    {
                        return aurrekoa;
                    }//if
                }//case hutsik
                break;
                default:
                {
                }//default
            }//switch
            System.out.println("Aukera ez da zuzena.");
        }//while
    }//udakoMota

    private String egunekoMota(String aurrekoa, boolean berria)
    {
        pantallaGarbitu();
        while (true)
        {
            laukia("EGUNEKO EKINTZA", "1 - Surf Hastapena", "2 - Paddle Surf", "3 - Mendi Irteera", "0 - Atzera");
            if (!berria)
            {
                System.out.println("Enter: " + aurrekoa + " mantendu");
            }//if
            switch (irakurri())
            {
                case "1":
                case "surfhastapena":
                {
                    return "Surf Hastapena";
                }//case surfhastapena
                case "2":
                case "paddlesurf":
                case "surfpaddle":
                {
                    return "Paddle Surf";
                }//case paddlesurf
                case "3":
                case "mendiirteera":
                {
                    return "Mendi Irteera";
                }//case mendiirteera
                case "0":
                case "atzera":
                {
                    return null;
                }//case atzera
                case "":
                {
                    if (!berria)
                    {
                        return aurrekoa;
                    }//if
                }//case hutsik
                break;
                default:
                {
                }//default
            }//switch
            System.out.println("Aukera ez da zuzena.");
        }//while
    }//egunekoMota

    private String langilePostua(String aurrekoa, boolean berria)
    {
        pantallaGarbitu();
        while (true)
        {
            laukia("LANGILE MOTA", "1 - Monitorea", "2 - Administrazioa");
            if (!berria)
            {
                System.out.println("Enter: " + aurrekoa + " mantendu");
            }//if
            switch (irakurri())
            {
                case "1":
                case "monitorea":
                {
                    return "Monitorea";
                }//case monitorea
                case "2":
                case "administrazioa":
                {
                    return "Administrazioa";
                }//case administrazioa
                case "":
                {
                    if (!berria)
                    {
                        return aurrekoa;
                    }//if
                }//case hutsik
                break;
                default:
                {
                }//default
            }//switch
            System.out.println("Aukera ez da zuzena.");
        }//while
    }//langilePostua
}//MenuNagusia
