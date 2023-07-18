package day3problems;
import java.util.HashSet;
public class Duplicate {


        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 1, 2, 5, 6, 3, 7};

            HashSet<Integer> duplicates = new HashSet<>();
            System.out.println("Duplicate elements in the array:");

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        duplicates.add(numbers[i]);
                    }
                }
            }

            for (int duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }
    }


