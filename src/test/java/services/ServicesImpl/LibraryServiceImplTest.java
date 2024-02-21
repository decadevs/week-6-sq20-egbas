package services.ServicesImpl;

import org.example.model.Books;
import org.example.model.Person;
import org.example.services.ServicesImpl.LibraryServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {

    @org.junit.jupiter.api.Test
    void borrowAvailableBook() {

        Books books = new Books("flint", "jeff", 101, 3);
        Person person = new Person("jake", 102, true, false, false);

        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.readersOnQueue(person);

        String actual = libraryService.borrowBook(books);
        String expected = "jake, You have successfully borrowed flint";

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void bookNotAvailable() {

        Books books = new Books("flint", "jeff", 101, 0);
        Person person = new Person("jake", 102, true, false, false);

        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.readersOnQueue(person);

        String actual = libraryService.borrowBook(books);
        String expected = "flint is taken";

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void borrowAvailableBookInOrder() {

        Books books = new Books("flint", "jeff", 101, 3);
        Person person = new Person("jake", 102, true, false, false);

        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.readersOnQueue(person);

        String actual = libraryService.borrowBookInOrder(books);
        String expected = "jake, You have successfully borrowed flint";

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void bookNotAvailableInOrder() {

        Books books = new Books("flint", "jeff", 101, 0);
        Person person = new Person("jake", 102, true, false, false);

        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.readersOnQueue(person);

        String actual = libraryService.borrowBookInOrder(books);
        String expected = "flint is taken";

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void returnBook() {
        Books books = new Books("flint", "jeff", 101, 0);

        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.returnBook(books);

        String actual = libraryService.returnBook(books);
        String expected = "You have successfully returned flint";

        assertEquals(expected, actual);
    }
}