package com.mycompany.gaztelekua;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
//Ekintza guztien datu komunak gordetzeko klasea.
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

    //_________
    //Eraikitzailea: objektuaren hasierako datuak prestatu.
    public Ekintza()
    {
    }//Ekintza

    //Eraikitzailea: jasotako datuak objektuan gorde.
    //Eraikitzailea: jasotako datuak gorde; komunak gurasoari pasatu.
    public Ekintza(String id, String izen, LocalDate hd, LocalDate bd, LocalTime ho, LocalTime bo, double prezioa,
            String deskribapena, String kokapena, int plazaKop)
    {
        ID = id;
        Izena = izen;
        HasieraData = hd;
        BukaeraData = bd;
        HasieraOrdua = ho;
        BukaeraOrdua = bo;
        Prezioa = prezioa;
        Deskribapena = deskribapena;
        setKokapena(kokapena);
        PlazaKop = plazaKop;
    }//Ekintza

    //___IDBalioa___
    //ID datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getIDBalioa()
    {
        return ID;
    }//getIDBalioa

    //___ID___
    //ID datuaren balio berria gorde.
    public void setID(String a)
    {
        ID = a;
    }//setID

    //___IzenaBalioa___
    //Izena datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getIzenaBalioa()
    {
        return Izena;
    }//getIzenaBalioa

    //___Izena___
    //Izena datua pantailan erakutsi.
    public void getIzena()
    {
        System.out.println("Izena: \u001B[34m" + Izena + "\u001B[0m");
    }//getIzena

    //___Izena___
    //Izena datuaren balio berria gorde.
    public void setIzena(String a)
    {
        Izena = a;
    }//setIzena

    //___HasieraDataBalioa___
    //HasieraData datuaren balioa bueltatu, pantailan erakutsi gabe.
    public LocalDate getHasieraDataBalioa()
    {
        return HasieraData;
    }//getHasieraDataBalioa

    //___HasieraData___
    //HasieraData datua pantailan erakutsi.
    public void getHasieraData()
    {
        System.out.println("HasieraData: \u001B[34m" + HasieraData + "\u001B[0m");
    }//getHasieraData

    //___HasieraData___
    //HasieraData datuaren balio berria gorde.
    public void setHasieraData(String a)
    {
        HasieraData = LocalDate.parse(a, Formato);
    }//setHasieraData

    //___BukaeraDataBalioa___
    //BukaeraData datuaren balioa bueltatu, pantailan erakutsi gabe.
    public LocalDate getBukaeraDataBalioa()
    {
        return BukaeraData;
    }//getBukaeraDataBalioa

    //___BukaeraData___
    //BukaeraData datua pantailan erakutsi.
    public void getBukaeraData()
    {
        System.out.println("BukaeraData: \u001B[34m" + BukaeraData + "\u001B[0m");
    }//getBukaeraData

    //___BukaeraData___
    //BukaeraData datuaren balio berria gorde.
    public void setBukaeraData(String a)
    {
        BukaeraData = LocalDate.parse(a, Formato);
    }//setBukaeraData

    //___KokapenaBalioa___
    //Kokapena datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getKokapenaBalioa()
    {
        return Kokapena;
    }//getKokapenaBalioa

    //___Kokapena___
    //Kokapena datua pantailan erakutsi.
    public void getKokapena()
    {
        System.out.println("Kokapena: \u001B[34m" + Kokapena + "\u001B[0m");
    }//getKokapena

    //___Kokapena___
    //Kokapena datuaren balio berria gorde.
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

    //___PlazaKopBalioa___
    //PlazaKop datuaren balioa bueltatu, pantailan erakutsi gabe.
    public int getPlazaKopBalioa()
    {
        return PlazaKop;
    }//getPlazaKopBalioa

    //___PlazaKop___
    //PlazaKop datua pantailan erakutsi.
    public void getPlazaKop()
    {
        System.out.println("PlazaKop: \u001B[34m" + PlazaKop + "\u001B[0m");
    }//getPlazaKop

    //___PlazaKop___
    //PlazaKop datuaren balio berria gorde.
    public void setPlazaKop(int a)
    {
        PlazaKop = a;
    }//setPlazaKop

    //___ALL___
    //Objektuaren datu guztiak pantailan erakutsi.
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

    //___HasieraOrdua___
    //HasieraOrdua datuaren balio berria gorde.
    public void setHasieraOrdua(LocalTime a)
    {
        HasieraOrdua = a;
    }//setHasieraOrdua

    //___HasieraOrduaBalioa___
    //HasieraOrdua datuaren balioa bueltatu, pantailan erakutsi gabe.
    public LocalTime getHasieraOrduaBalioa()
    {
        return HasieraOrdua;
    }//getHasieraOrduaBalioa

    //___HasieraOrdua___
    //HasieraOrdua datua pantailan erakutsi.
    public void getHasieraOrdua()
    {
        System.out.println("HasieraOrdua: \u001B[34m" + HasieraOrdua + "\u001B[0m");
    }//getHasieraOrdua

    //___BukaeraOrdua___
    //BukaeraOrdua datuaren balio berria gorde.
    public void setBukaeraOrdua(LocalTime a)
    {
        BukaeraOrdua = a;
    }//setBukaeraOrdua

    //___BukaeraOrduaBalioa___
    //BukaeraOrdua datuaren balioa bueltatu, pantailan erakutsi gabe.
    public LocalTime getBukaeraOrduaBalioa()
    {
        return BukaeraOrdua;
    }//getBukaeraOrduaBalioa

    //___BukaeraOrdua___
    //BukaeraOrdua datua pantailan erakutsi.
    public void getBukaeraOrdua()
    {
        System.out.println("BukaeraOrdua: \u001B[34m" + BukaeraOrdua + "\u001B[0m");
    }//getBukaeraOrdua

    //___Prezioa___
    //Prezioa datuaren balio berria gorde.
    public void setPrezioa(double a)
    {
        Prezioa = a;
    }//setPrezioa

    //___PrezioaBalioa___
    //Prezioa datuaren balioa bueltatu, pantailan erakutsi gabe.
    public double getPrezioaBalioa()
    {
        return Prezioa;
    }//getPrezioaBalioa

    //___Prezioa___
    //Prezioa datua pantailan erakutsi.
    public void getPrezioa()
    {
        System.out.println("Prezioa: \u001B[34m" + Prezioa + "\u001B[0m");
    }//getPrezioa

    //___Deskribapena___
    //Deskribapena datuaren balio berria gorde.
    public void setDeskribapena(String a)
    {
        Deskribapena = a;
    }//setDeskribapena

    //___DeskribapenaBalioa___
    //Deskribapena datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getDeskribapenaBalioa()
    {
        return Deskribapena;
    }//getDeskribapenaBalioa

    //___Deskribapena___
    //Deskribapena datua pantailan erakutsi.
    public void getDeskribapena()
    {
        System.out.println("Deskribapena: \u001B[34m" + Deskribapena + "\u001B[0m");
    }//getDeskribapena

    //___Kodea___
    //Kodea datua pantailan erakutsi.
    public void getKodea()
    {
        System.out.println("Kodea: \u001B[34m" + getIDBalioa() + "\u001B[0m");
    }//getKodea

}//Ekintza
