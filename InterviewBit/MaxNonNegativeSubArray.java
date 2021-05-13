package com.example;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
    public static int maxset(ArrayList<Integer> A) {
       // ArrayList<Integer> list = new ArrayList<>();
        /*int maxRightHere = 0;
        int maxSoFar = 0;
        int start = 0;
        int end = 0;
        int s =0;*/

        //for(int i = 0; i<A.size(); i++){
         /*   if(A.get(i)>=0){
                maxRightHere += A.get(i);
                //end = i;
            }else{
                s=i+1;
                maxRightHere = 0;
            }

            if(maxRightHere > maxSoFar){
                maxSoFar = maxRightHere;
                start = s;
                end = i;
            }*/
                /*if(A.get(i)>=0){
                    maxRightHere  += A.get(i);
                    if(maxRightHere >= maxSoFar){
                        maxSoFar = maxRightHere;
                        start = s;
                        end = i;
                    }
                }else{
                    maxRightHere =0;
                    s = i+1;
                }
            }
*/


      /*  for(int i=start ; i<=end; i++){

            if(A.get(i)<0){
                return new ArrayList<>() ;
            }
            else
            {
                list.add(A.get(i));
            }

        }
        return list;*/

       /* long maxRightHere =0;
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
        }return maxArray;*/
        int maxRightHere = 0 ;
        int maxSoFar = Integer.MIN_VALUE;

        for(Integer i : A){

            maxRightHere += i;

           if(maxSoFar < maxRightHere){
               maxSoFar = maxRightHere;
           }
           if(maxRightHere <0){
               maxRightHere = 0;
           }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //list.add(-500);
         //[-2, 1, -3, 4, -1, 2, 1, -5, 4]
        list.add(-2);
        list.add(1);list.add(-3);list.add(4);list.add(-1);list.add(2);list.add(1);list.add(-5);list.add(-4);

        /*list.add(0);
        list.add(0);
        list.add(-1);
        list.add(0);*/
        System.out.println(maxset(list));
        }
    }

