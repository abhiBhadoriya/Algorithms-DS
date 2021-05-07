package com.example;

public class MergeSort {

    public static void mergeSort(int[] array){
        int n = array.length;
        if (n < 2){
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for (int i = 0; i< mid; i++){
            left[i] = array[i];
        }

        for (int i =mid; i < n; i++){
            right[i-mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);
    }

    public static void merge(int[] left, int[] right, int[] array){
        int nl = left.length;
        int nr = right.length;

        int i = 0,j =0, k = 0;

        while( i < nl && j < nr){
                if ( left[i] <= right[j]){
                    array[k] = left[i];
                    i +=1;
                }
                else{
                    array[k] = right[j];
                    j +=1;
                }
                k +=1;
        }
        while( i < nl){
            array[k] = left[i];
            i +=1;
            k +=1;
        }
        while( j < nr){
            array[k] = right[j];
            j +=1;
            k +=1;
        }

    }

    public static void printArray(int[] array){
        for (int i = 0 ; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int array[] = {2,3,1,6,7,32,6,2};
        mergeSort(array);
        printArray(array);
    }
}
