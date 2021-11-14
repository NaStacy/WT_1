package vt.epam.task13;

import vt.epam.task12.Book;

public class ProgrammerBook extends Book {

    private final String language;
    private final int level;

    public ProgrammerBook(Book book, String language, int level) {
        super(book.getTitle(), book.getAuthor(), book.getPrice(), book.getIsbn());
        this.language = language;
        this.level = level;
    }

    public boolean equals(Object object) {
        ProgrammerBook programmerBook;

        if (object == this) {
            return true;
        }
        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }

        programmerBook = (ProgrammerBook) object;
        return super.equals(object) && language.equals(programmerBook.language) && (programmerBook.level == level);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + super.hashCode();
        result = prime * result + level;
        return result;

    }


    @Override
    public String toString() {
        return super.toString() + "; language: " + language + "; level: " + level;
    }
}

