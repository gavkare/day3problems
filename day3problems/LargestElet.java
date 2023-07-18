package day3problems;

public class LargestElet {

        public static void main(String[] args) {
            int[] numbers = {5, 10, 3, 7, 2, 15, 12};

            int largest = numbers[0]; // Assume the first element is the largest

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }

            System.out.println("The largest element in the array is: " + largest);
        }
    }


