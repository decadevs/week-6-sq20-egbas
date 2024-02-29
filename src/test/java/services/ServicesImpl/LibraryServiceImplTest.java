package services.ServicesImpl;

import org.example.model.Books;
import org.example.model.Person;
import org.example.services.ServicesImpl.LibraryServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {

    private LibraryServiceImpl libraryService;
    private Books book;

    @BeforeEach
    public void setUp() {
        libraryService = new LibraryServiceImpl();
        book = new Books("Book1", "jake", 1, 2);
    }

//    @Test
//    public void testBorrowBook() {
//        Person person1 = new Person("Alice", 201, false, false, true);
//        Person person2 = new Person("Bob", 303, false, true, false);
//        Person person3 = new Person("jake", 102, true, false, false);
//        Person person4 = new Person("jake", 102, true, false, false);
//
//        libraryService.readersOnQueue(person1);
//        libraryService.readersOnQueue(person2);
//        libraryService.readersOnQueue(person3);
//        libraryService.readersOnQueue(person4);
//
//
//        assertEquals("Alice, You have successfully borrowed Book1", libraryService.borrowBook(book));
//        assertEquals("Bob, You have successfully borrowed Book1", libraryService.borrowBook(book));
//        assertEquals("Book1 is taken", libraryService.borrowBook(book));
//
//        assertEquals("Book1 is taken", libraryService.borrowBook(book), "Borrowing when the book is taken");
//
//        // Test borrowing when the queue is empty
//        libraryService = new LibraryServiceImpl();
//        assertEquals("Book1 is taken", libraryService.borrowBook(book), "Borrowing when the queue is empty");
//
//    }

    @org.junit.jupiter.api.Test
    void borrowAvailableBook() {

        Books books = new Books("flint", "jeff", 101, 3);
        Person person = new Person("jake", 102, true, false, false);

        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.readersOnQueue(person);

        String actual = libraryService.borrowBook(books);
        String expected = "";

        assertEquals(expected, actual);
    }

//    @org.junit.jupiter.api.Test
//    void bookNotAvailable() {
//
//        Books books = new Books("flint", "jeff", 101, 0);
//        Person person = new Person("jake", 102, true, false, false);
//
//        LibraryServiceImpl libraryService = new LibraryServiceImpl();
//        libraryService.readersOnQueue(person);
//
//        String actual = libraryService.borrowBook(books);
//        String expected = "flint is taken";
//
//        assertEquals(expected, actual);
//    }

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