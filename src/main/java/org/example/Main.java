package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random zufallsGenerator = new Random();
        int geheimzahl = zufallsGenerator.nextInt(100) + 1;
        System.out.println("Generierte Geheimzahl: " + geheimzahl);
    }
}
