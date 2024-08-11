package atividade;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> pessoas = new ArrayList<String>();
    pessoas.add("A");
    pessoas.add("B");
    pessoas.add("C");
    pessoas.add("D");
    pessoas.remove(1);
    pessoas.add("E");

    System.out.println(pessoas);
  }
}