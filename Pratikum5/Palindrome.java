package Pratikum5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata untuk dicek: ");
        String input = scanner.nextLine();

        TextGame game1 = new TextGame();
        game1.displayResult(input);

        System.out.println();

        TextGame game2 = new FancyTextGame();
        game2.displayResult(input);

        scanner.close();
    }
}
