package com.example;

import java.util.ArrayList;
import java.util.List;

 class SprialTraversalMatrix {


    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        int down = A.size()-1;
        int left = 0;
        int right = A.get(0).size()-1;
        int dir = 0;
        while( top<= down && left<= right){
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    list.add(A.get(top).get(i));
                }top++ ;
            }else if(dir ==1){
                for(int i = top ; i <= down; i++){
                    list.add(A.get(i).get(right));

                }right--;
            }else if(dir == 2){
                for( int i = right ; i>= left; i--){
                    list.add(A.get(down).get(i));

                }down--;
            }else if(dir == 3){
                for(int i = down ; i>= top; i--){
                    list.add(A.get(i).get(left));

                }left++;
            }
            dir = (dir+1)%4 ;
        }return list;
    }

     public static void main(String[] args) {
        List<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
         ArrayList<Integer> list2 = new ArrayList<>();
         ArrayList<Integer> list3 = new ArrayList<>();

         list1.add(1);
         list1.add(2);
         list1.add(3);

         list2.add(4);
         list2.add(5);
         list2.add(6);

         list3.add(7);
         list3.add(8);
         list3.add(9);

         list.add(list1);
         list.add(list2);
         list.add(list3);

         List<Integer> intList = spiralOrder(list);
         for (Integer a : intList){
             System.out.print(a+" ");
         }

     }

}
