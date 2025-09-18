import java.util.ArrayList;
import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu {
    public static void main(String[] args) {
        ArrayList<Integer> fizz = new ArrayList<>();
        ArrayList<Integer> buzz = new ArrayList<>();


        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                fizz.add(i);
            }
                if (i % 5 == 0) {
                    buzz.add(i);
                }
        }
            ArrayList<Integer> fizzbuzz = new ArrayList<>(fizz);
            fizzbuzz.retainAll(buzz); // common elements between both lists
        /*
        if any number is in the set of numbers divisible by both three and the sets of numbers divisible by
        five, then they are divisible by both 3 and five
         */

            Scanner scan = new Scanner(System.in);
            System.out.println("---FizzBuzz Menu---");
            System.out.println("1. Fizz (Multiples of 3)\n2. Buzz (Multiples of 5)\n3. FizzBuzz (Multiples of 3 and 5)");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    for (int val : fizz) {
                        System.out.print(val + " ");
                    }
                    break;
                case 2:
                    for (int val : buzz) {
                        System.out.print(val + " ");
                    }
                    break;
                case 3:
                    for (int val : fizzbuzz) {
                        System.out.print(val + " ");
                    }
            }


        }
    }