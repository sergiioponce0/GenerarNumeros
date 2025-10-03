package org.example;

import java.util.*;

public class OrdenadorNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        while (sc.hasNextInt()) {
            numeros.add(sc.nextInt());
        }

        Collections.sort(numeros);

        for (int n : numeros) {
            System.out.println(n);
        }
    }
}