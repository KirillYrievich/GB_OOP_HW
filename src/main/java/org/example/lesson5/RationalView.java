package org.example.lesson5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RationalView implements Rational, Logs {

    @Override
    public Double checkNumbers(String num) {
        info("Запущена проверка на принадлежность к рациональным числам");
        try {
            return Double.parseDouble(num);
        } catch (NumberFormatException e) {
            warning("Проверка не пройдена");
            System.out.println("С таким числом нельзя провести операции, " +
                    "конечно, если вы ввели число и ввели его верно..");
            return null;
        }
    }

    @Override
    public void summa(String num1, Scanner scanner) {
        info("Запущен метод сложения чисел");
        String num2 = scanner.next();
        if (checkNumbers(num1) != null && checkNumbers(num2) != null) {
            Double sum = checkNumbers(num1) + checkNumbers(num2);
            System.out.println();
            System.out.println(num1 + " + " + num2 + " = " + sum);
        }
    }

    @Override
    public void difference(String num1, Scanner scanner) {
        info("Запущен метод разности чисел");
        String num2 = scanner.next();
        if (checkNumbers(num1) != null && checkNumbers(num2) != null) {
            Double sum = checkNumbers(num1) - checkNumbers(num2);
            System.out.println();
            System.out.println(num1 + " - " + num2 + " = " + sum);
        }
    }

    @Override
    public void multiply(String num1, Scanner scanner) {
        info("Запущен метод произведения чисел");
        String num2 = scanner.next();
        if (checkNumbers(num1) != null && checkNumbers(num2) != null) {
            Double sum = checkNumbers(num1) * checkNumbers(num2);
            System.out.println();
            System.out.println(num1 + " * " + num2 + " = " + sum);
        }
    }

    @Override
    public void division(String num1, Scanner scanner) {
        info("Запущен метод деления чисел");
        String num2 = scanner.next();
        if (checkNumbers(num1) != null && checkNumbers(num2) != null) {
            if (checkNumbers(num2) != 0) {
                Double sum = checkNumbers(num1) / checkNumbers(num2);
                System.out.println();
                System.out.println(num1 + " / " + num2 + " = " + sum);
            } else {
                warning("деление на ноль");
                System.out.println("на ноль делить нельзя!!");
            }
        }
    }

    @Override
    public void info(String message) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));
        System.out.println("log.info: " + message);
    }

    @Override
    public void warning(String message) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));
        System.out.println("log.WARNING: " + message);
    }
}
