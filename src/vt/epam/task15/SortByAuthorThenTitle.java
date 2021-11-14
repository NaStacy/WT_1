package vt.epam.task15;

import java.util.Comparator;
import vt.epam.task12.Book;

public class SortByAuthorThenTitle implements Comparator<Book> {

	Comparator<Book> comparator;
	
	public SortByAuthorThenTitle(){
		
		comparator = new SortByAuthor().thenComparing(new SortByTitle());
	}
	
	 public int compare(Book book1, Book book2) {
	        if ((book1 == null) || (book2 == null)) {
	            throw new IllegalArgumentException("Both books shouldn't be null");
	        }

	        return comparator.compare(book1, book2);
	    }
	
}
