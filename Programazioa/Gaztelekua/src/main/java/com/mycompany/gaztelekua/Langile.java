package com.mycompany.gaztelekua;
import java.time.LocalDate;
public class Langile extends Pertsona
{
    private String LangileID = "";
    private String Postua = "";
    private boolean ArduraduaIzan = false;
    public Langile()
    {
        super();
    }//Langile

    public Langile(Pertsona p)
    {
        super(p);
    }//Langile

    public Langile(String nan, String izen, String abi, String her, String hel, String kp, String tlf, LocalDate jd, String id, String pos)
    {
        super(nan, izen, abi, her, hel, kp, tlf, jd);
        LangileID = id;
        Postua = pos;
    }//Langile

    public Langile(String nan, String izen, String abi, String her, String hel, String kp, String tlf, LocalDate jd, String id, String pos, boolean ard)
    {
        this(nan, izen, abi, her, hel, kp, tlf, jd, id, pos);
        setArduraduaIzan(ard);
    }//Langile

    //___LangileID___
    public void setLangileID(String a)
    {
        LangileID = a;
    }//setLangileID

    //___LangileID___
    public void setLangileID()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("LangileID: ");
        setLangileID(balioa);
    }//setLangileID

    //___LangileIDBalioa___
    public String getLangileIDBalioa()
    {
        return LangileID;
    }//getLangileIDBalioa

    //___LangileID___
    public void getLangileID()
    {
        System.out.println("LangileID: \u001B[34m" + LangileID + "\u001B[0m");
    }//getLangileID

    //___Postua___
    public void setPostua(String a)
    {
        Postua = a;
        if (!Postua.equals("Monitorea"))
        {
            ArduraduaIzan = false;
        }//if
    }//setPostua

    //___Postua___
    public void setPostua()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Postua: ");
        setPostua(balioa);
    }//setPostua

    //___PostuaBalioa___
    public String getPostuaBalioa()
    {
        return Postua;
    }//getPostuaBalioa

    //___Postua___
    public void getPostua()
    {
        System.out.println("Postua: \u001B[34m" + Postua + "\u001B[0m");
    }//getPostua

    //___ArduraduaIzan___
    public void setArduraduaIzan(boolean a)
    {
        if (Postua.equals("Monitorea"))
        {
            ArduraduaIzan = a;
        }//if
        else
        {
            ArduraduaIzan = false;
        }//else
    }//setArduraduaIzan

    //___ArduraduaIzan___
    public void setArduraduaIzan()
    {
        boolean balioa = MetodoPraktikoak.BaiEz(MetodoPraktikoak.teklatua, "Arduraduna da?");
        setArduraduaIzan(balioa);
    }//setArduraduaIzan

    //___ArduraduaIzanBalioa___
    public boolean getArduraduaIzanBalioa()
    {
        return ArduraduaIzan;
    }//getArduraduaIzanBalioa

    //___ArduraduaIzan___
    public void getArduraduaIzan()
    {
        System.out.println("ArduraduaIzan: \u001B[34m" + ArduraduaIzan + "\u001B[0m");
    }//getArduraduaIzan

    //___ALL___
    public void getALL()
    {
        super.getALL();
        getLangileID();
        getPostua();
        getArduraduaIzan();
    }//getALL

}//Langile
