package com.mycompany.gaztelekua;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
public class Ekintza
{
    //Aldagaiak sortu
    private static DateTimeFormatter Formato = DateTimeFormatter.ofPattern("uuuu/MM/dd").withResolverStyle(ResolverStyle.STRICT);
    private String ID = "";
    private String Izena = "";
    private LocalDate HasieraData = LocalDate.now();
    private LocalDate BukaeraData = LocalDate.now();
    private String Kokapena = "Ermua";
    private int PlazaKop = 6;
    private LocalTime HasieraOrdua = LocalTime.of(9, 0);
    private LocalTime BukaeraOrdua = LocalTime.of(10, 0);
    private double Prezioa = 0;
    private String Deskribapena = "";

    public Ekintza()
    {
    }//Ekintza

    public Ekintza(String id, String izen)
    {
        ID = id;
        Izena = izen;
    }//Ekintza

    public Ekintza(String id, String izen, LocalDate hd)
    {
        this(id, izen);
        HasieraData = hd;
        BukaeraData = hd;
    }//Ekintza

    public Ekintza(String iz, String hd, int pk)
    {
        this(iz, hd, hd, "", pk);
    }//Ekintza

    public Ekintza(String iz, String hd, String bd, int pk)
    {
        this(iz, hd, bd, "", pk);
    }//Ekintza

    public Ekintza(String iz, String hd, String bd, String kok, int pk)
    {
        Izena = iz;
        setHasieraData(hd);
        setBukaeraData(bd);
        setKokapena(kok);
        setPlazaKop(pk);
    }//Ekintza

    //___IDBalioa___
    public String getIDBalioa()
    {
        return ID;
    }//getIDBalioa

    //___ID___
    public void getID()
    {
        System.out.println("ID: \u001B[34m" + ID + "\u001B[0m");
    }//getID

    //___ID___
    public void setID(String a)
    {
        ID = a;
    }//setID

