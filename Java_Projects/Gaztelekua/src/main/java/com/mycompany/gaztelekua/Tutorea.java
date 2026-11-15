package com.mycompany.gaztelekua;
import java.time.LocalDate;
/**
* @authors
*      Jon Ander Estevez Del Palacio
*      Nora Ortiz de Lejarazu Rascon
*      Huzaima Muhammad Bibi
*      Aitor Burunza Gil
*/
//Tutorearen datuak gordetzeko klasea.
public class Tutorea extends Pertsona
{
    private String TutoreID;
    //Eraikitzailea: objektuaren hasierako datuak prestatu.
    public Tutorea()
    {
        super();
        TutoreID = "";
    }//Tutorea

    //Eraikitzailea: jasotako datuak objektuan gorde.
    //Eraikitzailea: jasotako datuak gorde; komunak gurasoari pasatu.
    public Tutorea(String nan, String izen, String abi, String her, String hel, String kp, String tlf, LocalDate jd,
            String email, String tutoreID)
    {
        super(nan, izen, abi, her, hel, kp, tlf, jd, email);
        TutoreID = tutoreID;
    }//Tutorea

    //___TutoreID___
    //TutoreID datuaren balio berria gorde.
    public void setTutoreID(String balioa)
    {
        TutoreID = balioa;
    }//setTutoreID

    //___TutoreIDBalioa___
    //TutoreID datuaren balioa bueltatu, pantailan erakutsi gabe.
    public String getTutoreIDBalioa()
    {
        return TutoreID;
    }//getTutoreIDBalioa

    //___TutoreID___
    //TutoreID datua pantailan erakutsi.
    public void getTutoreID()
    {
        System.out.println("TutoreID: \u001B[34m" + TutoreID + "\u001B[0m");
    }//getTutoreID

    //___ALL___
    //Datu guztiak erakutsi; klase hauek dituzten datuak ere gehitu.
    public void getALL()
    {
        super.getALL();
        getTutoreID();
    }//getALL

}//Tutorea
