package atividade;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrayOriginal = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayOriginal[i] = rand.nextInt(100);
        }

        int[] arrayOrdenado = new int[arrayOriginal.length];

        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayOrdenado[i] = arrayOriginal[i];
        }

        for (int i = 0; i < arrayOrdenado.length - 1; i++) {
            for (int j = 0; j < arrayOrdenado.length - 1 - i; j++) {
                if (arrayOrdenado[j] > arrayOrdenado[j + 1]) {
                    int temp = arrayOrdenado[j];
                    arrayOrdenado[j] = arrayOrdenado[j + 1];
                    arrayOrdenado[j + 1] = temp;
                }
            }
        }

        System.out.println("arrayOriginal antes da transferência: " + Arrays.toString(arrayOriginal));

        System.out.println("arrayOrdenado após a ordenação: " + Arrays.toString(arrayOrdenado));
    }
}
