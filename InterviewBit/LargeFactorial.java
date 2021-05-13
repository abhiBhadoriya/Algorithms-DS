package com.example;

public class LargeFactorial {
    public static String solve(int A) {
        String result = "";
        //int arraySize = 1;

        while(A>1){
            result = multiply(result,A);
            A--;
        }

        return result;
    }

    public static String multiply(String result, int A){
             if(result.equals("")){  // empty treated as 1
                return String.valueOf(A);
        }
        int carry = 0 ;
        String answer ="";
        int product;
        for(int i=result.length()-1 ;i >=0; i--){
            product =  (result.charAt(i) - '0') *A + carry;
            int unitPlace = product %10;
            carry = product /10;

            answer = unitPlace + answer;
        }
        if (carry !=0){
            answer = carry+answer;
        }return answer;
    }


    public static void main(String[] args) {
        String value =solve(4);
        System.out.println(value);
    }

}
