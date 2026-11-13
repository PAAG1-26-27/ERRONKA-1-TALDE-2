package com.mycompany.gaztelekua;
import java.time.LocalDate;
public class Udakoa extends Ekintza
{
    private String Mota = "Egunekoa";
    private String EkintzaMota = "Surf Hastapena";
    public Udakoa()
    {
        super();
    }//Udakoa

    public Udakoa(String iz, String hd, String bd, String kok, int pk, String berezia)
    {
        super(iz, hd, bd, kok, pk);
        setEkintzaMota(berezia);
    }//Udakoa

    //___EkintzaMota___
    public void setEkintzaMota(String a)
    {
        String mota = MetodoPraktikoak.normalizatu(a);
        if (Mota.equals("Gauekoa"))
        {
            EkintzaMota = "";
            return;
        }//if
        switch (mota)
        {
            case "1":
            case "surfhastapena":
            {
                EkintzaMota = "Surf Hastapena";
            }//case surfhastapena
            break;
            case "2":
            case "paddlesurf":
            case "surfpaddle":
            {
                EkintzaMota = "Paddle Surf";
            }//case paddlesurf
            break;

            case "3":
            case "mendiirteera":
            {
                EkintzaMota = "Mendi Irteera";
            }//case mendiirteera
            break;

            default:
            {
                System.out.println("Eguneko ekintza mota ez da zuzena.");
            }//default
        }//switch
    }//setEkintzaMota

    //___EkintzaMota___
    public void setEkintzaMota()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("EkintzaMota: ");
        setEkintzaMota(balioa);
    }//setEkintzaMota

    //___EkintzaMotaBalioa___
    public String getEkintzaMotaBalioa()
    {
        return EkintzaMota;
    }//getEkintzaMotaBalioa

    //___EkintzaMota___
    public void getEkintzaMota()
    {
        System.out.println("EkintzaMota: \u001B[34m" + EkintzaMota + "\u001B[0m");
    }//getEkintzaMota

    //___ALL___
    public void getALL()
    {
        super.getALL();
        getMota();
        if (Mota.equals("Egunekoa"))
        {
            getEkintzaMota();
        }//if
    }//getALL

    //___Mota___
    public void setMota(String a)
    {
        switch (MetodoPraktikoak.normalizatu(a))
        {
            case "1":
            case "egunekoa":
            case "eguneko":
            {
                Mota = "Egunekoa";
                if (EkintzaMota.isEmpty())
                {
                    EkintzaMota = "Surf Hastapena";
                }//if
            }//case egunekoa
            break;
            case "2":
            case "gauekoa":
            case "gaueko":
            {
                Mota = "Gauekoa";
                EkintzaMota = "";
            }//case gauekoa
            break;
            default:
            {
                System.out.println("Udako ekintza mota ez da zuzena.");
            }//default
        }//switch
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
        System.out.println("Udako ekintza: \u001B[34m" + Mota + "\u001B[0m");
    }//getMota
}//Udakoa
