package numbers_theory;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x > y && x>z ) {
            System.out.println("largest number:"+x);
        }
        else if (y > x && y>z ) {
            System.out.println("largest number:"+y);
        }
        else {
            System.out.println("largest number:"+z);
        }
    }
}

// enter the number: 7 8 5
// largest number:8