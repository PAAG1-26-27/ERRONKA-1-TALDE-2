# ERRONKA-1-TALDE-2 · Gazteleku (Kodekin)

Gaztelekua kudeatzeko proiektua: Java jokuak, kudeaketa-aplikazioa, datu-basea eta dokumentazioa.

**Taldea:** Aitor Burunza · Jon Ander Estévez · Huzaima Muhammad · Nora Ortiz de Lejarazu

## Karpeten egitura

| Karpeta | Edukia |
|---|---|
| `Programazioa/Jokuak` | Jokuen menu nagusia (Java, Maven). Lau joku: Zenbakia asmatu, Hiru lerroan, Harri-Orri-Ar eta Ontziak hondoratu. |
| `Programazioa/Gaztelekua` | Gaztelekuaren kudeaketa-aplikazioa (Pertsona, Ekintza eta azpiklaseak). |
| `Diagramak/Klase_diagramak` | Klase-diagramak. |
| `Datu_basea` | Entitate-erlazio diagrama eta datu-basearen oharrak. |
| `Dokumentazioa` | Dokumentuen zerrenda eta non dauden. |

## Jokuak

Menu nagusiko aukerak (`MenuNagusia.java`):

| Aukera | Jokoa | Egilea | Egoera |
|---|---|---|---|
| 1 | Zenbakia asmatu | Aitor Burunza | Menuan konektatuta |
| 2 | Hiru lerroan | Huzaima Muhammad | `Hirulerroan.java` badago, baina menuan oraindik konektatu gabe |
| 3 | Harri-Orri-Ar | Nora Ortiz de Lejarazu | Menuan konektatuta |
| 4 | Ontziak hondoratu | Jon Ander Estévez | Menuan konektatuta |

## Nola exekutatu

JDK 21 behar da. `Programazioa/Jokuak` karpetatik:

```
javac -encoding UTF-8 -d out src/main/java/com/mycompany/jokuak/*.java
java -cp out com.mycompany.jokuak.MenuNagusia
```

NetBeans edo IntelliJ-ekin ere ireki daiteke (Maven proiektua; main klasea `com.mycompany.jokuak.MenuNagusia`).

## Lan egiteko modua

- `main` adarra egonkorra izan dadin, aldaketak adar propioetan egin eta Pull Request bidez sartu.
- Zereginak Issues atalean daude.
- Fitxategi handiak (bideoak, `.accdb`, `.docx`) ez dira errepositorioan gordetzen; ikus `Dokumentazioa/README.md`.
