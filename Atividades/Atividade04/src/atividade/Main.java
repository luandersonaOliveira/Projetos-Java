package atividade;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                soma += matriz[i][j];
            }
        }

        System.out.println("\nA soma de todos os elementos da matriz é: " + soma);
    }
}
