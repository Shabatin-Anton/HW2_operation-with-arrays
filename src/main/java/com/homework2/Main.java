package main.java.com.homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        first();
        second();
        third();
    }

    public static void first() {
        int[] myArray = new int[20];
        for (int i=0; i<myArray.length;i++){
            myArray[i] = (int) (Math.random() * 14);
        }
        int min = myArray[0];
        for (int j=0; j<myArray.length; j++){
            if (min>myArray[j]){
                min = myArray[j];
            }
        }
        System.out.println("Min element of array : "+min);

        int max = myArray[0];
        for (int j=0; j<myArray.length; j++){
            if (max<myArray[j]){
                max = myArray[j];
            }
        }
        System.out.println("Max element of array : "+max);

        Arrays.sort(myArray);

        for(int i = myArray.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( myArray[j] < myArray[j+1] ){
                    int x = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = x;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Sum of array elements : " + sum);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.pow(myArray[i],2);
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void second(){
        String[][] matrix ={
                {"that", "tree", "blue"},
                {"ice", "i", "see"},
                {"water", "human", "want"}
        };
        String[] diagonal = new String[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                diagonal[i] = matrix[i][j];
                i++;
            }
        }
        for (int i = 0; i < diagonal.length; i++) {
            System.out.print(diagonal[i] + " ");
        }
    }

    public static void third(){
        int [] zero = {3,2,3,1,4,2,8,3};
        for (int i = 0; i < zero.length; i++) {
            for (int j = i + 1; j < zero.length; j++) {
                if (zero[i] == zero[j]){
                    zero[j] = 0;
                }
            }
        }
    }
}
