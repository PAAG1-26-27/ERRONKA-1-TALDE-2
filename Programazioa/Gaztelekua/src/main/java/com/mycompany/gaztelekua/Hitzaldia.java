package com.mycompany.gaztelekua;
import java.time.LocalDate;
public class Hitzaldia extends Asteburukoa
{
    private String Hizlaria = "";
    public Hitzaldia()
    {
        super();
        setMota("Hitzaldia");
    }//Hitzaldia

    public Hitzaldia(String iz, String hd, String bd, String kok, int pk, String berezia)
    {
        super(iz, hd, bd, kok, pk);
        setMota("Hitzaldia");
        Hizlaria = berezia;
    }//Hitzaldia

    //___Hizlaria___
    public void setHizlaria(String a)
    {
        Hizlaria = a;
    }//setHizlaria

    //___Hizlaria___
    public void setHizlaria()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Hizlaria: ");
        setHizlaria(balioa);
    }//setHizlaria

    //___HizlariaBalioa___
    public String getHizlariaBalioa()
    {
        return Hizlaria;
    }//getHizlariaBalioa

    //___Hizlaria___
    public void getHizlaria()
    {
        System.out.println("Hizlaria: \u001B[34m" + Hizlaria + "\u001B[0m");
    }//getHizlaria

    //___ALL___
    public void getALL()
    {
        super.getALL();
        getHizlaria();
    }//getALL

    public Hitzaldia(Ekintza e)
    {
        super(e, "Hitzaldia");
        if (e instanceof Hitzaldia)
        {
            Hitzaldia aurrekoa = (Hitzaldia) e;
            Hizlaria = aurrekoa.Hizlaria;
        }//if
    }//Hitzaldia
}//Hitzaldia
