package com.mycompany.gaztelekua;
import java.time.LocalDate;
/**
* @authors
*      Jon Ander Estevez Del Palacio
*      Nora Ortiz de Lejarazu Rascon
*      Huzaima Muhammad Bibi
*      Aitor Burunza Gil
*/
public class Tutorea extends Pertsona
{
    private String TutoreID;
    public Tutorea()
    {
        super();
        TutoreID = "";
    }//Tutorea
    //Pertsonaren datu komunak kopiatu
    public Tutorea(Pertsona p)
    {
        super(p);
        TutoreID = "";
    }//Tutorea

    //___TutoreID___
    public void setTutoreID(String balioa)
    {
        TutoreID = balioa;
    }//setTutoreID

    //___TutoreIDBalioa___
    public String getTutoreIDBalioa()
    {
        return TutoreID;
    }//getTutoreIDBalioa

    //___TutoreID___
    public void getTutoreID()
    {
        System.out.println("TutoreID: \u001B[34m" + TutoreID + "\u001B[0m");
    }//getTutoreID

    //___ALL___
    public void getALL()
    {
        super.getALL();
        getTutoreID();
    }//getALL

    public Tutorea(String nan, String izen, String abi, String her, String hel, String kp, String tlf, LocalDate jd, String id)
    {
        super(nan, izen, abi, her, hel, kp, tlf, jd);
        TutoreID = id;
    }//Tutorea

    //___TutoreID___
    public void setTutoreID()
    {
        String balioa = MetodoPraktikoak.HauIrakurri("TutoreID: ");
        setTutoreID(balioa);
    }//setTutoreID
}//Tutorea
