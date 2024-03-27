package org.learning.train;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);

        // chidiamo all'utente quanti chilometri vuole percorrere
        System.out.print("Quanti chilometri vuoi percorrere?");
        int kmTravel = keyboardReader.nextInt();

        // chiediamo l'età dell'utente
        System.out.print("Quanti anni hai?");
        int ageUsers = keyboardReader.nextInt();

        // calcolo il costo del biglietto senza sconti
        double priceKm = 0.21;
        double totalPrice = kmTravel * priceKm;


        // applico gli eventuali sconti
        double underage = 0.2;
        double over65 = 0.4;
        double finalPrice;
        if (ageUsers < 18){
            finalPrice = totalPrice - (totalPrice * underage);
            System.out.println("Il prezzo totale del biglietto è: " + totalPrice + "€");
            System.out.println("Hai ottenuto uno sconto MINORENNI pari al " + (int)(underage * 100) +"%");
        } else if (ageUsers >= 65){
            finalPrice = totalPrice - (totalPrice * over65);
            System.out.println("Il prezzo totale del biglietto è: " + totalPrice + "€");
            System.out.println("Hai ottenuto uno sconto OVER65 pari al " + (int)(over65 * 100) +"%");
        } else {
            finalPrice = totalPrice;
        }

        System.out.println("Prezzo finale del biglietto: " + finalPrice + "€");
    }
}
