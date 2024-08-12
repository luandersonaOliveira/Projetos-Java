package atividade;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<String>();
        cidades.add("Buíque");
        cidades.add("Bom Conselho");
        cidades.add("Brejao");
        cidades.add("Venturosa");
        cidades.add("Canhotinho");
        System.out.println("Lista de cidades antes da ordenação: \n" + cidades);
        Collections.sort(cidades);
        System.out.println("Lista de cidades após a ordenação: \n" + cidades);
    }
}