package com.mycompany.gaztelekua;
import java.time.LocalDate;
/**
* @authors
*      Jon Ander Estevez Del Palacio
*      Nora Ortiz de Lejarazu Rascon
*      Huzaima Muhammad Bibi
*      Aitor Burunza Gil
*/
//Pertsona guztien datu komunak gordetzeko klasea.
public class Pertsona
{
    private String NAN;
    private String Izena;
    private String Abizena;
    private String Herrialdea;
    private String Helbidea;
    private String PostaKodea;
    private String Telefonoa;
    private LocalDate JaiotzaData;
    private String Email;
    //Hasierako balioak prestatu
    //Eraikitzailea: objektuaren hasierako datuak prestatu.
    public Pertsona()
    {
        NAN = "00000000A";
        Izena = "Zuzentzeko dago";
        Abizena = "Zuzentzeko dago";
        Herrialdea = "Euskal Herria";
        Helbidea = "Eibar, Herriko plaza 1, 1ºA";
        PostaKodea = "20600";
        Telefonoa = "600000000";
        JaiotzaData = LocalDate.of(LocalDate.now().getYear() - 12, 1, 1);
        Email = "ErabiltzaileGabe@ikasleak.uni.eus";
    }//Pertsona

    //Eraikitzailea: jasotako datuak objektuan gorde.
    //Eraikitzailea: jasotako datuak gorde; komunak gurasoari pasatu.
    public Pertsona(String nan, String izen, String abi, String her, String hel, String kp, String tlf,
            LocalDate jd, String email)
    {
        NAN = nan;
        Izena = izen;
        Abizena = abi;
        Herrialdea = her;
        Helbidea = hel;
        PostaKodea = kp;
        Telefonoa = tlf;
        JaiotzaData = jd;
        Email = email;
    }//Pertsona

    //___NAN___
    //NAN datuaren balio berria gorde.
    public void setNAN(String balioa)
    {
        NAN = balioa;
    }//setNAN

    //___NANBalioa___
    //NAN datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getNANBalioa()
    {
        return NAN;
    }//getNANBalioa

    //___NAN___
    //NAN datua pantailan erakutsi.
    public void getNAN()
    {
        System.out.println("NAN: \u001B[34m" + NAN + "\u001B[0m");
    }//getNAN

    //___Izena___
    //Izena datuaren balio berria gorde.
    public void setIzena(String balioa)
    {
        Izena = balioa;
    }//setIzena

    //___IzenaBalioa___
    //Izena datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getIzenaBalioa()
    {
        return Izena;
    }//getIzenaBalioa

    //___Izena___
    //Izena datua pantailan erakutsi.
    public void getIzena()
    {
        System.out.println("Izena: \u001B[34m" + Izena + "\u001B[0m");
    }//getIzena

    //___Abizena___
    //Abizena datuaren balio berria gorde.
    public void setAbizena(String balioa)
    {
        Abizena = balioa;
    }//setAbizena

    //___AbizenaBalioa___
    //Abizena datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getAbizenaBalioa()
    {
        return Abizena;
    }//getAbizenaBalioa

    //___Abizena___
    //Abizena datua pantailan erakutsi.
    public void getAbizena()
    {
        System.out.println("Abizena: \u001B[34m" + Abizena + "\u001B[0m");
    }//getAbizena

    //___Herrialdea___
    //Herrialdea datuaren balio berria gorde.
    public void setHerrialdea(String balioa)
    {
        Herrialdea = balioa;
    }//setHerrialdea

    //___HerrialdeaBalioa___
    //Herrialdea datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getHerrialdeaBalioa()
    {
        return Herrialdea;
    }//getHerrialdeaBalioa

    //___Herrialdea___
    //Herrialdea datua pantailan erakutsi.
    public void getHerrialdea()
    {
        System.out.println("Herrialdea: \u001B[34m" + Herrialdea + "\u001B[0m");
    }//getHerrialdea

    //___Helbidea___
    //Helbidea datuaren balio berria gorde.
    public void setHelbidea(String balioa)
    {
        Helbidea = balioa;
    }//setHelbidea

    //___HelbideaBalioa___
    //Helbidea datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getHelbideaBalioa()
    {
        return Helbidea;
    }//getHelbideaBalioa

    //___Helbidea___
    //Helbidea datua pantailan erakutsi.
    public void getHelbidea()
    {
        System.out.println("Helbidea: \u001B[34m" + Helbidea + "\u001B[0m");
    }//getHelbidea

    //___PostaKodea___
    //PostaKodea datuaren balio berria gorde.
    public void setPostaKodea(String balioa)
    {
        PostaKodea = balioa;
    }//setPostaKodea

    //___PostaKodeaBalioa___
    //PostaKodea datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getPostaKodeaBalioa()
    {
        return PostaKodea;
    }//getPostaKodeaBalioa

    //___PostaKodea___
    //PostaKodea datua pantailan erakutsi.
    public void getPostaKodea()
    {
        System.out.println("PostaKodea: \u001B[34m" + PostaKodea + "\u001B[0m");
    }//getPostaKodea

    //___Telefonoa___
    //Telefonoa datuaren balio berria gorde.
    public void setTelefonoa(String balioa)
    {
        Telefonoa = balioa;
    }//setTelefonoa

    //___TelefonoaBalioa___
    //Telefonoa datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getTelefonoaBalioa()
    {
        return Telefonoa;
    }//getTelefonoaBalioa

    //___Telefonoa___
    //Telefonoa datua pantailan erakutsi.
    public void getTelefonoa()
    {
        System.out.println("Telefonoa: \u001B[34m" + Telefonoa + "\u001B[0m");
    }//getTelefonoa

    //___JaiotzaData___
    //JaiotzaData datuaren balio berria gorde.
    public void setJaiotzaData(LocalDate balioa)
    {
        JaiotzaData = balioa;
    }//setJaiotzaData

    //___JaiotzaDataBalioa___
    //JaiotzaData datuaren balioa bueltatu, pantailan erakutsi gabe.
    public LocalDate getJaiotzaDataBalioa()
    {
        return JaiotzaData;
    }//getJaiotzaDataBalioa

    //___JaiotzaData___
    //JaiotzaData datua pantailan erakutsi.
    public void getJaiotzaData()
    {
        System.out.println("JaiotzaData: \u001B[34m" + (JaiotzaData == null ? "" : JaiotzaData) + "\u001B[0m");
    }//getJaiotzaData
    //Datuak erakutsi, aldaketarik egin gabe
    //___ALL___
    //Objektuaren datu guztiak pantailan erakutsi.
    public void getALL()
    {
        getNAN();
        getIzena();
        getAbizena();
        getHerrialdea();
        getHelbidea();
        getPostaKodea();
        getTelefonoa();
        getJaiotzaData();
        getEmail();
    }//getALL

    //___Email___
    //Email datuaren balio berria gorde.
    public void setEmail(String a)
    {
        Email = a;
    }//setEmail

    //___EmailBalioa___
    //Email datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getEmailBalioa()
    {
        return Email;
    }//getEmailBalioa

    //___Email___
    //Email datua pantailan erakutsi.
    public void getEmail()
    {
        System.out.println("Email: \u001B[34m" + Email + "\u001B[0m");
    }//getEmail

}//Pertsona
