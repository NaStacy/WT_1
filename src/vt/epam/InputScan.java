package vt.epam;

import java.util.Scanner;
import vt.epam.task12.Book;

public class InputScan {
    private static Scanner in = new Scanner(System.in);

    public static double scanDouble() {
        while (!in.hasNextDouble()) {
            in.next();
        }
        return in.nextDouble();
    }

    public static int scanInt() {
        while (!in.hasNextInt()) {
            in.next();
        }
        return in.nextInt();
    }

    public static double[] scanDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            while (!in.hasNextInt()) {
                in.next();
            }
            array[i] = in.nextInt();
        }
        return array;
    }

    public static int[] scanIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            while (!in.hasNextInt()) {
                in.next();
            }
            array[i] = in.nextInt();
        }
        return array;
    }

    public static int[][] scanIntMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                while (!in.hasNextInt()) {
                    in.next();
                }
            }
        }
        return matrix;
    }

    public static String inputString() {
        String result;

        do {
            result = in.nextLine();
        } while (result.isEmpty());

        return result;
    }
    public  static Book setInformationAboutBook() {

        String author;
        String title;
        int price;
        String isbn;

        System.out.print("Enter book title: ");
        title = InputScan.inputString();
        System.out.print("Enter book author: ");
        author = InputScan.inputString();
        System.out.print("Enter book price: ");
        price = InputScan.scanInt();
        System.out.print("Enter book ISBN: ");
        isbn = InputScan.inputString();

        return new Book(title, author, price, isbn);
    }
}
