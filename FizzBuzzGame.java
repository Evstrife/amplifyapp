/**
 file: FizzBuzzGame.java
 description: Teach division
 author: CSC 111 Instructor
 date: February 2, 2020
 acknowledgements: Jinku Cui
 */

import java.util.Scanner;

public class FizzBuzzGame {
    public static void main(String[] args) {
        System.out.println("Fizz Buzz Game =============");
        System.out.println();
        System.out.print("Input three integers: ");
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int N = scanner.nextInt();

        int counter = 1;
        while (counter <= N) {
            int a = counter % X;
            int b = counter % Y;
            if (0 == a && 0 == b) System.out.println("FizzBuzz");
            else if (0 == a) System.out.println("Fizz");
            else if (0 == b) System.out.println("Buzz");
            else System.out.println(counter);
            counter++;
        }
    }
    //test cases:
    // 4 6 12
}
