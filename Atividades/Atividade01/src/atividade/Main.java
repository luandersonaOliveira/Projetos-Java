package atividade;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Array com 10 elementos
        int array[] = new int[10];

        // Numeros gerados no random
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        // Inicializando as variáveis de maior, menor valor e soma
        int maior = array[0];
        int menor = array[0];
        int soma = 0;

        // Comparando cada índice para encontrar o maior, o menor valor e somando os valores
        for (int numero : array) {
            soma += numero;
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Exibindo os números gerados
        System.out.print("Números gerados:");
        for (int numero : array) {
            System.out.print(" " +numero);
        }

        // Exibindo o maior, o menor valor e soma
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Soma dos valores: " + soma);
    }
}
