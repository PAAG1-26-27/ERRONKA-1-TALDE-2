package com.mycompany.jokuak;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Nora Ortiz de Lejarazu
 */
public class Harri_orri_ar {//Harri-orri-arr jokoa
    private final Scanner sc;

    public Harri_orri_ar(Scanner sc) {
        this.sc = sc;
    }

    int partida_g_j = 0,partida_g_o = 0, erronda_p_o = 0, erronda_p_j = 0, erronda_k=0; //Aldagai globalak.
    public int Erronda_kopurua() // Metodo honek jokatu nahi diren erronda kopurua eskatzen du.
    {
        boolean arazoa;//Aldagaia.

        do  // Zenbaki egokia eta bakoitia sartu arte errepikatzen da.
        {
            try // Erabiltzaileari erronda kopurua eskatzen zaio.
            {
                System.out.print("\nRonda kopurua aukeratu: ");
                erronda_k = sc.nextInt();
                arazoa = false;
            }//try
            catch(Exception error) // Zenbaki bat sartzen ez bada, errorea erakusten da.
            {
                System.out.println("\nZenbakia bat sartu behar da!");
                sc.nextLine();//irakurri nextline eskanerra garbitzen du.
                arazoa = true;
            }//catch
            if(!arazoa) // Errorerik ez badago, zenbakia bakoitia den egiaztatzen da.
            {
                if(erronda_k%2==0)
                {
                    System.out.println("\nZenbakia bakoitia izan behar da!");
                    arazoa = true;
                }//if 2
            }//if 1
        }//do
        while (arazoa);

        return erronda_k;// Aukeratutako erronda kopurua itzultzen da.
    }//Metodoa ixten du.

    public int Harria(int ordenagailua)//ordenagailua= ausazko aukera bidaltzen du.
    // Jokalariak harria aukeratzen duenean irabazlea kalkulatzen da.
    {
        int jokalaria;//Aldagaia.
        jokalaria= 1;

        if (jokalaria==1 && ordenagailua==2) // Ordenagailuak papera aukeratzen badu, jokalariak galtzen du.
        {
            System.out.println("+Erronda galdu duzu!\n");
            erronda_p_o ++;// Ordenagailuari errondaren puntua gehitzen zaio.
            return 1;
        }
        else // Bestelakoan jokalariak irabazten du.
        {
            System.out.println("+Erronda irabazi duzu!\n");
            erronda_p_j ++;// Jokalariari errondaren puntua gehitzen zaio.
            return 2;
        }
    }//Metodoa ixten du

    public int Orria(int ordenagailua)//ordenagailua= ausazko aukera bidaltzen du.
    // Jokalariak orria aukeratzen duenean irabazlea kalkulatzen da.
    {
        int jokalaria;//Aldagaia.
        jokalaria= 2;

        if (jokalaria==2 && ordenagailua==3)// Ordenagailuak guraizeak aukeratzen baditu, jokalariak galtzen du.
        {
            System.out.println("+Erronda galdu duzu!\n");
            erronda_p_o ++;// Ordenagailuari errondaren puntua gehitzen zaio.
            return 1;
        }//if
        else
        {
            System.out.println("+Erronda irabazi duzu!\n");
            erronda_p_j ++;// Jokalariari errondaren puntua gehitzen zaio.
            return 2;
        }//else
    }//Metodoa ixten du

    public int Guraiza(int ordenagailua)//ordenagailua= ausazko aukera bidaltzen du.
    // Jokalariak guraiza aukeratzen duenean irabazlea kalkulatzen da.
    {
        int jokalaria; //Aldagaia.
        jokalaria= 3;

        if (jokalaria==3 && ordenagailua==1)
        {
            System.out.println("+Erronda galdu duzu!\n");
            erronda_p_o ++;  //Ordenagailuari errondaren puntua gehitzen zaio.
            return 1;
        }//if
        else
        {
            System.out.println("+Erronda irabazi duzu!\n");
            erronda_p_j ++;// Jokalariari errondaren puntua gehitzen zaio.
            return 2;
        }//else
    }//Metodoa ixten du

