package day3problems;

import java.util.Arrays;

    public class ArraySort {
        public static void main(String[] args) {
            int[] numbers = {5, 10, 3, 7, 2, 15, 12};

            System.out.println("Original array: " + Arrays.toString(numbers));

            Arrays.sort(numbers);

            System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
        }
    }

