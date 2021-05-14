package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AzLargestNumberFromArray {
    public  static String largestNumber(final List<Integer> A) {
        String answer ="";
        if(A.isEmpty()){
            return "";
        }
        String[] array = new String[A.size()];
        for(int i=0; i<A.size(); i++){
            array[i] = Integer.toString(A.get(i));
        }

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String o1= a+b;
                String o2 = b+a;
                return o2.compareTo(o1);
            }
        });
        //Below function is same and is lambda expression representtion of new comparator.

       /* Arrays.sort(array, (a, b) -> {
            String o1= a+b;
            String o2 = b+a;
            return o2.compareTo(o1);
        });

        if(array[0].equals("0")){
            return "0";
        }*/
        StringBuilder sw = new StringBuilder();
        for(String i : array){
            sw.append(i);
        }
        return sw.toString();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(-2);
        list.add(1);list.add(-3);list.add(4);list.add(-1);list.add(2);list.add(1);list.add(-5);list.add(-4);

        System.out.println(largestNumber(list));
    }
}
