package atividade;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 90, 60, 80, 70, 50 };
        selectionSort(numbers);
        System.out.print("Array ordenado: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] array) {
        int numbers = array.length;
        for (int i = 0; i < numbers - 1; i++) {
            // Encontra o menor elemento no restante do arrayay
            int minIndex = i;
            for (int j = i + 1; j < numbers; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Troca o menor elemento encontrado com o primeiro elemento
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
