package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
	Meyveler ve KG Fiyatları:
    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
	 */
        int aKg, eKg, dKg, mKg, pKg;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        aKg = input.nextInt();
        System.out.print("Elma kaç kilo? : ");
        eKg = input.nextInt();
        System.out.print("Domates kaç kilo? : ");
        dKg = input.nextInt();
        System.out.print("Muz kaç kilo? : ");
        mKg = input.nextInt();
        System.out.print("Patlıcan kaç kilo? : ");
        pKg = input.nextInt();
        double armut = (2.14 * aKg), elma = (3.67 * eKg), domates = (1.11 * dKg), muz = (0.95 * mKg), patlıcan = (5.00 * pKg), total;
        total = armut + elma + domates + muz + patlıcan;
        System.out.println("Toplam tutar: "+total+ " Tl");


    }
}
