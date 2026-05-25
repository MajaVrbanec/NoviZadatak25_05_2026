// Zadatak:

// Kreirati apstraktnu klasu Sportas s atributima ime i brojDresa.
// Kreirati izvedenu klasu Nogometas koja nasljeđuje Sportas i dodaje specifični atribut brojGolova.
// (dodaj samostalno tip koji misliš da treba)
// Klasa Nogometas mora implementirati sučelje Comparable<Nogometas> i nadjačati (@Override) metodu compareTo
// tako da se nogometaši sortiraju po broju golova silazno (od onog s najviše golova prema onom s najmanje).
// Nadjačati metodu toString() u klasi Nogometas za lijep ispis podataka.
// U main metodi kreirati ArrayList<Nogometas>, dodati barem 3–4 nogometaša, ispisati ih prije sortiranja, pozvati
// Collections.sort() i ponovno ispisati sortirane nogometaše.


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //prazna lista koja prima samo Nogometase
        ArrayList<Nogometas> lista = new ArrayList<>();

        //Stvaramo nove nogometaše pomoću ključne riječi new i odmah ih ubacujemo u listu s .add !!!
        lista.add(new Nogometas("Luka", 10, 50));
        lista.add(new Nogometas("Ronaldo", 7, 70));
        lista.add(new Nogometas("Marko", 30, 45));
        lista.add(new Nogometas("Daniel", 11, 20));

        // Ispis svih nogometaša iz liste pomoću for-each petlje
        System.out.println("***Prije sortiranja***");
        for (Nogometas n : lista) {
            System.out.println(n);
        }

        // pozivamo Collections.sort() koja pomoću compareTo metode pregleda i sortira nogometaše
        Collections.sort(lista);

        // Ispis svih nogometaša iz liste nakon sortiranja pomoću for-each petlje
        System.out.println("\n***Nakon sortiranja***");
        for (Nogometas n : lista) {
            System.out.println(n);
        }






    }

}
