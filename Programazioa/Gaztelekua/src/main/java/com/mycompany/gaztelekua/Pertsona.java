package com.mycompany.gaztelekua;
import java.time.LocalDate;
/**
* @authors
*      Jon Ander Estevez Del Palacio
*      Nora Ortiz de Lejarazu Rascon
*      Huzaima Muhammad Bibi
*      Aitor Burunza Gil
*/
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
    //Pertsonaren datu guztiak jaso
    public Pertsona(String NAN, String Izena, String Abizena, String Herrialdea, String Helbidea, String PostaKodea, String Telefonoa, LocalDate JaiotzaData, String Email)
    {
        this.NAN = NAN;
        this.Izena = Izena;
        this.Abizena = Abizena;
        this.Herrialdea = Herrialdea;
        this.Helbidea = Helbidea;
        this.PostaKodea = PostaKodea;
        this.Telefonoa = Telefonoa;
        this.JaiotzaData = JaiotzaData;
        this.Email = Email;
    }//Pertsona
    //Hasierako balioak prestatu
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
    //Mota aldatzean datu komunak mantendu
    public Pertsona(Pertsona p)
    {
        this(p.NAN, p.Izena, p.Abizena, p.Herrialdea, p.Helbidea, p.PostaKodea, p.Telefonoa, p.JaiotzaData, p.Email);
    }//Pertsona

    //___NAN___
    public void setNAN(String balioa)
    {
        NAN = balioa;
    }//setNAN

    //___NANBalioa___
    public String getNANBalioa()
    {
        return NAN;
    }//getNANBalioa

    //___NAN___
    public void getNAN()
    {
        System.out.println("NAN: \u001B[34m" + NAN + "\u001B[0m");
    }//getNAN

    //___Izena___
    public void setIzena(String balioa)
    {
        Izena = balioa;
    }//setIzena

    //___IzenaBalioa___
    public String getIzenaBalioa()
    {
        return Izena;
    }//getIzenaBalioa

    //___Izena___
    public void getIzena()
    {
        System.out.println("Izena: \u001B[34m" + Izena + "\u001B[0m");
    }//getIzena

    //___Abizena___
    public void setAbizena(String balioa)
    {
        Abizena = balioa;
    }//setAbizena

    //___AbizenaBalioa___
    public String getAbizenaBalioa()
    {
        return Abizena;
    }//getAbizenaBalioa

    //___Abizena___
    public void getAbizena()
    {
        System.out.println("Abizena: \u001B[34m" + Abizena + "\u001B[0m");
    }//getAbizena

    //___Herrialdea___
    public void setHerrialdea(String balioa)
    {
        Herrialdea = balioa;
    }//setHerrialdea

    //___HerrialdeaBalioa___
    public String getHerrialdeaBalioa()
    {
        return Herrialdea;
    }//getHerrialdeaBalioa

    //___Herrialdea___
    public void getHerrialdea()
    {
        System.out.println("Herrialdea: \u001B[34m" + Herrialdea + "\u001B[0m");
    }//getHerrialdea

    //___Helbidea___
    public void setHelbidea(String balioa)
    {
        Helbidea = balioa;
    }//setHelbidea

    //___HelbideaBalioa___
    public String getHelbideaBalioa()
    {
        return Helbidea;
    }//getHelbideaBalioa

    //___Helbidea___
    public void getHelbidea()
    {
        System.out.println("Helbidea: \u001B[34m" + Helbidea + "\u001B[0m");
    }//getHelbidea

    //___PostaKodea___
    public void setPostaKodea(String balioa)
    {
        PostaKodea = balioa;
    }//setPostaKodea

    //___PostaKodeaBalioa___
    public String getPostaKodeaBalioa()
    {
        return PostaKodea;
    }//getPostaKodeaBalioa

    //___PostaKodea___
    public void getPostaKodea()
    {
        System.out.println("PostaKodea: \u001B[34m" + PostaKodea + "\u001B[0m");
    }//getPostaKodea

    //___Telefonoa___
    public void setTelefonoa(String balioa)
    {
        Telefonoa = balioa;
    }//setTelefonoa

    //___TelefonoaBalioa___
    public String getTelefonoaBalioa()
    {
        return Telefonoa;
    }//getTelefonoaBalioa

    //___Telefonoa___
    public void getTelefonoa()
    {
        System.out.println("Telefonoa: \u001B[34m" + Telefonoa + "\u001B[0m");
    }//getTelefonoa

    //___JaiotzaData___
    public void setJaiotzaData(LocalDate balioa)
    {
        JaiotzaData = balioa;
    }//setJaiotzaData

    //___JaiotzaDataBalioa___
    public LocalDate getJaiotzaDataBalioa()
    {
        return JaiotzaData;
    }//getJaiotzaDataBalioa

    //___JaiotzaData___
    public void getJaiotzaData()
    {
        System.out.println("JaiotzaData: \u001B[34m" + (JaiotzaData == null ? "" : JaiotzaData) + "\u001B[0m");
    }//getJaiotzaData
    //Datuak erakutsi, aldaketarik egin gabe
    //___ALL___
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

    public Pertsona(String nan, String izen, String abi, String her, String hel, String kp, String tlf, LocalDate jd)
    {
        this(nan, izen, abi, her, hel, kp, tlf, jd, "");
    }//Pertsona

    //___Email___
    public void setEmail(String a)
    {
        Email = a;
    }//setEmail

    //___EmailBalioa___
    public String getEmailBalioa()
    {
        return Email;
    }//getEmailBalioa

    //___Email___
    public void getEmail()
    {
        System.out.println("Email: \u001B[34m" + Email + "\u001B[0m");
    }//getEmail

    //___KodePostala___
    public void setKodePostala(String a)
    {
        setPostaKodea(a);
    }//setKodePostala

    //___KodePostala___
    public void getKodePostala()
    {
        getPostaKodea();
    }//getKodePostala

    //___NAN___
    public void setNAN()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("NAN: ");
        setNAN(balioa);
    }//setNAN

    //___Izena___
    public void setIzena()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Izena: ");
        setIzena(balioa);
    }//setIzena

    //___Abizena___
    public void setAbizena()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Abizena: ");
        setAbizena(balioa);
    }//setAbizena

    //___Herrialdea___
    public void setHerrialdea()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Herrialdea: ");
        setHerrialdea(balioa);
    }//setHerrialdea

    //___Helbidea___
    public void setHelbidea()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Helbidea: ");
        setHelbidea(balioa);
    }//setHelbidea

    //___PostaKodea___
    public void setPostaKodea()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("PostaKodea: ");
        setPostaKodea(balioa);
    }//setPostaKodea

    //___Telefonoa___
    public void setTelefonoa()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Telefonoa: ");
        setTelefonoa(balioa);
    }//setTelefonoa

    //___Email___
    public void setEmail()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("Email: ");
        setEmail(balioa);
    }//setEmail

    //___KodePostala___
    public void setKodePostala()
    {
        setPostaKodea();
    }//setKodePostala

    //___JaiotzaData___
    public void setJaiotzaData()
    {
        setJaiotzaData(LocalDate.parse(MetodoPraktikoak.HauIrakurri("Jaiotza data(uuuu-MM-dd): ")));
    }//setJaiotzaData
    // Diagramako izena; getALL mantendu da aurreko kodearekiko bateragarri.
    //___All___
    public void getAll()
    {
        getALL();
    }//getAll
}//Pertsona