    //___ID___
    public void setID()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("ID: ");
        setID(balioa);
    }//setID

    //___IzenaBalioa___
    public String getIzenaBalioa()
    {
        return Izena;
    }//getIzenaBalioa

    //___Izena___
    public void getIzena()
    {
        System.out.println("Izena: \u001B[34m" + Izena + "\u001B[0m");
    }//getIzena

    //___Izena___
    public void setIzena(String a)
    {
        Izena = a;
    }//setIzena

    //___Izena___
    public void setIzena()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Izena: ");
        setIzena(balioa);
    }//setIzena

    //___HasieraDataBalioa___
    public LocalDate getHasieraDataBalioa()
    {
        return HasieraData;
    }//getHasieraDataBalioa

    //___HasieraData___
    public void getHasieraData()
    {
        System.out.println("HasieraData: \u001B[34m" + HasieraData + "\u001B[0m");
    }//getHasieraData

    //___HasieraData___
    public void setHasieraData(String a)
    {
        HasieraData = LocalDate.parse(a, Formato);
    }//setHasieraData

    //___HasieraData___
    public void setHasieraData()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("HasieraData(uuuu/MM/dd): ");
        setHasieraData(balioa);
    }//setHasieraData

    //___BukaeraDataBalioa___
    public LocalDate getBukaeraDataBalioa()
    {
        return BukaeraData;
    }//getBukaeraDataBalioa

    //___BukaeraData___
    public void getBukaeraData()
    {
        System.out.println("BukaeraData: \u001B[34m" + BukaeraData + "\u001B[0m");
    }//getBukaeraData

    //___BukaeraData___
    public void setBukaeraData(String a)
    {
        BukaeraData = LocalDate.parse(a, Formato);
    }//setBukaeraData

    //___BukaeraData___
    public void setBukaeraData()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("BukaeraData(uuuu/MM/dd): ");
        setBukaeraData(balioa);
    }//setBukaeraData

    //___KokapenaBalioa___
    public String getKokapenaBalioa()
    {
        return Kokapena;
    }//getKokapenaBalioa

    //___Kokapena___
    public void getKokapena()
    {
        System.out.println("Kokapena: \u001B[34m" + Kokapena + "\u001B[0m");
    }//getKokapena

    //___Kokapena___
    public void setKokapena(String a)
    {
        if (a.trim().isEmpty())
        {
            Kokapena = "Ermua";
        }//if
        else
        {
            Kokapena = a;
        }//else
    }//setKokapena

    //___Kokapena___
    public void setKokapena()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Kokapena: ");
        setKokapena(balioa);
    }//setKokapena

    //___PlazaKopBalioa___
    public int getPlazaKopBalioa()
    {
        return PlazaKop;
    }//getPlazaKopBalioa

    //___PlazaKop___
    public void getPlazaKop()
    {
        System.out.println("PlazaKop: \u001B[34m" + PlazaKop + "\u001B[0m");
    }//getPlazaKop

    //___PlazaKop___
    public void setPlazaKop(int a)
    {
        PlazaKop = a;
    }//setPlazaKop

    //___PlazaKop___
    public void setPlazaKop()
    {
        int balioa = MetodoPraktikoak.SartuZenbakia(MetodoPraktikoak.teklatua, "PlazaKop: ");
        PlazaKop = balioa;
    }//setPlazaKop

    //___ALL___
    public void getALL()
    {
        getKodea();
        getIzena();
        getHasieraData();
        getBukaeraData();
        getKokapena();
        getPlazaKop();
        getHasieraOrdua();
        getBukaeraOrdua();
        getPrezioa();
        getDeskribapena();
    }//getALL
    // Diagramako izena; getALL mantendu da aurreko kodearekiko bateragarri.
    //___All___
    public void getAll()
    {
        getALL();
    }//getAll

    // Ekintza mota aldatzean datu komunak mantentzeko.
    public Ekintza(Ekintza e)
    {
        ID = e.ID;
        Izena = e.Izena;
        HasieraData = e.HasieraData;
        BukaeraData = e.BukaeraData;
        Kokapena = e.Kokapena;
        PlazaKop = e.PlazaKop;
        HasieraOrdua = e.HasieraOrdua;
        BukaeraOrdua = e.BukaeraOrdua;
        Prezioa = e.Prezioa;
        Deskribapena = e.Deskribapena;
    }//Ekintza

    //___HasieraOrdua___
    public void setHasieraOrdua(LocalTime a)
    {
        HasieraOrdua = a;
    }//setHasieraOrdua

    //___HasieraOrdua___
    public void setHasieraOrdua()
    {
        LocalTime balioa = MetodoPraktikoak.SartuOrdua(MetodoPraktikoak.teklatua, "HasieraOrdua", HasieraOrdua);
        HasieraOrdua = balioa;
    }//setHasieraOrdua

    //___HasieraOrduaBalioa___
    public LocalTime getHasieraOrduaBalioa()
    {
        return HasieraOrdua;
    }//getHasieraOrduaBalioa

    //___HasieraOrdua___
    public void getHasieraOrdua()
    {
        System.out.println("HasieraOrdua: \u001B[34m" + HasieraOrdua + "\u001B[0m");
    }//getHasieraOrdua

    //___BukaeraOrdua___
    public void setBukaeraOrdua(LocalTime a)
    {
        BukaeraOrdua = a;
    }//setBukaeraOrdua

    //___BukaeraOrdua___
    public void setBukaeraOrdua()
    {
        LocalTime balioa = MetodoPraktikoak.SartuOrdua(MetodoPraktikoak.teklatua, "BukaeraOrdua", BukaeraOrdua);
        BukaeraOrdua = balioa;
    }//setBukaeraOrdua

    //___BukaeraOrduaBalioa___
    public LocalTime getBukaeraOrduaBalioa()
    {
        return BukaeraOrdua;
    }//getBukaeraOrduaBalioa

    //___BukaeraOrdua___
    public void getBukaeraOrdua()
    {
        System.out.println("BukaeraOrdua: \u001B[34m" + BukaeraOrdua + "\u001B[0m");
    }//getBukaeraOrdua

    //___Prezioa___
    public void setPrezioa(double a)
    {
        Prezioa = a;
    }//setPrezioa

    //___Prezioa___
    public void setPrezioa()
    {
        double balioa = MetodoPraktikoak.SartuDezimala(MetodoPraktikoak.teklatua, "Prezioa", Prezioa);
        Prezioa = balioa;
    }//setPrezioa

    //___PrezioaBalioa___
    public double getPrezioaBalioa()
    {
        return Prezioa;
    }//getPrezioaBalioa

    //___Prezioa___
    public void getPrezioa()
    {
        System.out.println("Prezioa: \u001B[34m" + Prezioa + "\u001B[0m");
    }//getPrezioa

    //___Deskribapena___
    public void setDeskribapena(String a)
    {
        Deskribapena = a;
    }//setDeskribapena

    //___Deskribapena___
    public void setDeskribapena()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Deskribapena: ");
        setDeskribapena(balioa);
    }//setDeskribapena

    //___DeskribapenaBalioa___
    public String getDeskribapenaBalioa()
    {
        return Deskribapena;
    }//getDeskribapenaBalioa

    //___Deskribapena___
    public void getDeskribapena()
    {
        System.out.println("Deskribapena: \u001B[34m" + Deskribapena + "\u001B[0m");
    }//getDeskribapena

    //___Kodea___
    public void setKodea(String a)
    {
        setID(a);
    }//setKodea

    //___Kodea___
    public void setKodea()
    {
        setID();
    }//setKodea

    //___KodeaBalioa___
    public String getKodeaBalioa()
    {
        return getIDBalioa();
    }//getKodeaBalioa

    //___Kodea___
    public void getKodea()
    {
        System.out.println("Kodea: \u001B[34m" + getIDBalioa() + "\u001B[0m");
    }//getKodea

}//Ekintza
