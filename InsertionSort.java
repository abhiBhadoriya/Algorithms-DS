package com.example;


public class InsertionSort
{

    void sort(int arr[])
    {
        int n = arr.length-1;
        int values = 0;
        int hole;
        for (int i = 1; i <= n; i++){
            values = arr[i];
            hole = i;

            while(hole >0 && arr[hole - 1]> values ){
                arr[hole] = arr[hole - 1];
                hole = hole -1;
            }
            arr[hole]= values;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6};
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }
}
