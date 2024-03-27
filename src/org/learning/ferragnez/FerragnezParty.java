package org.learning.ferragnez;

import java.util.Scanner;

public class FerragnezParty {
    public static void main(String[] args) {
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner keyboardReader = new Scanner(System.in);
        System.out.print("Come ti chiami?");
        String guestName = keyboardReader.nextLine();



        boolean inList = false;

        for (int i = 0; i < guests.length; i++) {
            if (guestName.equalsIgnoreCase(guests[i])){
                inList = true;
            }
        }

        if (inList){
            System.out.println("Benvenuti alla festa!!");
        } else {
            System.out.println("Mi dispiace ma non sei in lista.");
        }

        keyboardReader.close();
    }
}
