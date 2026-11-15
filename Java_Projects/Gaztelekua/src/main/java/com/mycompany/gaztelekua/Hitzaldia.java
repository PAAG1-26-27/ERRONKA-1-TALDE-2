package com.mycompany.gaztelekua;
import java.time.LocalDate;
import java.time.LocalTime;
//Hitzaldiaren hizlaria eta ekintzaren datu komunak gordetzeko klasea.
public class Hitzaldia extends Ekintza
{
    private String Hizlaria = "";
    //Eraikitzailea: objektuaren hasierako datuak prestatu.
    public Hitzaldia()
    {
        super();
    }//Hitzaldia

    //Eraikitzailea: jasotako datuak objektuan gorde.
    //Eraikitzailea: jasotako datuak gorde; komunak gurasoari pasatu.
    public Hitzaldia(String id, String izen, LocalDate hd, LocalDate bd, LocalTime ho, LocalTime bo, double prezioa,
            String deskribapena, String kokapena, int plazaKop, String hizlaria)
    {
        super(id, izen, hd, bd, ho, bo, prezioa, deskribapena, kokapena, plazaKop);
        Hizlaria = hizlaria;
    }//Hitzaldia

    //___Hizlaria___
    //Hizlaria datuaren balio berria gorde.
    public void setHizlaria(String a)
    {
        Hizlaria = a;
    }//setHizlaria

    //___HizlariaBalioa___
    //Hizlaria datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getHizlariaBalioa()
    {
        return Hizlaria;
    }//getHizlariaBalioa

    //___Hizlaria___
    //Hizlaria datua pantailan erakutsi.
    public void getHizlaria()
    {
        System.out.println("Hizlaria: \u001B[34m" + Hizlaria + "\u001B[0m");
    }//getHizlaria

    //___ALL___
    @Override
    //Datu guztiak erakutsi; klase hauek dituzten datuak ere gehitu.
    public void getALL()
    {
        super.getALL();
        getHizlaria();
    }//getALL

}//Hitzaldia
