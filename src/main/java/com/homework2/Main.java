package main.java.com.homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myArray = new int[20];

        random(myArray);
        minOfArray(myArray);
        maxOfArray(myArray);
        sortAscending(myArray);
        sortDescending(myArray);
        additionOfArrElements(myArray);
        arraySquaring(myArray);

        String[][] matrix = {
                {"that", "tree", "blue"},
                {"ice", "i", "see"},
                {"water", "human", "want"}
        };
        diagonal(matrix);

        int[] zero = {3, 2, 3, 1, 4, 2, 8, 3};
        duplicateToZero(zero);
    }

    public static void random(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 34);
        }
        printArray(myArray);
    }

    public static void minOfArray(int[] myArray) {
        int min = myArray[0];
        for (int j = 0; j < myArray.length; j++) {
            if (min > myArray[j]) {
                min = myArray[j];
            }
        }
        System.out.println("Min of array is : " + min);
    }

    public static void maxOfArray(int[] myArray) {
        int max = myArray[0];
        for (int j = 0; j < myArray.length; j++) {
            if (max < myArray[j]) {
                max = myArray[j];
            }
        }
        System.out.println("Max of array is : " + max);
    }

    public static void additionOfArrElements(int[] myArray) {
        int add = 0;
        for (int i = 0; i < myArray.length; i++) {
            add = add + myArray[i];
        }
        System.out.println("Addition of array elements : " + add);
    }

    public static void sortAscending(int[] myArray) {
        for (int i = myArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int x = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = x;
                }
            }
        }
        printArray(myArray);
    }

    public static void sortDescending(int[] myArray) {
        for (int i = myArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j] < myArray[j + 1]) {
                    int x = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = x;
                }
            }
        }
        printArray(myArray);
    }

    public static void arraySquaring(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.pow(myArray[i], 2);
        }
        printArray(myArray);
    }

    public static void diagonal(String[][] matrix) {
        System.out.print("Diagonal is : ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    public static void duplicateToZero(int[] zeroArray) {
        for (int i = 0; i < zeroArray.length; i++) {
            for (int j = i + 1; j < zeroArray.length; j++) {
                if (zeroArray[i] == zeroArray[j]) {
                    zeroArray[j] = 0;
                }
            }
        }
        printArray(zeroArray);
    }

    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}
