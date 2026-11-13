package com.mycompany.gaztelekua;
import java.time.LocalDate;
public class Gaztea extends Pertsona
{
    private boolean BazkideIzan = false;
    private String BazkideID = "";
    private String TutoreID = "Tutore barik";
    private double UrtekoKuota = 0.0;
    public Gaztea()
    {
        super();
    }//Gaztea

    public Gaztea(Pertsona p)
    {
        super(p);
    }//Gaztea

    public Gaztea(String nan, String izen, String abi, String her, String hel, String kp, String tlf, LocalDate jd, boolean bazk)
    {
        super(nan, izen, abi, her, hel, kp, tlf, jd);
        BazkideIzan = bazk;
    }//Gaztea

    public Gaztea(String nan, String izen, String abi, String her, String hel, String kp, String tlf, LocalDate jd, boolean bazk, String id, double kuota)
    {
        this(nan, izen, abi, her, hel, kp, tlf, jd, bazk);
        BazkideID = id;
        setUrtekoKuota(kuota);
    }//Gaztea

    //___BazkideIzan___
    public void setBazkideIzan(boolean a)
    {
        BazkideIzan = a;
    }//setBazkideIzan

    //___BazkideIzan___
    public void setBazkideIzan()
    {
        boolean balioa = MetodoPraktikoak.BaiEz(MetodoPraktikoak.teklatua, "Bazkidea da?");
        BazkideIzan = balioa;
    }//setBazkideIzan

    //___BazkideIzanBalioa___
    public boolean getBazkideIzanBalioa()
    {
        return BazkideIzan;
    }//getBazkideIzanBalioa

    //___BazkideIzan___
    public void getBazkideIzan()
    {
        System.out.println("BazkideIzan: \u001B[34m" + BazkideIzan + "\u001B[0m");
    }//getBazkideIzan

    //___BazkideID___
    public void setBazkideID(String a)
    {
        BazkideID = a;
    }//setBazkideID

    //___BazkideID___
    public void setBazkideID()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("BazkideID: ");
        setBazkideID(balioa);
    }//setBazkideID

    //___BazkideIDBalioa___
    public String getBazkideIDBalioa()
    {
        return BazkideID;
    }//getBazkideIDBalioa

    //___BazkideID___
    public void getBazkideID()
    {
        System.out.println("BazkideID: \u001B[34m" + BazkideID + "\u001B[0m");
    }//getBazkideID

    //___UrtekoKuota___
    public void setUrtekoKuota(double a)
    {
        UrtekoKuota = a;
    }//setUrtekoKuota

    //___UrtekoKuota___
    public void setUrtekoKuota()
    {
        double kuota = MetodoPraktikoak.SartuDezimala(MetodoPraktikoak.teklatua, "UrtekoKuota", UrtekoKuota);
        UrtekoKuota = kuota;
    }//setUrtekoKuota

    //___UrtekoKuotaBalioa___
    public double getUrtekoKuotaBalioa()
    {
        return UrtekoKuota;
    }//getUrtekoKuotaBalioa

    //___UrtekoKuota___
    public void getUrtekoKuota()
    {
        System.out.println("UrtekoKuota: \u001B[34m" + UrtekoKuota + "\u001B[0m");
    }//getUrtekoKuota

    //___ALL___
    public void getALL()
    {
        super.getALL();
        getBazkideIzan();
        getBazkideID();
        getUrtekoKuota();
        getTutoreID();
    }//getALL

    //___TutoreID___
    public void setTutoreID(String balioa)
    {
        if (balioa.trim().isEmpty())
        {
            TutoreID = "Tutore barik";
        }//if
        else
        {
            TutoreID = balioa;
        }//else
    }//setTutoreID

    //___TutoreID___
    public void setTutoreID()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("TutoreID (Enter = Tutore barik): ");
        setTutoreID(balioa);
    }//setTutoreID

    //___TutoreIDBalioa___
    public String getTutoreIDBalioa()
    {
        return TutoreID;
    }//getTutoreIDBalioa

    //___TutoreID___
    public void getTutoreID()
    {
        System.out.println("TutoreID: \u001B[34m" + TutoreID + "\u001B[0m");
    }//getTutoreID
}//Gaztea
