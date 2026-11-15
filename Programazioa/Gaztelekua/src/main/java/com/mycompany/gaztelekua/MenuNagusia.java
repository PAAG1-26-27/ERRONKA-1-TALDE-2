package com.mycompany.gaztelekua;
import java.util.Scanner;
import java.time.LocalTime;
import static com.mycompany.gaztelekua.MetodoPraktikoak.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
/**
* @authors
*      Jon Ander Estevez Del Palacio
*      Nora Ortiz de Lejarazu Rascon
*      Huzaima Muhammad Bibi
*      Aitor Burunza Gil
*/
// Pertsonen eta ekintzen kudeaketa.
//Menuak erakutsi eta erregistroak mota bakoitzaren zerrendan kudeatu.
public class MenuNagusia
{

    Scanner sc = MetodoPraktikoak.teklatua;

    // Mota bakoitzak bere zerrenda du: ez dago pertsonak edo ekintzak zerrenda orokorrik.
    ArrayList<Gaztea> Gazteak = new ArrayList<>();
    ArrayList<Langile> Langileak = new ArrayList<>();
    ArrayList<Tutorea> Tutoreak = new ArrayList<>();
    ArrayList<Udakoa> UdakoEkintzak = new ArrayList<>();
    ArrayList<Hitzaldia> Hitzaldiak = new ArrayList<>();
    ArrayList<Kontzertua> Kontzertuak = new ArrayList<>();
    // Jolasek eta irteerek ez dute datu berezirik: Ekintza objektuak erabiltzen dituzte.
    ArrayList<Ekintza> Jolasak = new ArrayList<>();
    ArrayList<Ekintza> Irteerak = new ArrayList<>();

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("uuuu/MM/dd").withResolverStyle(ResolverStyle.STRICT);

    //Pertsona mota guztiek datu komun berak dituzte
    //Pertsonaren datu komunak irakurri; hutsik utziz gero aurrekoa mantendu.
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
    //Titulua eta aukerak lauki baten barruan erakutsi.
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

    //Aukera irakurri eta letra xeheetara pasatu, tarteak kenduta.
    private String irakurri()
    {
        return sarreraKonpondu(HauIrakurri(sc, "Aukera: "));
    }//irakurri

    //Menu nagusia errepikatu erabiltzaileak irten aukeratu arte.
    public void menuNagusia(Scanner sc)
    {
        this.sc = sc;
        MetodoPraktikoak.teklatua = sc;
        String aukera;

        do
        {
            pantallaGarbitu();
            laukia("MENU NAGUSIA", "1 - EKINTZAK", "2 - PERTSONAK", "0 - IRTEN");
            aukera = irakurri();
            switch (aukera)
            {
                case "1", "ekintzak":
                {
                    menuEkintzak();
                }//case 1, ekintzak
                break;

                case "2", "pertsonak":
                {
                    menuPertsonak();
                }//case 2, pertsonak
                break;

                case "0", "*", "irten":
                {
                    System.out.println("Programa itxi da.");
                    break;
                }//case *, irten

                default:
                {
                    System.out.println("Aukera ez da zuzena.");
                }//default
                break;
            }//switch
        }//do
        while (!aukera.equals("0") && !aukera.equals("*") && !aukera.equals("irten"));
    }//menuNagusia

    //Kudeatu nahi den pertsona taldea aukeratzeko menua.
    public void menuPertsonak()
    {
        String aukera;

        do
        {
            pantallaGarbitu();
            laukia("PERTSONAK", "Enter: Denak", "1 - Gazteak", "2 - Langileak", "3 - Tutoreak", "0 - Atzera");
            aukera = irakurri();
            switch (aukera)
            {
                case "", "denak":
                {
                    eragiketak(true, "denak");
                }//case denak
                break;

                case "1", "gazteak":
                {
                    eragiketak(true, "gaztea");
                }//case gazteak
                break;

                case "2", "langileak":
                {
                    eragiketak(true, "langilea");
                }//case langileak
                break;

                case "3", "tutoreak":
                {
                    eragiketak(true, "tutorea");
                }//case tutoreak
                break;

                case "0", "atzera":
                {
                    break;
                }//case atzera

                default:
                {
                    System.out.println("Aukera ez da zuzena.");
                }//default
            }//switch
        }//do
        while (!aukera.equals("0") && !aukera.equals("atzera"));
    }//menuPertsonak

    //Kudeatu nahi den ekintza taldea aukeratzeko menua.
    public void menuEkintzak()
    {
        String aukera;

        do
        {
            //Menuak erakutsi aurretik, pantalla garbitzen da
            pantallaGarbitu();

            laukia("EKINTZAK", "Enter: Denak", "1 - Asteburukoak", "2 - Udakoak", "0 - Atzera");

            aukera = irakurri();

            switch (aukera)
            {
                case "", "denak", "dena":
                {
                    eragiketak(false, "denak");
                }//case denak
                break;

                case "1", "asteburukoa", "asteburukoak", "asteburuekintza", "asteburukoekintza":
                {
                    menuAsteburukoak();
                }//case asteburukoekintza
                break;

                case "2", "udakoa", "udakoak", "udaekintza", "udakoekintza":
                {
                    eragiketak(false, "udakoak");
                }//case udakoekintza
                break;

                case "0", "atzera":
                {
                    break;
                }//case atzera

                default:
                {
                    System.out.println("Aukera ez da zuzena.");
                }//default
            }//switch
        }//do
        while (!aukera.equals("0") && !aukera.equals("atzera"));
    }//menuEkintzak

    // Asteburukoak menu-talde bat da; ez du klaserik edo zerrenda propiorik behar.
    //Asteburuko ekintzen taldea aukeratzeko menua.
    public void menuAsteburukoak()
    {
        String aukera;

        do
        {
            //Menuak erakutsi aurretik, pantalla garbitzen da
            pantallaGarbitu();

            laukia("ASTEBURUKOAK", "Enter: Denak", "1 - Hitzaldiak", "2 - Kontzertuak", "3 - Jolasak", "4 - Irteerak", "0 - Atzera");
            aukera = irakurri();
            switch (aukera)
            {
                case "", "denak":
                {
                    eragiketak(false, "asteburukoak");
                }//case denak
                break;

                case "1", "hitzaldia", "hitzaldiak":
                {
                    eragiketak(false, "hitzaldiak");
                }//case hitzaldiak
                break;

                case "2", "kontzertua", "kontzertuak":
                {
                    eragiketak(false, "kontzertuak");
                }//case kontzertuak
                break;

                case "3", "jolasa", "jolasak":
                {
                    eragiketak(false, "jolasak");
                }//case jolasak
                break;

                case "4", "irteera", "irteerak":
                {
                    eragiketak(false, "irteerak");
                }//case irteerak
                break;

                case "0", "atzera":
                {
                    break;
                }//case atzera

                default:
                {
                    System.out.println("Aukera ez da zuzena.");
                }//default
            }//switch
        }//do
        while (!aukera.equals("0") && !aukera.equals("atzera"));
    }//menuAsteburukoak

