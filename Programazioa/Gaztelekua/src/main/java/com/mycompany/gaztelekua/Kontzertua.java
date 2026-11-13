package com.mycompany.gaztelekua;
import java.time.LocalDate;
public class Kontzertua extends Asteburukoa
{
    private String Taldea = "";
    public Kontzertua()
    {
        super();
        setMota("Kontzertua");
    }//Kontzertua

    public Kontzertua(String iz, String hd, String bd, String kok, int pk, String berezia)
    {
        super(iz, hd, bd, kok, pk);
        setMota("Kontzertua");
        Taldea = berezia;
    }//Kontzertua

    //___Taldea___
    public void setTaldea(String a)
    {
        Taldea = a;
    }//setTaldea

    //___Taldea___
    public void setTaldea()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Taldea: ");
        setTaldea(balioa);
    }//setTaldea

    //___TaldeaBalioa___
    public String getTaldeaBalioa()
    {
        return Taldea;
    }//getTaldeaBalioa

    //___Taldea___
    public void getTaldea()
    {
        System.out.println("Taldea: \u001B[34m" + Taldea + "\u001B[0m");
    }//getTaldea

    //___ALL___
    public void getALL()
    {
        super.getALL();
        getTaldea();
    }//getALL

    public Kontzertua(Ekintza e)
    {
        super(e, "Kontzertua");
        if (e instanceof Kontzertua)
        {
            Kontzertua aurrekoa = (Kontzertua) e;
            Taldea = aurrekoa.Taldea;
        }//if
    }//Kontzertua
}//Kontzertua
