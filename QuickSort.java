/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

import java.util.Random;

/**
 *
 * @author FRANCE DUMAOG
 */
public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];//{1, 9, 8,2,7,1,3,6};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10); // 0 to 9
        }

        System.out.println("Before: ");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter: ");
        printArray(numbers);
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer <= rightPointer) {
            while (leftPointer <= rightPointer && array[leftPointer] <= pivot) {
                leftPointer++;
            }
            while (leftPointer <= rightPointer && array[rightPointer] >= pivot) {
                rightPointer--;
            }

            if (leftPointer < rightPointer) {
                swap(array, leftPointer, rightPointer);
            }
        }

        // Swap pivot into correct position
        swap(array, leftPointer, highIndex);

        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);
    }

    private static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
