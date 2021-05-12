package com.example;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
         long maxRightHere =0;
        long maxSoFar =0;
        ArrayList<Integer> maxArray = new ArrayList<>();
        ArrayList<Integer> newArray = new ArrayList<>();

        for(Integer i: A){
            if(i >=0){
                maxRightHere +=i;
                newArray.add(i);
            }else{
                maxRightHere =0;
                newArray = new ArrayList<>();
            }
            if ((maxRightHere > maxSoFar)||(maxRightHere== maxSoFar)&&( newArray.size() > maxArray.size())){
                maxSoFar = maxRightHere;
                maxArray = newArray;
            }
        }return maxArray;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(0);
        list.add(-1);
        list.add(0);
        ArrayList<Integer> newList = maxset(list);
        for (Integer i : newList){
            System.out.print(i+ " ");
        }
    }
}
