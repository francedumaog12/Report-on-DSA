/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quicksorttrue;

/**
 *
 * @author FRANCE DUMAOG
 */
public class QuickSort {
//    int[] array;
//    int lowIndex;
//    int highIndex;
     public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            // Partition the array and get the pivot index
            int pi = partition(arr, lowIndex, highIndex);

            // Recursively sort elements before and after partition
            quickSort(arr, lowIndex, pi - 1);
            quickSort(arr, pi + 1, highIndex);
        }
    }
    public static int partition(int[] arr, int lowIndex, int highIndex) {
        int pivot = arr[highIndex]; // Choosing the last element as pivot
        int i = (lowIndex - 1); // Index of smaller element

        for (int j = lowIndex; j < highIndex; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[highIndex] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[highIndex];
        arr[highIndex] = temp;

        return i + 1;
    }
    // Method to print array
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
    

