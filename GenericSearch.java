/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericsearch;
public class GenericSearch {

    // Generic function to search for an element in an array
    public static <T> boolean searchElement(T[] array, T element) {
        for (T item : array) {
            if (item.equals(element)) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }

    public static void main(String[] args) {
        // Example with an array of integers
        Integer[] intArray = {1, 2, 3, 4, 5};
        int searchInt = 3;

        if (searchElement(intArray, searchInt)) {
            System.out.println("Element " + searchInt + " found in the array.");
        } else {
            System.out.println("Element " + searchInt + " not found in the array.");
        }

        // Example with an array of strings
        String[] strArray = {"apple", "banana", "orange", "grape"};
        String searchString = "orange";

        if (searchElement(strArray, searchString)) {
            System.out.println("Element " + searchString + " found in the array.");
        } else {
            System.out.println("Element " + searchString + " not found in the array.");
        }
    }
}


