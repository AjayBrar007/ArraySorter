package com.array;
import java.util.Arrays;

public class ArraySorter {

    // Method to sort an array of integers in ascending order
    public static int[] sortIntegers(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    // Method to sort an array of strings in alphabetical order
    public static String[] sortStrings(String[] words) {
        Arrays.sort(words);
        return words;
    }
// Hello This is the change
    public static void main(String[] args) {
        // Example usage of integer sorting
        int[] integers = {5, 3, 8, 1, 2};
        System.out.println("Original integer array: " + Arrays.toString(integers));
        int[] sortedIntegers = sortIntegers(integers);
        System.out.println("Sorted integer array: " + Arrays.toString(sortedIntegers));

        // Example usage of string sorting
        String[] strings = {"banana", "apple", "cherry", "date"};
        System.out.println("Original string array: " + Arrays.toString(strings));
        String[] sortedStrings = sortStrings(strings);
        System.out.println("Sorted string array: " + Arrays.toString(sortedStrings));
    }
}
