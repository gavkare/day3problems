package day3problems;
public class SmallestElet {
        public static void main(String[] args) {
            int[] numbers = {5, 10, 3, 7, 2, 15, 12};

            int smallest = numbers[0]; // Assume the first element is the smallest

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < smallest) {
                    smallest = numbers[i];
                }
            }
            System.out.println("The smallest element in the array is: " + smallest);
        }
    }

