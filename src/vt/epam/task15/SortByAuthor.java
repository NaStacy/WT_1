package vt.epam.task15;

import java.util.Comparator;
import vt.epam.task12.Book;

public class SortByAuthor implements Comparator<Book> {
	
	@Override
    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("Both books shouldn't be null");
        }

        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
