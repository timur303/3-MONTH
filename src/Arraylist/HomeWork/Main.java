package Arraylist.HomeWork;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ArrayList1
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        //так сандар
        Random random = new Random();
        int num1;
        for ( int i = 1; i < 100; i++) {
            num1 = random.nextInt(1,100);
            if (num1 % 2 != 0){
                arrayList1.add(num1);
            }
        }
        System.out.print(arrayList1);
        System.out.println("");

        //ArrayList2
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        //жуп сандар
        for (int j = 1; j < 100; j++) {
            num1 = random.nextInt(1,100);
            if (num1 % 2 == 0){
                arrayList2.add(num1);
            }
        }
        System.out.print(arrayList2);


    }
}
