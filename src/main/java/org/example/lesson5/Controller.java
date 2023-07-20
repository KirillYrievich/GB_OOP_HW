package org.example.lesson5;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.choiceNumber(scanner);

        scanner.close();
    }
}