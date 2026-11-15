package com.mycompany.gaztelekua;
import java.time.LocalDate;
//Gaztearen datuak eta bazkide egoera gordetzeko klasea.
public class Gaztea extends Pertsona
{
    private boolean BazkideIzan = false;
    private String BazkideID = "";
    private double UrtekoKuota = 0.0;
    //Eraikitzailea: objektuaren hasierako datuak prestatu.
    public Gaztea()
    {
        super();
    }//Gaztea

    //Eraikitzailea: jasotako datuak objektuan gorde.
    //Eraikitzailea: jasotako datuak gorde; komunak gurasoari pasatu.
    public Gaztea(String nan, String izen, String abi, String her, String hel, String kp, String tlf, LocalDate jd,
            String email, boolean bazkide, String bazkideID)
    {
        super(nan, izen, abi, her, hel, kp, tlf, jd, email);
        setBazkideIzan(bazkide);
        BazkideID = bazkideID;
    }//Gaztea

    //___BazkideIzan___
    //BazkideIzan datuaren balio berria gorde.
    public void setBazkideIzan(boolean a)
    {
        BazkideIzan = a;
        //Bazkideen urteko kuota beti 10 da; ez bazkideek ez dute kuotarik.
        if (BazkideIzan)
        {
            UrtekoKuota = 10;
        }//if
        else
        {
            UrtekoKuota = 0;
        }//else
    }//setBazkideIzan

    //___BazkideIzanBalioa___
    //BazkideIzan datuaren balioa bueltatu, pantailan erakutsi gabe.
    public boolean getBazkideIzanBalioa()
    {
        return BazkideIzan;
    }//getBazkideIzanBalioa

    //___BazkideIzan___
    //BazkideIzan datua pantailan erakutsi.
    public void getBazkideIzan()
    {
        System.out.println("BazkideIzan: \u001B[34m" + BazkideIzan + "\u001B[0m");
    }//getBazkideIzan

    //___BazkideID___
    //BazkideID datuaren balio berria gorde.
    public void setBazkideID(String a)
    {
        BazkideID = a;
    }//setBazkideID

    //___BazkideIDBalioa___
    //BazkideID datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getBazkideIDBalioa()
    {
        return BazkideID;
    }//getBazkideIDBalioa

    //___BazkideID___
    //BazkideID datua pantailan erakutsi.
    public void getBazkideID()
    {
        System.out.println("BazkideID: \u001B[34m" + BazkideID + "\u001B[0m");
    }//getBazkideID

    //___UrtekoKuotaBalioa___
    //UrtekoKuota datuaren balioa bueltatu, pantailan erakutsi gabe.
    public double getUrtekoKuotaBalioa()
    {
        return UrtekoKuota;
    }//getUrtekoKuotaBalioa

    //___UrtekoKuota___
    //UrtekoKuota datua pantailan erakutsi.
    public void getUrtekoKuota()
    {
        System.out.println("UrtekoKuota: \u001B[34m" + UrtekoKuota + "\u001B[0m");
    }//getUrtekoKuota

    //___ALL___
    //Datu guztiak erakutsi; klase hauek dituzten datuak ere gehitu.
    public void getALL()
    {
        super.getALL();
        getBazkideIzan();
        getBazkideID();
        getUrtekoKuota();
    }//getALL

}//Gaztea
