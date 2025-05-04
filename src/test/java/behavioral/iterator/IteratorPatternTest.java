package behavioral.iterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPatternTest {

    @Test
    @DisplayName("Should iterate over all books in the library")
    public void shouldIterateOverAllBooksInLibrary() {
        Book aBook = new Book("A book");
        Book bBook = new Book("B book");
        Book cBook = new Book("C book");
        List<Book> expectedBooks = Arrays.asList(aBook, bBook, cBook);

        Library library = new Library();
        expectedBooks.forEach(library::addBook);

        Iterator<Book> it = library.iterator();
        int count = 0;
        while (it.hasNext()) {
            Book next = it.next();
            assertEquals(expectedBooks.get(count).title(), next.title());
            count++;
        }
        assertEquals(expectedBooks.size(), count);
    }
}
