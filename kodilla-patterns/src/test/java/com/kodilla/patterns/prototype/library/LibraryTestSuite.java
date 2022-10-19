package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        // Given
        Library library = new Library("Test Library");

        Book book1 = new Book("ABC", "Leonardo", LocalDate.of(1992, 2, 15));
        Book book2 = new Book("DEF", "Raphael", LocalDate.of(1995, 2, 12));
        Book book3 = new Book("GHJ", "Michelangelo", LocalDate.of(1996, 1, 15));
        Book book4 = new Book("WXZ", "Donatello", LocalDate.of(1998, 4, 23));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Shallow Copy");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Copy");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        library.getBooks().remove(book3);

        System.out.println(library.getBooks().toString());
        System.out.println(library.getName());
        System.out.println(shallowClonedLibrary.getBooks().toString());
        System.out.println(shallowClonedLibrary.getName());
        System.out.println(deepClonedLibrary.getBooks().toString());
        System.out.println(deepClonedLibrary.getName());
        assertEquals(3, library.getBooks().size());
        assertEquals(3,shallowClonedLibrary.getBooks().size());
        assertEquals(4,deepClonedLibrary.getBooks().size());
        assertEquals(library.getBooks(),shallowClonedLibrary.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), shallowClonedLibrary.getBooks());


    }
}
