package vt.epam.task9;

import java.awt.*;


public class Ninth {
    public static void main(String[] args) {
        System.out.println("9. Создать класс Мяч. Создать класс Корзина. Наполнить корзину мячиками. Определить вес \n" +
                "мячиков в корзине и количество синих мячиков");
        Basket basket = new Basket();
        basket.addBall(new Ball(Color.BLUE, 7));
        basket.addBall(new Ball(Color.BLACK, 1));
        basket.addBall(new Ball(Color.RED, 12));
        basket.addBall(new Ball(Color.WHITE, 20));
        basket.addBall(new Ball(Color.BLUE, 4));

        System.out.println("Общий вес: " + basket.getWeight());
        System.out.println("Количество синих шариков: " + (long) basket.getCountByColor(Color.BLUE));
    }
}


// task10 "Скомпилировать и запустить приложение, созданное при решении задачи 9 из командной строки"
// cd ..\srt\vt\epam\task9
// javac Ninth.java

// task11 "Создать запускной jar-файл и запустить приложение, созданное при решении задачи 9-ть"
// cd /binTask9
// jar cfe task9.jar vt.epam.task9.Ninth .
// java -jar task9.jar
