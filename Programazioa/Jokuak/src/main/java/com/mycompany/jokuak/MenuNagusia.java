package com.mycompany.jokuak;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @authors
 *      Jon Ander Estevez Del Palacio
 *      Nora Ortiz de Lejarazu Rascon
 *      Huzaima Muhammad Bibi
 *      Aitor Burunza Gil
 */
public class MenuNagusia
{
    Scanner sc = new Scanner(System.in);

    public String HauIrakurri(Scanner sc, String mezua)
    {
        System.out.print(mezua);
        return sc.nextLine().trim();
    }//HauIrakurri

    public void pantallaGarbitu()
    {
        //Pantaila garbitzen du
        for (int i = 0; i < 30; i++)
        {
            System.out.println();
        }//for
    }//pantallaGarbitu

    public void menuNagusia(Scanner sc)
    {
        this.sc = sc;
        //Aldagaiak sortu
        String menuNagusi;

        //Irten aukeratu arte menua errepikatzeko
        do
        {
            //Menua lauki batean erakutsi.
            System.out.println();
            System.out.println("┌────────────────────────────┐");
            System.out.println("│        \u001B[1mMENU NAGUSIA\u001B[0m        │");
            System.out.println("├────────────────────────────┤");
            System.out.println("│  1 - \u001B[94mZenbakia asmatu\u001B[0m       │");
            System.out.println("│  2 - \u001B[94mHiru Lerroan\u001B[0m          │");
            System.out.println("│  3 - \u001B[94mHarri Orri Ar\u001B[0m         │");
            System.out.println("│  4 - \u001B[94mOntziak hondoratu\u001B[0m     │");
            System.out.println("├────────────────────────────┤");
            System.out.println("│  0 - \u001B[91mPrograma itxi\u001B[0m         │");
            System.out.println("└────────────────────────────┘");
            System.out.println();

            //Aukeratutako jokoaren izena irakurri
            menuNagusi = HauIrakurri(sc, "Zein jokotan jolastu nahi duzu?\n\u001B[90m(Idatzi jokoaren zenbakia edo izena)\u001B[0m ");


            //Testua garbitzen da
            menuNagusi = menuNagusi.toLowerCase();
            menuNagusi = menuNagusi.replace(" ", "");


            //Aukeratutako jokoaren atala erakutsi
            switch (menuNagusi)
            {
                case "zenbakiaasmatu", "1":
                {
                    // Pantalla garbitzen dugu jokoa hasi baino lehenago.
                    pantallaGarbitu();

                    // Zenbakia asmatu jokoa abiarazi.
                    ZenbakiaAsmatu.zenbakiaAsmatuJokoa(sc);

                }break;//case zenbakia asmatu
                case "hirulerroan", "2":
                {
                    // Pantalla garbitzen dugu jokoa hasi baino lehenago.
                    pantallaGarbitu();


                    // Hiru Lerroan jokoa abiarazi.
                    Hirulerroan.jokatu(sc);

                }
                break;

                case "harriorriar", "3":
                {
                    // Pantalla garbitzen du.
                    pantallaGarbitu();

                    new Harri_orri_ar(sc).jolastu();

                }
                break;//case harri orri ar

                case "ontziakhondoratu", "4":
                {
                    // Pantalla garbitzen du.
                    pantallaGarbitu();

                    // TODO: Ontziak hondoratu jokoa abiarazi.
                    new OntziakHondoratu().menuNagusia(sc);
                }
                break;
                //case ontziak hondoratu

                case "itxi", "0", "programaitxi":
                {
                    // Pantalla garbitzen du.
                    pantallaGarbitu();

                    //Programa bukatuko dela adierazteko
                    System.out.println("Programa itxi da.");

                }
                break;//case atzera

                default:
                {
                    //Pantaila garbitzen du
                    pantallaGarbitu();
                    //Jokoaren izena zuzena ez denean abisatu
                    System.out.println("Ez duzu jokoaren izena ondo sartu.");
                }//default

            }//switch
        } while (   !"itxi".equals(menuNagusi)
                &&  !"0".equals(menuNagusi)
                &&  !"programaitxi".equals(menuNagusi));
    }//menuNagusia

    public static void main(String[] args)
    {
        MenuNagusia menu = new MenuNagusia();

        //Pantaila garbitzen da.
        menu.pantallaGarbitu();

        try
        {
            menu.menuNagusia(menu.sc);
        }
        catch (NoSuchElementException sarreraAmaituta)
        {
            System.out.println();
        }
    }//main
}