    //Aukera desberdinak bateratu eta dagokion eragiketa egin.
    private void eragiketak(boolean pertsona, String mota)
    {
        String aukera;

        do
        {
            pantallaGarbitu();
            String titulua = "EKINTZAK / ";
            if (pertsona)
            {
                titulua = "PERTSONAK / ";
            }//if
            laukia(titulua + mota.toUpperCase(), "1 - Bistaratu (B)", "2 - Berria (+)", "3 - Kendu (-)", "4 - Zuzendu (Z)", "0 - Atzera");
            aukera = irakurri();
            if (!aukera.equals("0") && !aukera.equals("atzera"))
            {
                boolean aukeraZuzena = true;

                //Switch honen bidez, aukera denak "garbira" pasatzen ditugu.
                switch (aukera)
                {
                    //Bistaratu aukera
                    case "b", "1", "bistaratu":
                    {
                        aukera = "bistaratu";
                    }//case bistaratu
                    break;

                    //Berria aukera
                    case "2", "+", "berria":
                    {
                        aukera = "berria";
                    }//case berria
                    break;

                    //Kendu aukera
                    case "-", "3", "kendu":
                    {
                        aukera = "kendu";
                    }//case kendu
                    break;

                    //zuzendu aukera
                    case "z", "4", "zuzendu":
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

                if (aukeraZuzena)
                {
                    if (pertsona)
                    {
                        pertsonaEragiketa(mota, aukera);
                    }//if

                    else
                    {
                        ekintzaEragiketa(mota, aukera);
                    }//else
                    EnterItxaron(sc);
                }//if
                else
                {
                    System.out.println("Aukera ez da zuzena.");
                }//else
            }//if
        }//do
        while (!aukera.equals("0") && !aukera.equals("atzera"));
    }//eragiketak

    //Pertsona motaren arabera bere zerrendako eragiketara joan.
    private void pertsonaEragiketa(String mota, String aukera)
    {
        if (mota.equals("denak"))
        {
            if (aukera.equals("bistaratu"))
            {
                gazteakEragiketa(aukera);
                langileakEragiketa(aukera);
                tutoreakEragiketa(aukera);
                return;
            }//if
            mota = motaBerria(true);
        }//if
        switch (mota)
        {
            case "gaztea":
            {
                gazteakEragiketa(aukera);
            }//case gaztea
            break;

            case "langilea":
            {
                langileakEragiketa(aukera);
            }//case langilea
            break;

            case "tutorea":
            {
                tutoreakEragiketa(aukera);
            }//case tutorea
            break;
        }//switch
    }//pertsonaEragiketa

    //Ekintza motaren arabera bere zerrendako eragiketara joan.
    private void ekintzaEragiketa(String mota, String aukera)
    {
        if (mota.equals("denak") || mota.equals("asteburukoak"))
        {
            if (aukera.equals("bistaratu"))
            {
                hitzaldiakEragiketa(aukera);
                kontzertuakEragiketa(aukera);
                jolasakEragiketa(aukera);
                irteerakEragiketa(aukera);
                if (mota.equals("denak"))
                {
                    udakoakEragiketa(aukera);
                }//if
                return;
            }//if
            if (mota.equals("denak"))
            {
                mota = motaBerria(false);
            }//if
            else
            {
                mota = asteburukoMota();
            }//else
        }//if
        switch (mota)
        {
            case "udakoak":
            {
                udakoakEragiketa(aukera);
            }//case udakoak
            break;

            case "hitzaldiak":
            {
                hitzaldiakEragiketa(aukera);
            }//case hitzaldiak
            break;

            case "kontzertuak":
            {
                kontzertuakEragiketa(aukera);
            }//case kontzertuak
            break;

            case "jolasak":
            {
                jolasakEragiketa(aukera);
            }//case jolasak
            break;

            case "irteerak":
            {
                irteerakEragiketa(aukera);
            }//case irteerak
            break;
        }//switch
    }//ekintzaEragiketa

    // Bistaratu-k ez du erregistrorik aukeratu behar; zerrenda huts batek ere ez.
    //Aldatu edo kendu nahi den erregistroaren posizioa aukeratu.
    private int erregistroaAukeratu(String aukera, int kopurua)
    {
        if (kopurua == 0)
        {
            System.out.println("Ez dago erregistrorik.");
            return -1;
        }//if
        if (aukera.equals("bistaratu"))
        {
            return -1;
        }//if
        return Aukeratu(sc, kopurua);
    }//erregistroaAukeratu

    // True: deitzaileak erregistroa bere zerrendatik kendu behar du.
    //Erregistro osoa edo datu bakarra kendu nahi den galdetu.
    private boolean pertsonaKendu(Pertsona pertsona1)
    {
        laukia("KENDU", "1 - Erregistroa", "2 - Datu bat", "0 - Atzera");
        switch (irakurri())
        {
            case "1":
            {
                System.out.println("Erregistroa ezabatu da.");
                return true;
            }//case 1

            case "2":
            {
                PertsonaDatuaEzabatu(pertsona1);
            }//case 2
            break;

            case "0", "atzera":
            {
            }//case atzera
            break;

            default:
            {
                System.out.println("Aukera ez da zuzena.");
            }//default
        }//switch
        return false;
    }//pertsonaKendu

    //Talde honetako erregistroak sortu, erakutsi, aldatu edo kendu.
    private void gazteakEragiketa(String aukera)
    {
        if (aukera.equals("berria"))
        {
            //Lehenengo datuak irakurri, gero objektua sortu.
            String NAN = DerrigorrezkoBerba(sc, "NAN: ");
            String Izena = DerrigorrezkoBerba(sc, "Izena: ");
            String Abizena = DerrigorrezkoBerba(sc, "Abizenak: ");
            String Herrialdea = PertsonaBerba(sc, "Herrialdea", "Euskal Herria");
            String Helbidea = PertsonaBerba(sc, "Helbidea", "Eibar, Herriko plaza 1, 1ºA");
            String PostaKodea = PertsonaBerba(sc, "Posta-Kodea", "20600");
            String Telefonoa = PertsonaBerba(sc, "Telefonoa", "600000000");
            LocalDate hasierakoJaiotza = LocalDate.of(LocalDate.now().getYear() - 12, 1, 1);
            LocalDate JaiotzaData = SartuData(sc, "Jaiotza data", hasierakoJaiotza);
            String Email = PertsonaBerba(sc, "Email", "ErabiltzaileGabe@ikasleak.uni.eus");
            boolean BazkideIzan = BaiEz(sc, "Bazkidea da?");
            String BazkideID = "";
            if (BazkideIzan)
            {
                BazkideID = PertsonaBerba(sc, "BazkideID", "");
            }//if
            Gaztea p = new Gaztea(NAN, Izena, Abizena, Herrialdea, Helbidea, PostaKodea, Telefonoa, JaiotzaData,
                    Email, BazkideIzan, BazkideID);
            //Sortutako objektua bere taldearen zerrendan gorde.
            Gazteak.add(p);
            System.out.println("Pertsona behar bezala sortu da.");
            return;
        }//if
        System.out.println("\n--- GAZTEAK ---");
        for (int i = 0; i < Gazteak.size(); i++)
        {
            System.out.println("\n--- " + (i + 1) + ". ERREGISTROA ---");
            Gazteak.get(i).getALL();
        }//for
        int posizioa = erregistroaAukeratu(aukera, Gazteak.size());
        if (posizioa == -1) return;
        Gaztea p = Gazteak.get(posizioa);
        if (aukera.equals("kendu"))
        {
            if (pertsonaKendu(p)) Gazteak.remove(posizioa);
        }//if
        else
        {
            PertsonaDatuak(p, false);
            datuBereziak(p, false);
            System.out.println("Pertsonaren datuak aldatu dira.");
        }//else
    }//gazteakEragiketa
    //Talde honetako erregistroak sortu, erakutsi, aldatu edo kendu.
    private void langileakEragiketa(String aukera)
    {
        if (aukera.equals("berria"))
        {
            //Lehenengo datuak irakurri, gero objektua sortu.
            String NAN = DerrigorrezkoBerba(sc, "NAN: ");
            String Izena = DerrigorrezkoBerba(sc, "Izena: ");
            String Abizena = DerrigorrezkoBerba(sc, "Abizenak: ");
            String Herrialdea = PertsonaBerba(sc, "Herrialdea", "Euskal Herria");
            String Helbidea = PertsonaBerba(sc, "Helbidea", "Eibar, Herriko plaza 1, 1ºA");
            String PostaKodea = PertsonaBerba(sc, "Posta-Kodea", "20600");
            String Telefonoa = PertsonaBerba(sc, "Telefonoa", "600000000");
            LocalDate hasierakoJaiotza = LocalDate.of(LocalDate.now().getYear() - 12, 1, 1);
            LocalDate JaiotzaData = SartuData(sc, "Jaiotza data", hasierakoJaiotza);
            String Email = PertsonaBerba(sc, "Email", "ErabiltzaileGabe@ikasleak.uni.eus");
            String LangileID = DerrigorrezkoBerba(sc, "LangileID: ");
            String Postua = langilePostua("", true);

            //
            boolean ArduraduaIzan = false;

            if (Postua.equals("Monitorea"))
            {
                ArduraduaIzan = BaiEz(sc, "Arduraduna da?");
            }//if

            Langile p = new Langile(NAN, Izena, Abizena, Herrialdea, Helbidea, PostaKodea, Telefonoa, JaiotzaData,
                    Email, LangileID, Postua, ArduraduaIzan);
            //Sortutako objektua bere taldearen zerrendan gorde.
            Langileak.add(p);
            System.out.println("Pertsona behar bezala sortu da.");
            return;
        }//if
        System.out.println("\n--- LANGILEAK ---");
        for (int i = 0; i < Langileak.size(); i++)
        {
            System.out.println("\n--- " + (i + 1) + ". ERREGISTROA ---");
            Langileak.get(i).getALL();
        }//for
        int posizioa = erregistroaAukeratu(aukera, Langileak.size());
        if (posizioa == -1) return;
        Langile p = Langileak.get(posizioa);
        if (aukera.equals("kendu"))
        {
            if (pertsonaKendu(p)) Langileak.remove(posizioa);
        }//if
        else
        {
            PertsonaDatuak(p, false);
            datuBereziak(p, false);
            System.out.println("Pertsonaren datuak aldatu dira.");
        }//else
    }//langileakEragiketa
    //Talde honetako erregistroak sortu, erakutsi, aldatu edo kendu.
    private void tutoreakEragiketa(String aukera)
    {
        if (aukera.equals("berria"))
        {
            //Lehenengo datuak irakurri, gero objektua sortu.
            String NAN = DerrigorrezkoBerba(sc, "NAN: ");
            String Izena = DerrigorrezkoBerba(sc, "Izena: ");
            String Abizena = DerrigorrezkoBerba(sc, "Abizenak: ");
            String Herrialdea = PertsonaBerba(sc, "Herrialdea", "Euskal Herria");
            String Helbidea = PertsonaBerba(sc, "Helbidea", "Eibar, Herriko plaza 1, 1ºA");
            String PostaKodea = PertsonaBerba(sc, "Posta-Kodea", "20600");
            String Telefonoa = PertsonaBerba(sc, "Telefonoa", "600000000");
            LocalDate hasierakoJaiotza = LocalDate.of(LocalDate.now().getYear() - 12, 1, 1);
            LocalDate JaiotzaData = SartuData(sc, "Jaiotza data", hasierakoJaiotza);
            String Email = PertsonaBerba(sc, "Email", "ErabiltzaileGabe@ikasleak.uni.eus");
            String TutoreID = DerrigorrezkoBerba(sc, "TutoreID: ");
            Tutorea p = new Tutorea(NAN, Izena, Abizena, Herrialdea, Helbidea, PostaKodea, Telefonoa, JaiotzaData,
                    Email, TutoreID);
            //Sortutako objektua bere taldearen zerrendan gorde.
            Tutoreak.add(p);
            System.out.println("Pertsona behar bezala sortu da.");
            return;
        }//if
        System.out.println("\n--- TUTOREAK ---");
        for (int i = 0; i < Tutoreak.size(); i++)
        {
            System.out.println("\n--- " + (i + 1) + ". ERREGISTROA ---");
            Tutoreak.get(i).getALL();
        }//for
        int posizioa = erregistroaAukeratu(aukera, Tutoreak.size());
        if (posizioa == -1) return;
        Tutorea p = Tutoreak.get(posizioa);
        if (aukera.equals("kendu"))
        {
            if (pertsonaKendu(p)) Tutoreak.remove(posizioa);
        }//if
        else
        {
            PertsonaDatuak(p, false);
            datuBereziak(p, false);
            System.out.println("Pertsonaren datuak aldatu dira.");
        }//else
    }//tutoreakEragiketa
    //Talde honetako erregistroak sortu, erakutsi, aldatu edo kendu.
    private void udakoakEragiketa(String aukera)
    {
        if (aukera.equals("berria"))
        {
            String Mota = udakoMota("Egunekoa", true);
            if (Mota == null)
            {
                return;
            }//if
            String EkintzaMota = "";
            if (Mota.equals("Egunekoa"))
            {
                EkintzaMota = egunekoMota("Surf Hastapena", true);
                if (EkintzaMota == null)
                {
                    return;
                }//if
            }//if
            //Lehenengo datuak irakurri, gero objektua sortu.
            String ID = DerrigorrezkoBerba(sc, "Kodea: ");
            String Izena = DerrigorrezkoBerba(sc, "Izena: ");
            LocalDate HasieraData = SartuData(sc, "HasieraData", LocalDate.now());
            LocalDate BukaeraData;
            do
            {
                BukaeraData = SartuData(sc, "BukaeraData", HasieraData);
                if (BukaeraData.isBefore(HasieraData))
                {
                    System.out.println("Bukaera ezin da hasiera baino lehenago izan.");
                }//if
            }//do
            while (BukaeraData.isBefore(HasieraData));
            LocalTime HasieraOrdua = SartuOrdua(sc, "HasieraOrdua", LocalTime.of(9, 0));
            LocalTime BukaeraOrdua;
            do
            {
                BukaeraOrdua = SartuOrdua(sc, "BukaeraOrdua", LocalTime.of(10, 0));
                if (HasieraData.equals(BukaeraData) && BukaeraOrdua.isBefore(HasieraOrdua))
                {
                    System.out.println("Egun berean, bukaera ordua ezin da hasiera baino lehenago izan.");
                }//if
            }//do
            while (HasieraData.equals(BukaeraData) && BukaeraOrdua.isBefore(HasieraOrdua));
            double Prezioa = SartuDezimala(sc, "Prezioa", 0);
            String Deskribapena = PertsonaBerba(sc, "Deskribapena", "");
            String Kokapena = PertsonaBerba(sc, "Kokapena", "Ermua");
            int PlazaKop = 6;
            boolean plazaZuzena = false;
            do
            {
                String sarrera = HauIrakurri(sc, "PlazaKop [6]: ");
                if (sarrera.isEmpty())
                {
                    plazaZuzena = true;
                }//if
                else
                {
                    try
                    {
                        int zenbakia = Integer.parseInt(sarrera);
                        if (zenbakia < 0)
                        {
                            System.out.println("Plaza kopurua ezin da negatiboa izan.");
                        }//if
                        else
                        {
                            PlazaKop = zenbakia;
                            plazaZuzena = true;
                        }//else
                    }//try
                    catch (NumberFormatException error)
                    {
                        System.out.println("Sartu zero edo zenbaki oso positiboa.");
                    }//catch
                }//else
            }//do
            while (!plazaZuzena);
            Udakoa e = new Udakoa(ID, Izena, HasieraData, BukaeraData, HasieraOrdua, BukaeraOrdua, Prezioa,
                    Deskribapena, Kokapena, PlazaKop, Mota, EkintzaMota);
            //Sortutako objektua bere taldearen zerrendan gorde.
            UdakoEkintzak.add(e);
            System.out.println("Ekintza behar bezala sortu da.");
            return;
        }//if
        System.out.println("\n--- UDAKOEKINTZAK ---");
        for (int i = 0; i < UdakoEkintzak.size(); i++)
        {
            System.out.println("\n--- " + (i + 1) + ". ERREGISTROA ---");
            UdakoEkintzak.get(i).getALL();
        }//for
        int posizioa = erregistroaAukeratu(aukera, UdakoEkintzak.size());
        if (posizioa == -1) return;
        Udakoa e = UdakoEkintzak.get(posizioa);
        if (aukera.equals("kendu"))
        {
            UdakoEkintzak.remove(posizioa);
            System.out.println("Ekintza ezabatu da.");
        }//if
        else
        {
            if (!udakoMotak(e, false)) return;
            ekintzaDatuKomunak(e, false);
            System.out.println("Ekintzaren datuak aldatu dira.");
        }//else
    }//udakoakEragiketa
    //Talde honetako erregistroak sortu, erakutsi, aldatu edo kendu.
    private void hitzaldiakEragiketa(String aukera)
    {
        if (aukera.equals("berria"))
        {
            //Lehenengo datuak irakurri, gero objektua sortu.
            String ID = DerrigorrezkoBerba(sc, "Kodea: ");
            String Izena = DerrigorrezkoBerba(sc, "Izena: ");
            LocalDate HasieraData = SartuData(sc, "HasieraData", LocalDate.now());
            LocalDate BukaeraData;
            do
            {
                BukaeraData = SartuData(sc, "BukaeraData", HasieraData);
                if (BukaeraData.isBefore(HasieraData))
                {
                    System.out.println("Bukaera ezin da hasiera baino lehenago izan.");
                }//if
            }//do
            while (BukaeraData.isBefore(HasieraData));
            LocalTime HasieraOrdua = SartuOrdua(sc, "HasieraOrdua", LocalTime.of(9, 0));
            LocalTime BukaeraOrdua;
            do
            {
                BukaeraOrdua = SartuOrdua(sc, "BukaeraOrdua", LocalTime.of(10, 0));
                if (HasieraData.equals(BukaeraData) && BukaeraOrdua.isBefore(HasieraOrdua))
                {
                    System.out.println("Egun berean, bukaera ordua ezin da hasiera baino lehenago izan.");
                }//if
            }//do
            while (HasieraData.equals(BukaeraData) && BukaeraOrdua.isBefore(HasieraOrdua));
            double Prezioa = SartuDezimala(sc, "Prezioa", 0);
            String Deskribapena = PertsonaBerba(sc, "Deskribapena", "");
            String Kokapena = PertsonaBerba(sc, "Kokapena", "Ermua");
            int PlazaKop = 6;
            boolean plazaZuzena = false;
            do
            {
                String sarrera = HauIrakurri(sc, "PlazaKop [6]: ");
                if (sarrera.isEmpty())
                {
                    plazaZuzena = true;
                }//if
                else
                {
                    try
                    {
                        int zenbakia = Integer.parseInt(sarrera);
                        if (zenbakia < 0)
                        {
                            System.out.println("Plaza kopurua ezin da negatiboa izan.");
                        }//if
                        else
                        {
                            PlazaKop = zenbakia;
                            plazaZuzena = true;
                        }//else
                    }//try
                    catch (NumberFormatException error)
                    {
                        System.out.println("Sartu zero edo zenbaki oso positiboa.");
                    }//catch
                }//else
            }//do
            while (!plazaZuzena);
            String Hizlaria = PertsonaBerba(sc, "Hizlaria", "");
            Hitzaldia e = new Hitzaldia(ID, Izena, HasieraData, BukaeraData, HasieraOrdua, BukaeraOrdua, Prezioa,
                    Deskribapena, Kokapena, PlazaKop, Hizlaria);
            //Sortutako objektua bere taldearen zerrendan gorde.
            Hitzaldiak.add(e);
            System.out.println("Ekintza behar bezala sortu da.");
            return;
        }//if
        System.out.println("\n--- HITZALDIAK ---");
        for (int i = 0; i < Hitzaldiak.size(); i++)
        {
            System.out.println("\n--- " + (i + 1) + ". ERREGISTROA ---");
            Hitzaldiak.get(i).getALL();
        }//for
        int posizioa = erregistroaAukeratu(aukera, Hitzaldiak.size());
        if (posizioa == -1) return;
        Hitzaldia e = Hitzaldiak.get(posizioa);
        if (aukera.equals("kendu"))
        {
            Hitzaldiak.remove(posizioa);
            System.out.println("Ekintza ezabatu da.");
        }//if
        else
        {

            ekintzaDatuak(e, false);
            System.out.println("Ekintzaren datuak aldatu dira.");
        }//else
    }//hitzaldiakEragiketa
    //Talde honetako erregistroak sortu, erakutsi, aldatu edo kendu.
    private void kontzertuakEragiketa(String aukera)
    {
        if (aukera.equals("berria"))
        {
            //Lehenengo datuak irakurri, gero objektua sortu.
            String ID = DerrigorrezkoBerba(sc, "Kodea: ");
            String Izena = DerrigorrezkoBerba(sc, "Izena: ");
            LocalDate HasieraData = SartuData(sc, "HasieraData", LocalDate.now());
            LocalDate BukaeraData;
            do
            {
                BukaeraData = SartuData(sc, "BukaeraData", HasieraData);
                if (BukaeraData.isBefore(HasieraData))
                {
                    System.out.println("Bukaera ezin da hasiera baino lehenago izan.");
                }//if
            }//do
            while (BukaeraData.isBefore(HasieraData));
            LocalTime HasieraOrdua = SartuOrdua(sc, "HasieraOrdua", LocalTime.of(9, 0));
            LocalTime BukaeraOrdua;
            do
            {
                BukaeraOrdua = SartuOrdua(sc, "BukaeraOrdua", LocalTime.of(10, 0));
                if (HasieraData.equals(BukaeraData) && BukaeraOrdua.isBefore(HasieraOrdua))
                {
                    System.out.println("Egun berean, bukaera ordua ezin da hasiera baino lehenago izan.");
                }//if
            }//do
            while (HasieraData.equals(BukaeraData) && BukaeraOrdua.isBefore(HasieraOrdua));
            double Prezioa = SartuDezimala(sc, "Prezioa", 0);
            String Deskribapena = PertsonaBerba(sc, "Deskribapena", "");
            String Kokapena = PertsonaBerba(sc, "Kokapena", "Ermua");
            int PlazaKop = 6;
            boolean plazaZuzena = false;
            do
            {
                String sarrera = HauIrakurri(sc, "PlazaKop [6]: ");
                if (sarrera.isEmpty())
                {
                    plazaZuzena = true;
                }//if
                else
                {
                    try
                    {
                        int zenbakia = Integer.parseInt(sarrera);
                        if (zenbakia < 0)
                        {
                            System.out.println("Plaza kopurua ezin da negatiboa izan.");
                        }//if
                        else
                        {
                            PlazaKop = zenbakia;
                            plazaZuzena = true;
                        }//else
                    }//try
                    catch (NumberFormatException error)
                    {
                        System.out.println("Sartu zero edo zenbaki oso positiboa.");
                    }//catch
                }//else
            }//do
            while (!plazaZuzena);
            String Taldea = PertsonaBerba(sc, "Taldea", "");
            Kontzertua e = new Kontzertua(ID, Izena, HasieraData, BukaeraData, HasieraOrdua, BukaeraOrdua, Prezioa,
                    Deskribapena, Kokapena, PlazaKop, Taldea);
            //Sortutako objektua bere taldearen zerrendan gorde.
            Kontzertuak.add(e);
            System.out.println("Ekintza behar bezala sortu da.");
            return;
        }//if
        System.out.println("\n--- KONTZERTUAK ---");
        for (int i = 0; i < Kontzertuak.size(); i++)
        {
            System.out.println("\n--- " + (i + 1) + ". ERREGISTROA ---");
            Kontzertuak.get(i).getALL();
        }//for
        int posizioa = erregistroaAukeratu(aukera, Kontzertuak.size());
        if (posizioa == -1) return;
        Kontzertua e = Kontzertuak.get(posizioa);
        if (aukera.equals("kendu"))
        {
            Kontzertuak.remove(posizioa);
            System.out.println("Ekintza ezabatu da.");
        }//if
        else
        {

            ekintzaDatuak(e, false);
            System.out.println("Ekintzaren datuak aldatu dira.");
        }//else
    }//kontzertuakEragiketa
    //Talde honetako erregistroak sortu, erakutsi, aldatu edo kendu.
    private void jolasakEragiketa(String aukera)
    {
        if (aukera.equals("berria"))
        {
            //Lehenengo datuak irakurri, gero objektua sortu.
            String ID = DerrigorrezkoBerba(sc, "Kodea: ");
            String Izena = DerrigorrezkoBerba(sc, "Izena: ");
            LocalDate HasieraData = SartuData(sc, "HasieraData", LocalDate.now());
            LocalDate BukaeraData;
            do
            {
                BukaeraData = SartuData(sc, "BukaeraData", HasieraData);
                if (BukaeraData.isBefore(HasieraData))
                {
                    System.out.println("Bukaera ezin da hasiera baino lehenago izan.");
                }//if
            }//do
            while (BukaeraData.isBefore(HasieraData));
            LocalTime HasieraOrdua = SartuOrdua(sc, "HasieraOrdua", LocalTime.of(9, 0));
            LocalTime BukaeraOrdua;
            do
            {
                BukaeraOrdua = SartuOrdua(sc, "BukaeraOrdua", LocalTime.of(10, 0));
                if (HasieraData.equals(BukaeraData) && BukaeraOrdua.isBefore(HasieraOrdua))
                {
                    System.out.println("Egun berean, bukaera ordua ezin da hasiera baino lehenago izan.");
                }//if
            }//do
            while (HasieraData.equals(BukaeraData) && BukaeraOrdua.isBefore(HasieraOrdua));
            double Prezioa = SartuDezimala(sc, "Prezioa", 0);
            String Deskribapena = PertsonaBerba(sc, "Deskribapena", "");
            String Kokapena = PertsonaBerba(sc, "Kokapena", "Ermua");
            int PlazaKop = 6;
            boolean plazaZuzena = false;
            do
            {
                String sarrera = HauIrakurri(sc, "PlazaKop [6]: ");
                if (sarrera.isEmpty())
                {
                    plazaZuzena = true;
                }//if
                else
                {
                    try
                    {
                        int zenbakia = Integer.parseInt(sarrera);
                        if (zenbakia < 0)
                        {
                            System.out.println("Plaza kopurua ezin da negatiboa izan.");
                        }//if
                        else
                        {
                            PlazaKop = zenbakia;
                            plazaZuzena = true;
                        }//else
                    }//try
                    catch (NumberFormatException error)
                    {
                        System.out.println("Sartu zero edo zenbaki oso positiboa.");
                    }//catch
                }//else
            }//do
            while (!plazaZuzena);
            Ekintza e = new Ekintza(ID, Izena, HasieraData, BukaeraData, HasieraOrdua, BukaeraOrdua, Prezioa,
                    Deskribapena, Kokapena, PlazaKop);
            //Sortutako objektua bere taldearen zerrendan gorde.
            Jolasak.add(e);
            System.out.println("Ekintza behar bezala sortu da.");
            return;
        }//if
        System.out.println("\n--- JOLASAK ---");
        for (int i = 0; i < Jolasak.size(); i++)
        {
            System.out.println("\n--- " + (i + 1) + ". ERREGISTROA ---");
            Jolasak.get(i).getALL();
        }//for
        int posizioa = erregistroaAukeratu(aukera, Jolasak.size());
        if (posizioa == -1) return;
        Ekintza e = Jolasak.get(posizioa);
        if (aukera.equals("kendu"))
        {
            Jolasak.remove(posizioa);
            System.out.println("Ekintza ezabatu da.");
        }//if
        else
        {

            ekintzaDatuKomunak(e, false);
            System.out.println("Ekintzaren datuak aldatu dira.");
        }//else
    }//jolasakEragiketa
    //Talde honetako erregistroak sortu, erakutsi, aldatu edo kendu.
    private void irteerakEragiketa(String aukera)
    {
        if (aukera.equals("berria"))
        {
            //Lehenengo datuak irakurri, gero objektua sortu.
            String ID = DerrigorrezkoBerba(sc, "Kodea: ");
            String Izena = DerrigorrezkoBerba(sc, "Izena: ");
            LocalDate HasieraData = SartuData(sc, "HasieraData", LocalDate.now());
            LocalDate BukaeraData;
            do
            {
                BukaeraData = SartuData(sc, "BukaeraData", HasieraData);
                if (BukaeraData.isBefore(HasieraData))
                {
                    System.out.println("Bukaera ezin da hasiera baino lehenago izan.");
                }//if
            }//do
            while (BukaeraData.isBefore(HasieraData));
            LocalTime HasieraOrdua = SartuOrdua(sc, "HasieraOrdua", LocalTime.of(9, 0));
            LocalTime BukaeraOrdua;
            do
            {
                BukaeraOrdua = SartuOrdua(sc, "BukaeraOrdua", LocalTime.of(10, 0));
                if (HasieraData.equals(BukaeraData) && BukaeraOrdua.isBefore(HasieraOrdua))
                {
                    System.out.println("Egun berean, bukaera ordua ezin da hasiera baino lehenago izan.");
                }//if
            }//do
            while (HasieraData.equals(BukaeraData) && BukaeraOrdua.isBefore(HasieraOrdua));
            double Prezioa = SartuDezimala(sc, "Prezioa", 0);
            String Deskribapena = PertsonaBerba(sc, "Deskribapena", "");
            String Kokapena = PertsonaBerba(sc, "Kokapena", "Ermua");
            int PlazaKop = 6;
            boolean plazaZuzena = false;
            do
            {
                String sarrera = HauIrakurri(sc, "PlazaKop [6]: ");
                if (sarrera.isEmpty())
                {
                    plazaZuzena = true;
                }//if
                else
                {
                    try
                    {
                        int zenbakia = Integer.parseInt(sarrera);
                        if (zenbakia < 0)
                        {
                            System.out.println("Plaza kopurua ezin da negatiboa izan.");
                        }//if
                        else
                        {
                            PlazaKop = zenbakia;
                            plazaZuzena = true;
                        }//else
                    }//try
                    catch (NumberFormatException error)
                    {
                        System.out.println("Sartu zero edo zenbaki oso positiboa.");
                    }//catch
                }//else
            }//do
            while (!plazaZuzena);
            Ekintza e = new Ekintza(ID, Izena, HasieraData, BukaeraData, HasieraOrdua, BukaeraOrdua, Prezioa,
                    Deskribapena, Kokapena, PlazaKop);
            //Sortutako objektua bere taldearen zerrendan gorde.
            Irteerak.add(e);
            System.out.println("Ekintza behar bezala sortu da.");
            return;
        }//if
        System.out.println("\n--- IRTEERAK ---");
        for (int i = 0; i < Irteerak.size(); i++)
        {
            System.out.println("\n--- " + (i + 1) + ". ERREGISTROA ---");
            Irteerak.get(i).getALL();
        }//for
        int posizioa = erregistroaAukeratu(aukera, Irteerak.size());
        if (posizioa == -1) return;
        Ekintza e = Irteerak.get(posizioa);
        if (aukera.equals("kendu"))
        {
            Irteerak.remove(posizioa);
            System.out.println("Ekintza ezabatu da.");
        }//if
        else
        {

            ekintzaDatuKomunak(e, false);
            System.out.println("Ekintzaren datuak aldatu dira.");
        }//else
    }//irteerakEragiketa
    // Gainkarga: Java-k aldagaiaren deklaratutako motaren arabera aukeratzen du metodoa.
    //Jasotako pertsona motaren datu bereziak irakurri eta aldatu.
    private void datuBereziak(Gaztea g, boolean berria)
    {
        boolean bazkidea = BaiEz(sc, "Bazkidea da?", g.getBazkideIzanBalioa(), berria);
        g.setBazkideIzan(bazkidea);
        if (bazkidea)
        {
            g.setBazkideID(PertsonaBerba(sc, "BazkideID", g.getBazkideIDBalioa()));
        }//if
        else
        {
            g.setBazkideID("");
        }//else
    }//datuBereziak

    //Jasotako pertsona motaren datu bereziak irakurri eta aldatu.
    private void datuBereziak(Langile l, boolean berria)
    {
        if (berria)
        {
            l.setLangileID(DerrigorrezkoBerba(sc, "LangileID: "));
        }//if
        else
        {
            l.setLangileID(PertsonaBerba(sc, "LangileID", l.getLangileIDBalioa()));
        }//else
        l.setPostua(langilePostua(l.getPostuaBalioa(), berria));
        if (l.getPostuaBalioa().equals("Monitorea"))
        {
            l.setArduraduaIzan(BaiEz(sc, "Arduraduna da?", l.getArduraduaIzanBalioa(), berria));
        }//if
        else
        {
            l.setArduraduaIzan(false);
        }//else
    }//datuBereziak

    //Jasotako pertsona motaren datu bereziak irakurri eta aldatu.
    private void datuBereziak(Tutorea t, boolean berria)
    {
        if (berria)
        {
            t.setTutoreID(DerrigorrezkoBerba(sc, "TutoreID: "));
        }//if
        else
        {
            t.setTutoreID(PertsonaBerba(sc, "TutoreID", t.getTutoreIDBalioa()));
        }//else
    }//datuBereziak

    //Ekintzaren datu komunak eta mota horren datu berezia aldatu.
    private void ekintzaDatuak(Hitzaldia h, boolean berria)
    {
        ekintzaDatuKomunak(h, berria);
        h.setHizlaria(PertsonaBerba(sc, "Hizlaria", h.getHizlariaBalioa()));
    }//ekintzaDatuak

    //Ekintzaren datu komunak eta mota horren datu berezia aldatu.
    private void ekintzaDatuak(Kontzertua k, boolean berria)
    {
        ekintzaDatuKomunak(k, berria);
        k.setTaldea(PertsonaBerba(sc, "Taldea", k.getTaldeaBalioa()));
    }//ekintzaDatuak

    //Aukeratutako pertsonaren datu bakarra hustu.
    public void PertsonaDatuaEzabatu(Pertsona p)
    {
        pantallaGarbitu();
        boolean besteBat;
        do
        {
            System.out.println("NAN, Izena, Abizenak, Herrialdea, Helbidea, Posta-Kodea, Telefonoa, Jaiotza data, Email");
            if (p instanceof Gaztea)
            {
                System.out.println("BazkideID, BazkideIzan");
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

                case "abizena", "abizenak":
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

                case "posta-kodea", "postakodea":
                {
                    p.setPostaKodea("");
                }//case postakodea
                break;

                case "telefonoa":
                {
                    p.setTelefonoa("");
                }//case telefonoa
                break;

                case "jaiotza data", "jaiotzadata":
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

                case "bazkideizan", "erroldatua":
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

    //Ekintzaren datuak aldatu, datak eta orduak egiaztatuz.
    private void ekintzaDatuKomunak(Ekintza e, boolean berria)
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
        boolean plazaZuzena = false;
        do
        {
            String s = HauIrakurri(sc, "PlazaKop [" + e.getPlazaKopBalioa() + "]: ");
            if (s.isEmpty())
            {
                plazaZuzena = true;
            }//if
            else
            {
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
                        plazaZuzena = true;
                    }//else
                }//try
                catch (IllegalArgumentException ex)
                {
                    System.out.println("Sartu zero edo zenbaki oso positiboa.");
                }//catch
            }//else
        }//do
        while (!plazaZuzena);
    }//ekintzaDatuKomunak

    //Programa abiarazi eta menu nagusia erakutsi.
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

    //Erregistro berria zein motatakoa izango den aukeratu.
    private String motaBerria(boolean pertsona)
    {
        String hautatua = "";
        boolean aukeraZuzena = false;

        do
        {
            if (pertsona)
            {
                laukia("AUKERATU PERTSONA MOTA", "1 - Gaztea", "2 - Langile", "3 - Tutorea", "0 - Atzera");
                switch (irakurri())
                {
                    case "1", "gaztea", "gazteak":
                    {
                        hautatua = "gaztea";
                        aukeraZuzena = true;
                    }//case gazteak
                    break;

                    case "2", "langile", "langilea", "langileak":
                    {
                        hautatua = "langilea";
                        aukeraZuzena = true;
                    }//case langileak
                    break;

                    case "3", "tutorea", "tutoreak":
                    {
                        hautatua = "tutorea";
                        aukeraZuzena = true;
                    }//case tutoreak
                    break;

                    case "0", "atzera":
                    {
                        hautatua = "";
                        aukeraZuzena = true;
                    }//case atzera
                    break;
                }//switch
            }//if
            else
            {
                laukia("AUKERATU EKINTZA MOTA", "1 - Asteburukoak", "2 - Udakoak", "0 - Atzera");
                switch (irakurri())
                {
                    case "1", "asteburukoa", "asteburukoak", "asteburuekintza", "asteburukoekintza":
                    {
                        hautatua = asteburukoMota();
                        aukeraZuzena = true;
                    }//case asteburukoekintza
                    break;

                    case "2", "udakoa", "udakoak", "udaekintza", "udakoekintza":
                    {
                        hautatua = "udakoak";
                        aukeraZuzena = true;
                    }//case udakoekintza
                    break;

                    case "0", "atzera":
                    {
                        hautatua = "";
                        aukeraZuzena = true;
                    }//case atzera
                    break;
                }//switch
            }//else
            if (!aukeraZuzena)
            {
                System.out.println("Aukera ez da zuzena.");
            }//if
        }//do
        while (!aukeraZuzena);

        return hautatua;
    }//motaBerria

    //Asteburuko lau ekintza motetatik bat aukeratu.
    private String asteburukoMota()
    {
        String hautatua = "";
        boolean aukeraZuzena = false;

        do
        {
            laukia("AUKERATU ASTEBURUKO MOTA", "1 - Hitzaldia", "2 - Kontzertua", "3 - Jolasa", "4 - Irteera", "0 - Atzera");
            switch (irakurri())
            {
                case "1", "hitzaldia", "hitzaldiak":
                {
                    hautatua = "hitzaldiak";
                    aukeraZuzena = true;
                }//case hitzaldiak
                break;

                case "2", "kontzertua", "kontzertuak":
                {
                    hautatua = "kontzertuak";
                    aukeraZuzena = true;
                }//case kontzertuak
                break;

                case "3", "jolasa", "jolasak":
                {
                    hautatua = "jolasak";
                    aukeraZuzena = true;
                }//case jolasak
                break;

                case "4", "irteera", "irteerak":
                {
                    hautatua = "irteerak";
                    aukeraZuzena = true;
                }//case irteerak
                break;

                case "0", "atzera":
                {
                    hautatua = "";
                    aukeraZuzena = true;
                }//case atzera
                break;

                default:
                {
                    if (!aukeraZuzena)
            {
                System.out.println("Aukera ez da zuzena.");
            }//if
                }//default
            }//switch
        }//do
        while (!aukeraZuzena);

        return hautatua;
    }//asteburukoMota

    //Udako mota eta, behar bada, eguneko jarduera aukeratu.
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

    //Egunekoa edo gauekoa aukeratu, zenbakiz edo testuz.
    private String udakoMota(String aurrekoa, boolean berria)
    {
        pantallaGarbitu();
        String hautatua = "";
        boolean aukeraZuzena = false;

        do
        {
            laukia("UDAKO EKINTZA", "1 - Egunekoa", "2 - Gauekoa", "0 - Atzera");
            if (!berria)
            {
                System.out.println("Enter: " + aurrekoa + " mantendu");
            }//if
            switch (irakurri())
            {
                case "1", "egunekoa", "eguneko":
                {
                    hautatua = "Egunekoa";
                    aukeraZuzena = true;
                }//case egunekoa
                break;

                case "2", "gauekoa", "gaueko":
                {
                    hautatua = "Gauekoa";
                    aukeraZuzena = true;
                }//case gauekoa
                break;

                case "0", "atzera":
                {
                    hautatua = null;
                    aukeraZuzena = true;
                }//case atzera
                break;

                case "":
                {
                    if (!berria)
                    {
                        hautatua = aurrekoa;
                        aukeraZuzena = true;
                    }//if
                }//case hutsik
                break;

                default:
                {
                }//default
            }//switch
            if (!aukeraZuzena)
            {
                System.out.println("Aukera ez da zuzena.");
            }//if
        }//do
        while (!aukeraZuzena);

        return hautatua;
    }//udakoMota

    //Eguneko hiru jardueretatik bat aukeratu.
    private String egunekoMota(String aurrekoa, boolean berria)
    {
        pantallaGarbitu();
        String hautatua = "";
        boolean aukeraZuzena = false;

        do
        {
            laukia("EGUNEKO EKINTZA", "1 - Surf Hastapena", "2 - Paddle Surf", "3 - Mendi Irteera", "0 - Atzera");
            if (!berria)
            {
                System.out.println("Enter: " + aurrekoa + " mantendu");
            }//if
            switch (irakurri())
            {
                case "1", "surfhastapena":
                {
                    hautatua = "Surf Hastapena";
                    aukeraZuzena = true;
                }//case surfhastapena
                break;

                case "2", "paddlesurf", "surfpaddle":
                {
                    hautatua = "Paddle Surf";
                    aukeraZuzena = true;
                }//case paddlesurf
                break;

                case "3", "mendiirteera":
                {
                    hautatua = "Mendi Irteera";
                    aukeraZuzena = true;
                }//case mendiirteera
                break;

                case "0", "atzera":
                {
                    hautatua = null;
                    aukeraZuzena = true;
                }//case atzera
                break;

                case "":
                {
                    if (!berria)
                    {
                        hautatua = aurrekoa;
                        aukeraZuzena = true;
                    }//if
                }//case hutsik
                break;

                default:
                {
                }//default
            }//switch
            if (!aukeraZuzena)
            {
                System.out.println("Aukera ez da zuzena.");
            }//if
        }//do
        while (!aukeraZuzena);

        return hautatua;
    }//egunekoMota

    //Monitorea edo administrazioa den aukeratu.
    private String langilePostua(String aurrekoa, boolean berria)
    {
        pantallaGarbitu();
        String hautatua = "";
        boolean aukeraZuzena = false;

        do
        {
            laukia("LANGILE MOTA", "1 - Monitorea", "2 - Administrazioa");
            if (!berria)
            {
                System.out.println("Enter: " + aurrekoa + " mantendu");
            }//if
            switch (irakurri())
            {
                case "1", "monitorea":
                {
                    hautatua = "Monitorea";
                    aukeraZuzena = true;
                }//case monitorea
                break;

                case "2", "administrazioa":
                {
                    hautatua = "Administrazioa";
                    aukeraZuzena = true;
                }//case administrazioa
                break;

                case "":
                {
                    if (!berria)
                    {
                        hautatua = aurrekoa;
                        aukeraZuzena = true;
                    }//if
                }//case hutsik
                break;

                default:
                {
                }//default
            }//switch
            if (!aukeraZuzena)
            {
                System.out.println("Aukera ez da zuzena.");
            }//if
        }//do
        while (!aukeraZuzena);

        return hautatua;
    }//langilePostua
}//MenuNagusia
