package day3problems;

public class LargestNo {

        public static void main(String[] args) {
            int[] numbers = {5, 10, 3, 7, 2, 15, 12};

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    secondLargest = largest;
                    largest = numbers[i];
                } else if (numbers[i] > secondLargest && numbers[i] < largest) {
                    secondLargest = numbers[i];
                }
            }

            if (secondLargest != Integer.MIN_VALUE) {
                System.out.println("The second largest number is: " + secondLargest);
            } else {
                System.out.println("There is no second largest number in the array.");
            }
        }
    }


