package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int geheimnisZahl = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int versuche = 0;
        int gerateneZahl;

        System.out.println("Rate die Geheimniszahl zwischen 1 und 100!");
        System.out.println("Geheimniszahl ist " + geheimnisZahl + " (es ist hier zur Überprüfung)");
        System.out.println("_______________");

        do {
            System.out.print("Gib deine Vermutung ein: ");
            gerateneZahl = scanner.nextInt();
            versuche++;

            if (gerateneZahl > geheimnisZahl) {
                System.out.println("Zu hoch! Versuche es nochmal.");
            } else if (gerateneZahl < geheimnisZahl) {
                System.out.println("Zu niedrig! Versuche es nochmal.");
            }
        } while (gerateneZahl != geheimnisZahl);

        System.out.println("Herzlichen Glückwunsch! Du hast die Zahl in " + versuche + " Versuchen erraten.");
        scanner.close();
    }
}
