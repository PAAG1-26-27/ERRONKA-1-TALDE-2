
package com.mycompany.jokuak;
/**
 * @authors
 *      Jon Ander Estevez Del Palacio
 */
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class OntziakHondoratu
{
    //Scanner-a abiarazi
    Scanner teklatu = new Scanner(System.in);

    //Ausazko zenbakiak egiteko:
    private final Random ausazkoZbki = new Random();

    //jokuaren konfigurazioa
    static int tableroSize = 4;
    static final int ontziKop = 5;


    //Aldagaiak sortu eta hasierarazi
    static final String uraLetra   = "\u001B[90m ~ \u001B[0m";
    static final String hitLetra   = "\u001B[93m X \u001B[0m";
    static final String missLetra  = "\u001B[95m 0 \u001B[0m";
    static final String ontziLetra = "\u001B[99m[B]\u001B[0m";

    static void tableroaPrestatu (String[][] tableroHau)
    {
        for (int fila = 0; fila < tableroSize; fila++)
        {
            for (int zutabe = 0; zutabe < tableroSize; zutabe++)
            {
                tableroHau[fila][zutabe] = uraLetra;
            }//for
        }
    }

    private void pantailaIkusi(String[][] tableroHau, boolean ontziakEskutatu) {
        String letrak = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int zbk1;
        System.out.print("         ");
        for (int zutabe = 0; zutabe < tableroSize; zutabe++)
        {
            zbk1 = zutabe + 1;
            if (zbk1 < 10)
            {
                System.out.print(" " + zbk1 + "  ");
            }//if
            else
            {
                System.out.print(" " + zbk1 + " ");
            }//else
        }//for
        System.out.println();
        for (int fila = 0; fila < tableroSize; fila++) {
            System.out.print("      ");
            System.out.print(letrak.charAt(fila) + " ");
            for (int zutabe = 0; zutabe < tableroSize; zutabe++)
            {
                String laukia = tableroHau[fila][zutabe];

                //kasilla horren ontzia dagoenenan, ura jartzen da guk ez jakiteko.
                if (ontziakEskutatu && laukia.equals(ontziLetra))
                {
                    laukia = uraLetra;
                }//if

                System.out.print(" " + laukia);
            }//for
            System.out.println();
        }//for
    }//pantailaIkusi

    private void tableroakIkusi(String[][] tableroCPU, String[][] tableroJokalari, boolean ontziakEskutatu)
    {
        System.out.println("\u001B[93m┌────────────────────────────────┐\u001B[0m");
        System.out.println("\u001B[93m│       CPU-aren TABLEROA        │\u001B[0m");
        System.out.println("\u001B[93m└────────────────────────────────┘\u001B[0m");
        pantailaIkusi(tableroCPU, ontziakEskutatu);
        System.out.println("\u001B[93m└────────────────────────────────┘\u001B[0m");


        System.out.println("\u001B[94m┌────────────────────────────────┐\u001B[0m");
        System.out.println("\u001B[94m│         ZURE TABLEROA          │\u001B[0m");
        System.out.println("\u001B[94m└────────────────────────────────┘\u001B[0m");
        pantailaIkusi(tableroJokalari, false);
        System.out.println("\u001B[94m└────────────────────────────────┘\u001B[0m");
    }//tableroakIkusi

    private boolean eskuzAukeratu(Scanner sc)
    {
        String aukera;
        boolean zuzena, emaitza;
        do
        {
            aukera = HauIrakurri(sc, "Zelan jarriko dituzu zure ontziak?\n1. Eskuz 2. Ausaz: ");
            zuzena = aukera.equals("1") || aukera.equals("2");
            if (!zuzena)
            {
                System.out.println("Idatzi 1 edo 2, mesedez.");
            }//if
        }//do
        while (!zuzena);
        pantallaGarbitu();

        emaitza = aukera.equals("1");

        return emaitza;

    }//eskuzAukeratu

    private int[] posIrakurri(Scanner sc, String mezua)
    {
        //aldagaiak sortu eta hasierarazi
        int fila = 0;
        int zutabe = 0;
        boolean txarto;

        //Buklea posizioa zuzen bat gordetzeko
        do
        {
            //balioa reseteatzen da.
            txarto = true;

            //Testuaren posizia irakurri
            String posTestua = HauIrakurri(sc, mezua).toUpperCase(Locale.ROOT);

            //Sartutakoa Letra + zenbaki bat edo bi dela konprobatzeko.
            if (posTestua.matches("[A-Z][1-9][0-9]?"))
            {
                //Honek letrak zenbakira pasatzen ditu A:1, B:2...
                fila = posTestua.charAt(0) - 'A';

                zutabe = Integer.parseInt(posTestua.substring(1)) - 1;

                txarto = !(fila < tableroSize && zutabe < tableroSize);
            }

            if (txarto)
            {
                System.out.println("Koordenatu okerra. Erabili A-D eta 1-4. Adibidez: A1, C2, D4.");
            }//if
        } while (txarto);

        int[] matrizPos = new int[2];
        matrizPos[0] = fila;
        matrizPos[1] = zutabe;

        //Bi balioko matrizea bueltatzen da.
        return matrizPos;
    }//posIrakurri

    //___START___Pantalla_Metodoak___
    public String HauIrakurri(Scanner sc, String mezua)
    {
        System.out.print(mezua);
        return sc.nextLine().trim();
    }//HauIrakurri

    public void pantallaGarbitu()
    {
        //Pantaila garbitzen du
        for (int i = 0; i < 40; i++)
        {
            System.out.println();
        }//for
    }//pantallaGarbitu

    public void txartoIdatzi()
    {
        pantallaGarbitu();
        //Errore mesua ateratzen du
        System.out.println("\u001B[93mBalio okerra idatzi da!\u001B[0m\n");
    }

    public void egileaIkusi(Scanner sc)
    {

        // Pantalla garbitzen dugu jokoa hasi baino lehenago.
        pantallaGarbitu();

        System.out.println("   ┌─────────────────────────────────────┐");
        System.out.println("   |           ONTZIAK HONDORATU         |");
        System.out.println("   ├─────────────────────────────────────┤");
        System.out.println("   |\u001B[90m by:\u001B[0m\u001B[94m  Jon Ander Estévez Del Palacio \u001B[0m │");
        System.out.println("   └─────────────────────────────────────┘");
        System.out.println("\u001B[90mSakatu edozein tekla atzera joateko.\u001B[0m");

        //sakatu arte itxaroteko
        sc.nextLine();

        // Pantalla garbitzen dugu jokoa hasi baino lehenago.
        pantallaGarbitu();
    }//egilea

    public void arauakIkusi(Scanner sc)
    {
        // Pantalla garbitzen dugu jokoa hasi baino lehenago.
        pantallaGarbitu();

        System.out.println("   ┌─────────────────────────────────────┐");
        System.out.println("   |           ONTZIAK HONDORATU         |");
        System.out.println("   └─────────────────────────────────────┘");
        System.out.println("   \u001B[90m\u001B[0m\u001B[94mHAUEK DIRA ARAUAK: \u001B[0m");
        System.out.printf("   1. Jokalari bakoitzak %d ontzi ditu %d × %d laukiko tableroan.%n",
                ontziKop, tableroSize, tableroSize);
        System.out.println("   2. Ontzi bakoitzak lauki bat hartzen du. Zureak eskuz edo ausaz jar ditzakezu.");
        System.out.println("   3. Erabili A-D letrak eta 1-4 zenbakiak, adibidez A1 edo D4. Gero CPUak jaurtiko du.");
        System.out.println("   4. X ikurrak asmatutako tiroa adierazten du, eta 0 ikurrak huts egindakoa.");
        System.out.println("   5. Lauki bakoitzean behin bakarrik jaurti dezakezu.");
        System.out.println("   6. Aurkariaren ontzi guztiak lehenengo hondoratzen dituenak irabazten du.");

        System.out.println("\n\u001B[90mSakatu Enter atzera joateko.\u001B[0m");

        //sakatu arte itxaroteko
        sc.nextLine();

        // Pantalla garbitzen dugu jokoa hasi baino lehenago.
        pantallaGarbitu();
    }//arauakIkusi
    //___END___Pantalla_Metodoak___

    //___START___Jokoaren_Metodoak___
    public void partidaHasi(Scanner sc) {

        //Aldagaiak sorty eta hasierarazi
        int jokalariOntziak = ontziKop;
        int cpuOntziak      = ontziKop;
        int txanda = 1;
        String txandarenEmaitza = "";


        //Bi tablero sortzen dira
        String[][] tableroJokalari = new String[tableroSize][tableroSize];
        String[][] tableroCPU = new String[tableroSize][tableroSize];

        //Bi tableroak "urez" betetzen dira.
        tableroaPrestatu(tableroJokalari);
        tableroaPrestatu(tableroCPU);

        //Eskuz jokatuko den aukeratu
        boolean eskuz = eskuzAukeratu(sc);
        ontziakJarri(tableroJokalari, sc, eskuz);
        ontziakJarri(tableroCPU, sc, false);


        while (jokalariOntziak > 0 && cpuOntziak > 0)
        {
            tableroakIkusi(tableroCPU, tableroJokalari, true);

            System.out.println();
            if (!txandarenEmaitza.isEmpty())
            {
                System.out.println(txandarenEmaitza);
            }//iff

            System.out.println("\u001B[99m┌────────────────────────────────┐\u001B[0m");
            System.out.printf("\u001B[99m│           %-21s│\u001B[0m%n", txanda + ". TXANDA");

            // Tu turno. Disparas al tablero de la CPU.
            int[] nireTiroa = jaurtiketaAukeratu(tableroCPU, sc, true);
            boolean nireTiroaAsmatu = jaurtiketaBegiratu(tableroCPU, nireTiroa);
            if (nireTiroaAsmatu)
            {
                cpuOntziak--;
            }
            txandarenEmaitza = nireTiroaAsmatu ? "Tiro ona!" : "Tiro txarra...";

            // La CPU responde si todavía le queda algún barco.
            if (cpuOntziak > 0)
            {
                int[] cpuTiroa = jaurtiketaAukeratu(tableroJokalari, sc, false);
                boolean cpuTiroaAsmatu = jaurtiketaBegiratu(tableroJokalari, cpuTiroa);
                if (cpuTiroaAsmatu)
                {
                    jokalariOntziak--;
                }
                txandarenEmaitza += cpuTiroaAsmatu ? "\nZure ontzia jo dute..." : "\nEz zaitu eman!";
            }

            if (jokalariOntziak > 0 && cpuOntziak > 0)
            {
                pantallaGarbitu();
                txanda++;
            }
        }

        //Azken jaurtiketa erakutsi eta amaieran ontzi guztiak bistaratu.
        pantallaGarbitu();
        tableroakIkusi(tableroCPU, tableroJokalari, false);
        System.out.println(txandarenEmaitza);
        if (cpuOntziak == 0)
        {
            System.out.println("IRABAZI DUZU");
            System.out.println("CPU: " + (ontziKop - cpuOntziak) + " - " + (ontziKop - jokalariOntziak) + " :Jokalaria");
        }
        else
        {
            System.out.println("GALDU EGIN DUZU");
            System.out.println("CPU: " + (ontziKop - cpuOntziak) + " - " + (ontziKop - jokalariOntziak) + " :Jokalaria");

        }
    }

    private void ontziakJarri (String[][] tableroHau, Scanner sc, boolean eskuz)
    {
        //Aldagaiak sortu
        int jarritakoak;
        int fila, zutabe;
        int[] laukiHau;

        //aldagaiak hasierarazi
        jarritakoak = 0;

        while (jarritakoak < ontziKop)
        {
            if (eskuz)
            {
                pantailaIkusi(tableroHau, false);

                //posIrakurri erabili posizioa irakurtzeko
                laukiHau = posIrakurri(sc, "Sartu ontziaren posizioa: \n\u001B[90mAdibidez: A1, B2, D4 (A-D, 1-4).\u001B[0m ");

                //fila eta zutabeetan gorde irakurritako bi balioak
                fila = laukiHau[0];
                zutabe = laukiHau[1];

            }//if   (ontziak guk jartzeko)

            //asuazko hontziak jartzeko.
            else
            {
                fila = ausazkoZbki.nextInt(tableroSize);
                zutabe = ausazkoZbki.nextInt(tableroSize);
            }//else (ontziak ausaz jartzeko)

            if (tableroHau[fila][zutabe].equalsIgnoreCase(uraLetra))
            {
                tableroHau[fila][zutabe] = ontziLetra;
                jarritakoak++;

                if (eskuz)
                {
                    pantallaGarbitu();
                    System.out.println(jarritakoak + "/" + ontziKop + " Ontzi jarri dira.");
                }
            }//if (ontzia uretan jartzeko bakarrik)
            else if (eskuz)
            {
                System.out.println("Laukia okupatuta dago.");
            }//else if

        }//while
    }//ontziakJarri

    private int [] jaurtiketaAukeratu (String[][] aurkariTablero, Scanner sc, boolean nireTxanda)
    {
        int [] laukiHau = new int[2];
        boolean ondoJaurti;
        String laukia;

        do
        {
        if (nireTxanda)
        {
            System.out.println("      Non jaurti nahi duzu? \n\u001B[90m      Adibidez: A1, B2, D4 (A-D, 1-4).\u001B[0m ");
            laukiHau = posIrakurri(sc, "\u001B[99m└────────────────────────────────┘\u001B[0m\n");
        }//if
        else
        {
            laukiHau[0] = ausazkoZbki.nextInt(tableroSize);
            laukiHau[1] = ausazkoZbki.nextInt(tableroSize);
        }//else (CPU-aren jaurtiketak)


            laukia = aurkariTablero[laukiHau[0]][laukiHau[1]];
        if (laukia.equalsIgnoreCase(uraLetra) || laukia.equalsIgnoreCase(ontziLetra))
        {
            ondoJaurti = true;
        }//if (ontzi edo ura bada)
        else
        {
            ondoJaurti = false;
        }//else (ez bada ez ura ez ontzi)

        if (!ondoJaurti && nireTxanda)
        {
            char errenkadaLetra = (char) ('A' + laukiHau[0]);
            int zutabeZenbakia = laukiHau[1] + 1;
            System.out.printf("%c%d posizioan jaurti duzu jada.%n", errenkadaLetra, zutabeZenbakia);
        }//if (nire txanda denean bakarrik)

        }//do
        while (!ondoJaurti);

        return laukiHau;
    }//jaurtiketaAukeratu

    private boolean jaurtiketaBegiratu (String[][] aurkariTablero, int [] jartiLaukia)
    {
        int fila, zutabe;

        fila = jartiLaukia[0];
        zutabe = jartiLaukia[1];

        if (aurkariTablero[fila][zutabe].equalsIgnoreCase(ontziLetra))
        {
            aurkariTablero[fila][zutabe] = hitLetra;
            return true;
        }//if
        else
        {
            aurkariTablero[fila][zutabe] = missLetra;
            return false;
        }//else (ez bada jaurtiketa ona izan)
    }//jaurtiketaEgin

    //___END___Jokoaren_Metodoak___

    //___START___Menu_nagusia___
    public void menuNagusia(Scanner sc)
    {
        menuNagusia(sc, true);
    }

    private void menuNagusia(Scanner sc, boolean menuOrokorreraItzuli)
    {
        //Aldagaiak sortu
        String menuNagusi, itxi;

        //Irten aukeratu arte menua errepikatzeko
        do
        {
            //Menua lauki batean erakutsi.
            System.out.println();
            System.out.println("┌────────────────────────────┐");
            System.out.println("│        \u001B[1mMENU NAGUSIA\u001B[0m        │");
            System.out.println("├────────────────────────────┤");
            System.out.println("│  1 - \u001B[96mPartida hasi!\u001B[0m         │");
            System.out.println("│  2 - \u001B[99mArauak\u001B[0m                │");
            System.out.println("│  3 - \u001B[99mEgilea\u001B[0m                │");
            System.out.println("├────────────────────────────┤");
            String irtetekoAukera = menuOrokorreraItzuli ? "Atzera" : "Jokua itxi";
            System.out.printf("│  0 - \u001B[91m%-22s\u001B[0m│%n", irtetekoAukera);
            System.out.println("└────────────────────────────┘");
            System.out.println();

            //Aukeratutako jokoaren izena irakurri
            menuNagusi = HauIrakurri(sc, "Zer egin nahi duzu?\n\u001B[90m(Idatzi aukeraren zenbakia edo testua)\u001B[0m ");


            //Testua garbitzen da
            menuNagusi = menuNagusi.toLowerCase();
            menuNagusi = menuNagusi.replace(" ", "");


            //Aukeratutako jokoaren atala erakutsi
            switch (menuNagusi)
            {
                case "partidahasi", "1", "hasi":
                {
                    // Pantalla garbitzen dugu jokoa hasi baino lehenago.
                    pantallaGarbitu();

                    //partida hasten du
                    partidaHasi(sc);

                }
                break;//case partida hasi
                case "arauak", "2", "araua":
                {
                    //Egilearen datuak ikusi
                    arauakIkusi(sc);
                }//case
                break;//case arauak

                case "egilea", "3":
                {
                    //Egilearen datuak ikusi
                    egileaIkusi(sc);
                }//case
                break;//case egilea

                //case ontziak hondoratu

                case "atzera", "itxi", "0", "programaitxi":
                {
                    //Pantaila garbitzen du.
                    pantallaGarbitu();

                    //Programa bukatu nahi duen galdetzeko
                    System.out.println(menuOrokorreraItzuli
                            ? "Menu nagusira itzuli nahi duzu?"
                            : "Jokua itxi nahi duzu?");

                    do
                    {
                        itxi = HauIrakurri(sc, "\u001B[90mEnter sakatu edo (Bai/Ez) idatzi: \u001B[00m");

                        //Bai edo Enter sakatzen badu programa itxi
                        if (itxi.equalsIgnoreCase("bai") || itxi.equals(""))
                        {
                            menuNagusi = "0";
                        }//if

                        //Ez esaten badu menu nagusira bueltatu
                        else if (itxi.equalsIgnoreCase("ez"))
                        {
                            menuNagusi = "-1";
                        }//else if

                        //Beste zerbait sartzen badu berriro galdetu
                        else
                        {
                            txartoIdatzi();
                        }//else
                    }//do
                    while (!itxi.equalsIgnoreCase("bai")
                            && !itxi.equalsIgnoreCase("ez")
                            && !itxi.equals(""));

                }
                break;//case itxi

                default:
                {
                    //Pantaila garbitzen du
                    pantallaGarbitu();

                    //Jokoaren izena zuzena ez denean abisatu
                    txartoIdatzi();
                }//default

            }//switch
        }//do
        while (!"0".equals(menuNagusi));
    }//menuNagusia
    //___END___Menu_nagusia___

    public static void main(String[] args)
    {
        OntziakHondoratu menu = new OntziakHondoratu();

        //Pantaila garbitzen da.
        menu.pantallaGarbitu();

        try
        {
            menu.menuNagusia(menu.teklatu, false);
        }
        catch (NoSuchElementException sarreraAmaituta)
        {
            System.out.println();
        }
    }//main

}//ontziakHondoratu
