package com.mycompany.gaztelekua;
import java.time.LocalDate;
import java.time.LocalTime;
//Udako ekintzaren mota eta eguneko jarduera gordetzeko klasea.
public class Udakoa extends Ekintza
{
    private String Mota = "Egunekoa";
    private String EkintzaMota = "Surf Hastapena";
    //Eraikitzailea: objektuaren hasierako datuak prestatu.
    public Udakoa()
    {
        super();
    }//Udakoa

    //Eraikitzailea: jasotako datuak objektuan gorde.
    //Eraikitzailea: jasotako datuak gorde; komunak gurasoari pasatu.
    public Udakoa(String id, String izen, LocalDate hd, LocalDate bd, LocalTime ho, LocalTime bo, double prezioa,
            String deskribapena, String kokapena, int plazaKop, String mota, String ekintzaMota)
    {
        super(id, izen, hd, bd, ho, bo, prezioa, deskribapena, kokapena, plazaKop);
        setMota(mota);
        setEkintzaMota(ekintzaMota);
    }//Udakoa

    //___EkintzaMota___
    //EkintzaMota datuaren balio berria gorde.
    public void setEkintzaMota(String a)
    {
        String mota = MetodoPraktikoak.sarreraKonpondu(a);
        if (Mota.equals("Gauekoa"))
        {
            EkintzaMota = "";
            return;
        }//if
        switch (mota)
        {
            case "1", "surfhastapena":
            {
                EkintzaMota = "Surf Hastapena";
            }//case surfhastapena
            break;

            case "2", "paddlesurf", "surfpaddle":
            {
                EkintzaMota = "Paddle Surf";
            }//case paddlesurf
            break;

            case "3", "mendiirteera":
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

    //___EkintzaMotaBalioa___
    //EkintzaMota datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getEkintzaMotaBalioa()
    {
        return EkintzaMota;
    }//getEkintzaMotaBalioa

    //___EkintzaMota___
    //EkintzaMota datua pantailan erakutsi.
    public void getEkintzaMota()
    {
        System.out.println("EkintzaMota: \u001B[34m" + EkintzaMota + "\u001B[0m");
    }//getEkintzaMota

    //___ALL___
    //Datu guztiak erakutsi; klase hauek dituzten datuak ere gehitu.
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
    //Mota datuaren balio berria gorde.
    public void setMota(String a)
    {
        switch (MetodoPraktikoak.sarreraKonpondu(a))
        {
            case "1", "egunekoa", "eguneko":
            {
                Mota = "Egunekoa";
                if (EkintzaMota.isEmpty())
                {
                    EkintzaMota = "Surf Hastapena";
                }//if
            }//case egunekoa
            break;

            case "2", "gauekoa", "gaueko":
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

    //___MotaBalioa___
    //Mota datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getMotaBalioa()
    {
        return Mota;
    }//getMotaBalioa

    //___Mota___
    //Mota datua pantailan erakutsi.
    public void getMota()
    {
        System.out.println("Udako ekintza: \u001B[34m" + Mota + "\u001B[0m");
    }//getMota
}//Udakoa
