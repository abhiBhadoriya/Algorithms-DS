//TIME COMPLEXITY OF BELOW PROGRAM IS O(n) and space complexity is O(1);

package com.example;

import java.util.ArrayList;
import java.util.List;

public class AzFindDuplicateArray {
    public static int repeatedNumber(final List<Integer> A) {
      //Below code is done using mutability of list as our program demands that list shouldn't be mutable
      
        /*if (A == null){
            return -1;
        }
        int value = 0;
        for(int i=0; i<A.size(); i++){
            if(A.get(Math.abs(A.get(i)))>0){
                A.set(Math.abs(A.get(i)), -1*A.get(Math.abs(A.get(i))));
            }else{
                return  Math.abs(A.get(i));
            }

        }
        return 0;*/
      
      //checking if list is empty
        if (A.size()<=1){
            return -1;
        }
      
      //USING FLOYD'S CYCLE DETECTION ALGO
      
        int slow = A.get(0);
        int fast = A.get(A.get(0));

        while(fast != slow){
            slow = A.get(slow);
            fast = A.get(A.get(fast));
        }
      
      //above loop will run through first time collision
          slow =0;
        //  fast = 0;
      
        while(fast != slow){
            slow = A.get(slow);
            fast = A.get(fast);
        }
      return slow;
    }
//for running the code
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(1);
        int num = repeatedNumber(list);
        System.out.println(num);
    }
}

