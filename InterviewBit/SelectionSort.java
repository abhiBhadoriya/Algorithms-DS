package com.example;

public class SelectionSort {
    public static void selectionSort(int[] array){
        int n = array.length;

        for (int i =0; i< n-1; i++){
            int iMin = i;
            for (int j = i+1; j<n; j++ ){
                if (array[j]< array[iMin]){
                    iMin = j;
                }
                int temp  = array[i];
                array[i] = array[iMin];
                array[iMin] = temp;
            }
        }
    }
    public static void main(String[] args) {

        int array[] = {2,7,4,1,5,3};

        selectionSort(array);
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
