/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericmethods;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    // Generic method to count the number of odd integers in a list
    public static <T extends Number> int countOddIntegers(List<T> list) {
        int count = 0;
        for (T element : list) {
            if (element.intValue() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Generic method to exchange the positions of two different elements in an array
    public static <T> void exchangeElements(T[] array, int index1, int index2) {
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    // Generic method to find the maximal element in the range [begin, end] of a list
    public static <T extends Comparable<T>> T findMaxInRange(List<T> list, int begin, int end) {
        if (begin < 0 || end >= list.size() || begin > end) {
            throw new IllegalArgumentException("Invalid range");
        }

        T maxElement = list.get(begin);
        for (int i = begin + 1; i <= end; i++) {
            T currentElement = list.get(i);
            if (currentElement.compareTo(maxElement) > 0) {
                maxElement = currentElement;
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Count of odd integers: " + countOddIntegers(integerList));

        String[] stringArray = {"apple", "banana", "cherry"};
        System.out.println("Original array: " + Arrays.toString(stringArray));
        exchangeElements(stringArray, 0, 2);
        System.out.println("Array after exchanging elements: " + Arrays.toString(stringArray));

        List<Double> doubleList = Arrays.asList(1.5, 3.2, 2.7, 4.8, 2.5);
        System.out.println("Max element in the range: " + findMaxInRange(doubleList, 1, 3));
    }
}