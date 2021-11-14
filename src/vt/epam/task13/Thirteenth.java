package vt.epam.task13;

import vt.epam.InputScan;
import vt.epam.task13.ProgrammerBook;
import vt.epam.task12.Book;

public class Thirteenth {
    public static void main(String[] args) {
        System.out.println("13. Не пользуясь средствами автогенерации кода переопределить для класса ProgrammerBook методы equals(), hashCode() и toString().");
        Book book1;
        Book book2;


        System.out.print("Enter book edition: ");
        Book.setEdition(InputScan.scanInt());

        try {

            System.out.println("Set information about first book");
            book1 = InputScan.setInformationAboutBook();
            System.out.print("Enter book language: ");
            String language = InputScan.inputString();
            System.out.print("Enter book level: ");
            int level = InputScan.scanInt();
            book1 = new ProgrammerBook(book1, language, level);

            System.out.println("Set information about second book");
            book2 = InputScan.setInformationAboutBook();
            System.out.print("Enter book language: ");
            String language1 = InputScan.inputString();
            System.out.print("Enter book level: ");
            int level1 = InputScan.scanInt();
            book2 = new ProgrammerBook(book2, language1, level1);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Information about first book " + book1.toString());
        System.out.println("Information about second book " + book2.toString());
        System.out.println("Books hash codes:");
        System.out.println("Book 1 hashCode: " + book1.hashCode());
        System.out.println("Book 2 hashCode: " + book2.hashCode());

        System.out.println("Are books equal? " + book1.equals(book2));
    }
}