    public void Partida_jolastu(int er_k) //er_k = Erronda kopurua bidaltzeko.
    //Partida jolasteko metodoa.
    {
        int jokalaria, ordenagailua;//Aldagaiak.

        do //Partida hasteko aukeraketa.
        {
            System.out.println("\n---AUKERAK--- \n ");
            System.out.println("1.Harria  ");
            System.out.println("2.Horria  ");
            System.out.println("3.Guraizak ");
            System.out.println("\n0.Partidatik irten ");
            System.out.print("\nZure aukera: ");
            jokalaria = sc.nextInt(); //Jokalariaren aukera irakurtzeko.

            ordenagailua = (int)(Math.random() * 3) + 1; //Ordenagailuaren ausazko zenbakia.
            System.out.println("Ordengailuaren aukera: "+ ordenagailua + "\n");

            if (ordenagailua == jokalaria) //Berdinketa badago ez dira errondak gehitzen.
            {
                System.out.println("+Berdinketa egon da!\n");
            }//if
            else
            {
                switch(jokalaria)//aukerak egiteko egitura
                {
                    case 1: //Harriaren emaitza kalkulatzen da.
                        Harria(ordenagailua);
                        break;

                    case 2: //Orriaren emaitza kalkulatzen da.
                        Orria (ordenagailua);
                        break;

                    case 3: //Guraizeen emaitza kalkulatzen da.
                        Guraiza (ordenagailua);
                        break;

                    case 0:
                        Irteera_menua();//Partidatik irten, irteera menura.
                        break;

                    default: //Aukera okerra sartzen bada mezua erakusten du.
                        System.out.println("\nErantzuna zenbaki bat izan behar da!");
                        break;
                }//switch
            }//else
        }//do
        //Inork beharrezko puntuak lortu ez dituen bitartean errepikatzen dira errondak.
        while (erronda_p_j < Math.round((float)er_k/2) && erronda_p_o < Math.round((float)er_k/2));

        if (erronda_p_j>=Math.round((float)er_k/2)) //Jokalariaren puntuak konparatzen dira.
        {
            System.out.println("---PARTIDA IRABAZI DUZU!---\n");
            partida_g_j ++; //Jokalariaren partidaren puntuazioari gehitzen zaio.

        }//if
        else if (erronda_p_o>=Math.round((float)er_k/2))//Ordenagailuaren puntuak konparatzen dira.
        {
            System.out.println("---PARTIDA GALDU DUZU!---\n");
            partida_g_o ++;//Ordenagailuaren partidaren puntuazioari gehitzen zaio.
        }

        Irteera_menua();// Partida amaitzean irteerako menua erakusten da.
    }//Metodoa ixten du.

    public void Irteera_menua()
    //Jolasatik irtetzeko metodoa.
    {
        int aukera;//Aldagaia.

        do //Aukerak egin arte dena errepikatzen da.
        {   //Jokalariaren eta ordenagailuaren puntuazio orokorra erakusten da.
            System.out.println("\n---PARTIDEN PUNTUAZIO---\n");
            System.out.println("Jokalaria: " + partida_g_j);
            System.out.println("Ordenagailua: " + partida_g_o);

            // Berriro jolastu nahi duen galdetzen zaio erabiltzaileari.
            System.out.println("\nBerriro jolastu nahi duzu?\n");
            System.out.println("1.Bai ");
            System.out.println("2.Ez ");
            System.out.print("\nIdatzi erantzuna: ");
            aukera = sc.nextInt();

            // Errondetako puntuak eta erronda kopurua zerora itzultzen dira.
            // Partidetako puntuazio orokorra mantentzen da.
            erronda_p_j= 0;
            erronda_p_o= 0;
            erronda_k= 0;

            //Aukeraren arabera ekintza desberdin bat egiten da.
            switch(aukera)//aukerak egiteko egitura
            {
                case 1:// Erronda kopurua berriro eskatzen da eta partida berria hasten da.
                    erronda_k= Erronda_kopurua();
                    Partida_jolastu(erronda_k);
                    break;

                case 2:
                    // Menu nagusira bueltatu
                    break;

                default: //Aukera okerra sartuz gero, errorea erakusten da.
                    System.out.println("Erantzuna zenbaki bat izan behar da!");
                    break;
            }//switch
        }//do
        while(aukera!=2);//Sartzen den zenbakia 2 bada dena amaitzen da.
    }//Metodoa ixten du.

    public void jolastu()
    //Metodo nagusia(Main),jokoaren hasiera eta menua.
    {
        int aukera; //Aldagaiak

        System.out.println("\n\u001B[1mHarri-orri-Ar jokua ireki duzu.\u001B[0m\n");//Jokoaren tituloa
        System.out.println("---JOKUAREN ARAUAK---\n");//Jokoaren arauak.
        System.out.println("+ Jokalariak harria,papera edo guraizeak aukeratu behar ditu.");
        System.out.println("+ Ordenagailuak ausaz aukeratuko du.");
        System.out.println("+ Harriak guraizeak irabazten du.");
        System.out.println("+ Guraizeak papera irabazten dute.");
        System.out.println("+ Paperak harria irabazten du.");
        System.out.println("+ Biek berdina aukeratzen badute ez da punturik gehituko.");
        System.out.println("+ Nahi dituzun ronda aukeratu, zenbaki bakoitia izan behar da. ");
        System.out.println("+ Jokoa amaitzerakoan berriro jolasteko aukera izango duzu");

        do //Menu nagusia errepikatzeko buklea.
        {
            //Erabiltzaileari jokoa hasi nahi duen galdetzen zaio.
            System.out.println("\nHasi nahi duzu?");
            System.out.println("1.Bai ");
            System.out.println("2.Ez ");
            System.out.print("\nIdatzi erantzuna: ");
            aukera = sc.nextInt();
            sc.nextLine();

            //Aukeratutako zenbakiaren arabera ekintza bat egiten da.
            switch(aukera)//Aukerak egiteko egitura
            {
                case 1:
                    //Erronda kopurua eskatzen da eta jokoa hasten da.
                    erronda_k = Erronda_kopurua();
                    Partida_jolastu(erronda_k);
                    return;

                case 2:
                    // Menu nagusira bueltatu
                    break;

                default: // Aukera okerra sartzen bada, mezua erakusten da.
                    System.out.println("Erantzuna zenbaki bat izan behar da!");
                    break;
            }//switch
        }//do
        while (aukera!=2);//sartzen den zenbakia 2 bada dena amaitzen da.
    }//main

}//class