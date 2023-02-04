package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Book book1 = new Book("Anna Tokarska", "Królowa Życia", 1989, "Signed");
        Book book2 = new Book("Andrzej Wajda", "Król Życia", 1955,"Not Signed");
        Book book3 = new Book("Andrzej Sapkowski", "Wiesiek", 1995,"Not Signed");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();
        // When
        int testResult = medianAdapter.publicationYearMedian(bookSet);
        // Then
        assertEquals(1989, testResult);
    }
}
