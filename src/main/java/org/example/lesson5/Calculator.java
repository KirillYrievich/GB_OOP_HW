package org.example.lesson5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Calculator<T> implements Menu, Logs {
    @Override
    public void choiceNumber(Scanner scanner) {
        info("Программа запущена");
        System.out.println("Выберите рациональные или комплексные числа: ");
        System.out.println("1 - рациональные ");
        System.out.println("2 - комплексные ");

        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:
                info("Выбран кейс 1");
                System.out.println("Вы выбрали работу с рациональными числами");
                RationalView rationalView = new RationalView();
                choiceOperation(scanner, rationalView);
                break;
            case 2:
                info("Выбран кейс 2");
                System.out.println("Вы выбрали работу с комплексными числами");
                ComplexView complexView = new ComplexView();
                complexView.operations();
                break;
            default:
                warning("Выбран default, программа завершает работу");
                System.out.println("Such calculator doesn't exist!");
                break;
        }
    }

    @Override
    public void choiceOperation(Scanner scanner, RationalView rationalView) {
        info("Запущен метод выбора операции");
        System.out.println("Введите рациональное число: ");
        String num1 = scanner.next();
        System.out.println("Выберите операцию: ");
        System.out.println("1 - сложение ");
        System.out.println("2 - вычитание ");
        System.out.println("3 - умножение ");
        System.out.println("4 - деление  ");

        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:
                info("Выбран кейс 1");
                System.out.println("Введите рациональное число для сложения: ");
                rationalView.summa(num1, scanner);
                break;
            case 2:
                info("Выбран кейс 2");
                System.out.println("Введите рациональное число для разности: ");
                rationalView.difference(num1, scanner);
                break;
            case 3:
                info("Выбран кейс 3");
                System.out.println("Введите рациональное число для умножения: ");
                rationalView.multiply(num1, scanner);
                break;
            case 4:
                info("Выбран кейс 4");
                System.out.println("Введите рациональное число для деления: ");
                rationalView.division(num1, scanner);
                break;
            default:
                warning("Выбран default, программа завершает работу");
                System.out.println("Такой операции еще не добавлено, наберитесь терпения :)");
                break;
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
