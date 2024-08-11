package atividade;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100));
        }

        System.out.println("Lista: " + numeros);

        int valorParaBuscar = 10;
        int indice = buscarValor(numeros, valorParaBuscar);
        System.out.println("Índice do valor " + valorParaBuscar + ": " + indice);
    }

    public static int buscarValor(ArrayList<Integer> numeros, int valor) {
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == valor) {
                return i;
            }
        }
        return -1;
    }
}