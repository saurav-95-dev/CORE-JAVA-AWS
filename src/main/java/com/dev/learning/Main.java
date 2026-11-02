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
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //2-d arrays:
        int[][] arr1 =  new int[4][4];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[0][3] = 4;
        arr1[1][0] = 5;
        arr1[1][1] = 6;
        arr1[1][2] = 7;
        arr1[1][3] = 8;
        arr1[2][0] = 9;
        arr1[2][1] = 11;
        arr1[2][2] = 12;
        arr1[2][3] = 13;
        arr1[3][0] = 14;
        arr1[3][1] = 15;
        arr1[3][2] = 16;
        arr1[3][3] = 17;
        //printing array :
        for(int row=0;row<arr1.length;row++){
            for(int col=0;col<arr1[row].length;col++){
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();
        }


    }
}