package org.example;

import java.util.Random;

public class GenerarNumeros {
    public static void main(String[] args) {
        int cantidad = 10;   // valor por defecto
        int max = 100;       // valor por defecto

        if (args.length >= 1) {
            cantidad = Integer.parseInt(args[0]);
        }
        if (args.length >= 2) {
            max = Integer.parseInt(args[1]);
        }

        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(max + 1);
            System.out.println(numero);
        }
    }
}