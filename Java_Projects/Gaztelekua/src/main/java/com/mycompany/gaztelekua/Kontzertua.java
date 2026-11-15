package com.mycompany.gaztelekua;
import java.time.LocalDate;
import java.time.LocalTime;
//Kontzertuaren taldea eta ekintzaren datu komunak gordetzeko klasea.
public class Kontzertua extends Ekintza
{
    private String Taldea = "";
    //Eraikitzailea: objektuaren hasierako datuak prestatu.
    public Kontzertua()
    {
        super();
    }//Kontzertua

    //Eraikitzailea: jasotako datuak objektuan gorde.
    //Eraikitzailea: jasotako datuak gorde; komunak gurasoari pasatu.
    public Kontzertua(String id, String izen, LocalDate hd, LocalDate bd, LocalTime ho, LocalTime bo,
            double prezioa, String deskribapena, String kokapena, int plazaKop, String taldea)
    {
        super(id, izen, hd, bd, ho, bo, prezioa, deskribapena, kokapena, plazaKop);
        Taldea = taldea;
    }//Kontzertua

    //___Taldea___
    //Taldea datuaren balio berria gorde.
    public void setTaldea(String a)
    {
        Taldea = a;
    }//setTaldea

    //___TaldeaBalioa___
    //Taldea datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getTaldeaBalioa()
    {
        return Taldea;
    }//getTaldeaBalioa

    //___Taldea___
    //Taldea datua pantailan erakutsi.
    public void getTaldea()
    {
        System.out.println("Taldea: \u001B[34m" + Taldea + "\u001B[0m");
    }//getTaldea

    //___ALL___
    @Override
    //Datu guztiak erakutsi; klase hauek dituzten datuak ere gehitu.
    public void getALL()
    {
        super.getALL();
        getTaldea();
    }//getALL

}//Kontzertua
