package pkg;

import java.util.Scanner;

public class Main {

    private Scanner sc;

    /*
    1. úkol
    Převod galonů na litry -> výsledek vypsat do konzole.
    Proměnná, kterou si určíte (vstupní hodnota) bude počet galonů
    1 galon = 3.7854 litrů
    */

    private float galToLi(float gal) {
        return gal / 3.7854f;
    }

    /*
    2. úkol
    Program pro výpočet vaší váhy na měsíci -> výsledek vypsat do konzole.
    Vstupní hodnota bude vaše váha na zemi
    Gravitace na měsíci odpovídá 17% pozemské
    */

    private float moonWeight(float weight) {
        return weight * .17f;
    }

    /*
    3. úkol
    Napište program pro vypočet obsahu a obvodu kruhu -> výsledky vypsat do konzole.
    Vstupní hodnota bude poloměr kruhu
    */

    private double[] perimAndArea(double radius) {
        return new double[]{2 * Math.PI * radius, Math.PI * Math.pow(radius, 2)};
    }

    private void homework() {
        System.out.print("Zadej galony: ");
        System.out.println(this.galToLi(sc.nextFloat()));

        System.out.print("Zadej svou váhu na zemi: ");
        System.out.println(this.moonWeight(sc.nextFloat()));

        System.out.print("Zadej poloměr kruhu: ");
        double[] result = this.perimAndArea(sc.nextDouble());
        System.out.println("Obvod: " + result[0] + ", Obsah: " + result[1]);
    }

    // 1. zadání - načti přes scanner jméno a přijmení a vypiš je do konzole
    private void exc1() {
        String[] firstLast = new String[2];

        System.out.println("Zadej jméno: ");
        firstLast[0] = sc.next();

        System.out.println("Zadej přijmení: ");
        firstLast[1] = sc.next();

        System.out.println(firstLast[0] + " " + firstLast[1]);
    }

    // 2. zadání - načti číslo přes scanner a vypiš, zda je kladné, záporné či nula
    private void exc2() {
        int num = sc.nextInt();

        if (num < 0) System.out.println("Záporné");
        else if (num > 0) System.out.println("Kladné");
        else System.out.println("Nula");
    }

    // 3. zadání - načti 3 čísla přes scanner a vypiš největší
    private void exc3() {
        int a, b, c;
        System.out.println("Zadej číslo A");
        a = sc.nextInt();
        System.out.println("Zadej číslo B");
        b = sc.nextInt();
        System.out.println("Zadej číslo C");
        c = sc.nextInt();

        System.out.println("Největší je: ");

        if (a > b) {
            if (a > c) System.out.print(a);
            else System.out.print(c);
        } else if (b > a) {
            if (b > c) System.out.print(b);
            else System.out.print(c);
        } else System.out.print(c);
    }

    private Main() {
        this.sc = new Scanner(System.in);

        //exc1();
        //exc2();
        exc3();

    }

    public static void main(String[] args) {
	    new Main();
    }

}
