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

    private Main() {
        this.sc = new Scanner(System.in);

        System.out.print("Zadej galony: ");
        System.out.println(this.galToLi(sc.nextFloat()));

        System.out.print("Zadej svou váhu na zemi: ");
        System.out.println(this.moonWeight(sc.nextFloat()));

        System.out.print("Zadej poloměr kruhu: ");
        double[] result = this.perimAndArea(sc.nextDouble());
        System.out.println("Obvod: " + result[0] + ", Obsah: " + result[1]);
    }

    public static void main(String[] args) {
	    new Main();
    }

}
