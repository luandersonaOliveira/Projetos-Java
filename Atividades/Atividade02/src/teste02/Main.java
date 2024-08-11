package teste02;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5};

        // Testando com diferentes valores
        System.out.println(buscarValor(array, 1));
        System.out.println(buscarValor(array, 3));
        System.out.println(buscarValor(array, 6));
    }

    public static int buscarValor(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            // Retorna o índice da primeira ocorrência
            if (array[i] == valor) {
                return i;
            }
        }
        // Retorna -1 se o valor não estiver presente
        return -1;
    }
}

/*
 * Objetivo: Criar um método que recebe um array de inteiros e um valor a ser
 * buscado. O método deve retornar o índice da primeira ocorrência do valor no
 * array ou -1 se o valor não estiver presente. Testar o método com diferentes
 * valores.
 */