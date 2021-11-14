package vt.epam.task12;

import vt.epam.InputScan;
import vt.epam.task12.Book;
import vt.epam.task13.ProgrammerBook;

public class Twelfth {
    public static void main(String[] args) {
        System.out.println("12. Не пользуясь средствами автогенерации кода переопределить для класса Book методы equals(), hashCode() и toString()\n" +
        "13. Не пользуясь средствами автогенерации кода переопределить для класса Book из задачи 12 метод clone()");


        Book book1;
        Book book2;


        System.out.print("\nEnter book edition: ");
        Book.setEdition(InputScan.scanInt());

        System.out.println("Set information about first book");
        book1 = InputScan.setInformationAboutBook();

        System.out.println("Set information about second book");
        book2 = InputScan.setInformationAboutBook();

        Book bookClone = book1.clone();
        System.out.println(bookClone.toString());

        System.out.println("Information about first book " + book1.toString());
        System.out.println("Information about second book " + book2.toString());
        System.out.println("Books hash codes:");
        System.out.println("Book 1 hashCode: " + book1.hashCode());
        System.out.println("Book 2 hashCode: " + book2.hashCode());

        System.out.println("Are books equal? " + book1.equals(book2));

        System.out.println("Compare books: " + book1.compareTo(book2));

    }
}
