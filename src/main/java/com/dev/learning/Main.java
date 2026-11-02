package com.dev.learning;

public class Main{
    public static void main(String[] args){
        System.out.println("Arrays in Java:");
        int[] arr = new int[15];
        int k = 0;
        for(int i=0;i<10;i++){
            arr[k]=i*2;
            k++;
        }
        //printing arr:
        for(int i : arr){
            System.out.println(i);
        }

    }
}