package day3problems;

public class EvenPosition {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.println("Elements at even positions:");

            for (int i = 0; i < numbers.length; i += 2) {
                System.out.println(numbers[i]);
            }
        }
    }


