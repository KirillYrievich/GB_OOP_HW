package org.example.lesson5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ComplexView implements Complex, Logs{
    @Override
    public void operations() {
        info("Запущен метод для комплексных чисел");
        System.out.println("Простите, но это слишком сложно для меня");
        System.out.println("Я даже не понимаю как ввести такие числа с клавиатуры");
        System.out.println("Поэтому калькулятор пока не содержит операций для работы с ними :(");
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
