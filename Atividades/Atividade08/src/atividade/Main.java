package atividade;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array = { 2, 4, 6 };

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : array) {
            arrayList.add(num);
        }
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);

        System.out.println(arrayList);

        Integer[] newArray = new Integer[arrayList.size()];
        newArray = arrayList.toArray(newArray);

        for (int nums : newArray) {
            System.out.print(nums + " ");
        }
    }
}