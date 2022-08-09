package Arraylist.HomeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList1
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        //так сандар
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                arrayList1.add(i);
            }
        }
        System.out.print(arrayList1);
        System.out.println("");

        //ArrayList2
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        //жуп сандар
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                arrayList2.add(i);
            }
        }
        System.out.print(arrayList2);


    }
}
