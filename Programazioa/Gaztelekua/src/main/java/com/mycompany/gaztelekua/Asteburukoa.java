package com.mycompany.gaztelekua;
// Asteburuko ekintzen datu komunak Ekintza klasetik jasotzen dira.
public class Asteburukoa extends Ekintza
{
    private String Mota = "Jolasa";
    public Asteburukoa()
    {
        super();
    }//Asteburukoa

    public Asteburukoa(String iz, String hd, int pk)
    {
        super(iz, hd, pk);
    }//Asteburukoa

    public Asteburukoa(String iz, String hd, String bd, int pk)
    {
        super(iz, hd, bd, pk);
    }//Asteburukoa

    public Asteburukoa(String iz, String hd, String bd, String kok, int pk)
    {
        super(iz, hd, bd, kok, pk);
    }//Asteburukoa

    public Asteburukoa(Ekintza e, String mota)
    {
        super(e);
        setMota(mota);
    }//Asteburukoa

    //___Mota___
    public void setMota(String a)
    {
        Mota = a;
    }//setMota

    //___Mota___
    public void setMota()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Mota: ");
        setMota(balioa);
    }//setMota

    //___MotaBalioa___
    public String getMotaBalioa()
    {
        return Mota;
    }//getMotaBalioa

    //___Mota___
    public void getMota()
    {
        System.out.println("Asteburuko ekintza: \u001B[34m" + Mota + "\u001B[0m");
    }//getMota

    //___ALL___

    public void getALL()
    {
        super.getALL();
        getMota();
    }//getALL
}//Asteburukoa
