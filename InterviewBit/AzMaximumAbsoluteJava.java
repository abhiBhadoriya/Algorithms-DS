package com.example;

import java.util.ArrayList;

public class AzMaximumAbsoluteJava {
    public static int maxArr(ArrayList<Integer> A) {

        //The below function found value in time O(n^2));

        /*int maxSoFar = Integer.MIN_VALUE;
        int maxRightHere = 0;

        for(int i=0 ; i<A.size(); i++){
            for(int j =i ; j<A.size(); j++){
                maxRightHere = Math.abs(A.get(i) -A.get(j)) + Math.abs(i - j);
                if (maxSoFar < maxRightHere){
                    maxSoFar = maxRightHere;
                }
            }
        }return maxSoFar;*/

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=0; i<A.size(); i++){

            if(max1 < A.get(i) +i){
                max1 = A.get(i)+i;
            }
            if(min1 > A.get(i)+i) {
                min1 = A.get(i)+i;
            }
            if(max2 < A.get(i) -i){
                max2 = A.get(i)-i;
            }
            if(min2 > A.get(i)-i) {
                min2 = A.get(i)-i;
            }
        }
        int temp1 = max1-min1;
        int temp2 = max2-min2;
        if (temp1>temp2) return temp1;
        else return temp2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(-1);

        System.out.println(maxArr(arrayList));

    }
}
