package org.example.lesson7;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ComplexNumber complex1;
        ComplexNumber complex2;
        ComplexNumber complex3;
        float a;
        float b;
        int choice = 0;
        System.out.println("\nКалькулятор комплексных чисел");
        while(choice != 4){
            System.out.println("\nВыберите действие:");
            System.out.println("1: Сложить");
            System.out.println("2: Умножить");
            System.out.println("3: Поделить");
            System.out.println("4: Выйти\n");
            choice = input.nextInt();
            if(choice == 1){
                System.out.println("\nФормула: (a + bi) + (c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("Введите b:");
                b = input.nextFloat();
                complex1 = new Add(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("Введите d:");
                b = input.nextFloat();
                complex2 = new Add(a, b);
                complex3 =  ((Add) complex1).add(complex2);
                System.out.println("Ответ: " + complex3.toString());
            }
            if(choice == 2){
                System.out.println("\nФормула: (a + bi)(c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("Введите b:");
                b = input.nextFloat();
                complex1 = new Multiply(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("Введите d:");
                b = input.nextFloat();
                complex2 = new Multiply(a, b);
                complex3 = ((Multiply) complex1).multiply(complex2);
                System.out.println("Ответ: " + complex3.toString());
            }
            //Division
            if(choice == 3){
                System.out.println("\nФормула: (a + bi)/(c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("Введите b:");
                b = input.nextFloat();
                complex1 = new Divide(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("Введите d:");
                b = input.nextFloat();
                complex2 = new Divide(a, b);
                complex3 = ((Divide) complex1).divide(complex2);
                System.out.println("Ответ: " + complex3.toString());
            }
        }
    }
}
