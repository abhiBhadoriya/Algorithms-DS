package com.example;

import java.util.Scanner;

public class InsertionSort{

    public static final Scanner input = new Scanner(System.in);

    public static void insertionSort(int[] array){
        int values ;
        int hole  ;
        for(int i =1; i<=array.length-1; i++){
            values = array[i];
            hole = i;
            while(hole >0 && array[hole-1] < values){//array[hole-1] > values
                array[hole] = array [hole-1];
                hole  = hole -1;
            }
            array[hole] = values;
        }

    }


    public static void printArray(int[] array){

        for(int i = 0;i<array.length; i++){
            System.out.print(array[i]+ " ");

        }
    }
    public static void main(String...args){

        int array[] ={12,11,12,5,6,};
        insertionSort(array);
        printArray(array);
    }
}