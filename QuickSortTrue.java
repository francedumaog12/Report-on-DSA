/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksorttrue;

import static quicksorttrue.QuickSort.printArray;
import static quicksorttrue.QuickSort.quickSort;

/**
 *
 * @author FRANCE DUMAOG
 */
public class QuickSortTrue {

    /**
     * @param args the command line arguments
     */
   // Main method
    public static void main(String[] args) {
        int[] data = { 33, 10, 55, 71, 29, 3, 18 };

        System.out.println("Original Array:");
        printArray(data);

        quickSort(data, 0, data.length - 1);

        System.out.println("Sorted Array:");
        printArray(data);
    }
}
