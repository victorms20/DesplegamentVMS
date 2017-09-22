package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contador = 0;

        System.out.println("Dime una frase");
        String frase = lector.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' ||
                    frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " vocales");
    }
}
