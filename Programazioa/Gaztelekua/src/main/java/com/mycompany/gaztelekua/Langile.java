package com.mycompany.gaztelekua;
import java.time.LocalDate;
//Langilearen postua eta arduradun egoera gordetzeko klasea.
public class Langile extends Pertsona
{
    private String LangileID = "";
    private String Postua = "";
    private boolean ArduraduaIzan = false;
    //Eraikitzailea: objektuaren hasierako datuak prestatu.
    public Langile()
    {
        super();
    }//Langile

    //Eraikitzailea: jasotako datuak objektuan gorde.
    //Eraikitzailea: jasotako datuak gorde; komunak gurasoari pasatu.
    public Langile(String nan, String izen, String abi, String her, String hel, String kp, String tlf, LocalDate jd,
            String email, String langileID, String postua, boolean arduraduna)
    {
        super(nan, izen, abi, her, hel, kp, tlf, jd, email);
        LangileID = langileID;
        setPostua(postua);
        setArduraduaIzan(arduraduna);
    }//Langile

    //___LangileID___
    //LangileID datuaren balio berria gorde.
    public void setLangileID(String a)
    {
        LangileID = a;
    }//setLangileID

    //___LangileIDBalioa___
    //LangileID datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getLangileIDBalioa()
    {
        return LangileID;
    }//getLangileIDBalioa

    //___LangileID___
    //LangileID datua pantailan erakutsi.
    public void getLangileID()
    {
        System.out.println("LangileID: \u001B[34m" + LangileID + "\u001B[0m");
    }//getLangileID

    //___Postua___
    //Postua datuaren balio berria gorde.
    public void setPostua(String a)
    {
        Postua = a;
        if (!Postua.equals("Monitorea"))
        {
            ArduraduaIzan = false;
        }//if
    }//setPostua

    //___PostuaBalioa___
    //Postua datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getPostuaBalioa()
    {
        return Postua;
    }//getPostuaBalioa

    //___Postua___
    //Postua datua pantailan erakutsi.
    public void getPostua()
    {
        System.out.println("Postua: \u001B[34m" + Postua + "\u001B[0m");
    }//getPostua

    //___ArduraduaIzan___
    //ArduraduaIzan datuaren balio berria gorde.
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

    //___ArduraduaIzanBalioa___
    //ArduraduaIzan datuaren balioa bueltatu, pantailan erakutsi gabe.
    public boolean getArduraduaIzanBalioa()
    {
        return ArduraduaIzan;
    }//getArduraduaIzanBalioa

    //___ArduraduaIzan___
    //ArduraduaIzan datua pantailan erakutsi.
    public void getArduraduaIzan()
    {
        System.out.println("ArduraduaIzan: \u001B[34m" + ArduraduaIzan + "\u001B[0m");
    }//getArduraduaIzan

    //___ALL___
    //Datu guztiak erakutsi; klase hauek dituzten datuak ere gehitu.
    public void getALL()
    {
        super.getALL();
        getLangileID();
        getPostua();
        getArduraduaIzan();
    }//getALL

}//Langile
