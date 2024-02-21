package org.example;

import org.example.model.Books;
import org.example.model.Person;
import org.example.services.ServicesImpl.LibraryServiceImpl;

public class Main {

    public static void main(String[] args) {
//        List<Person> libUsers = new ArrayList<>();
        Person p1 = new Person("Emma", 010, true, false, false);
        Person p2 = new Person("Rose", 011, false, true, false);
        Person p3 = new Person("Eva", 012, false, true, false);
        Person p4 = new Person("Sani", 013, false, false, true);
        Person p5 = new Person("Isioma", 014, true, false, false);

        Books book1 = new Books("C#", "Dami", 001, 1);
        Books book2 = new Books("Java", "Segun", 002, 3);
        Books book3 = new Books("Pyhton", "James", 003, 3);
        Books book4 = new Books("Ruby", "Joe", 004, 3);
        Books book5 = new Books("Swift", "Jay", 005, 0);
        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        libraryService.readersOnQueue(p3);
        libraryService.readersOnQueue(p2);
        libraryService.readersOnQueue(p1);
        libraryService.readersOnQueue(p4);
        libraryService.readersOnQueue(p5);

//
//        System.out.println(libraryService.borrowBook(book1));
//        System.out.println(libraryService.borrowBook(book2));
//        System.out.println(libraryService.borrowBook(book4));
//        System.out.println(libraryService.borrowBook(book5));
//        System.out.println(libraryService.borrowBook(book3));
//        System.out.println(libraryService.borrowBook(book1));
        System.out.println(libraryService.borrowBookInOrder(book1));
        System.out.println(libraryService.borrowBookInOrder(book2));
        System.out.println(libraryService.borrowBookInOrder(book4));
        System.out.println(libraryService.borrowBookInOrder(book5));
        System.out.println(libraryService.borrowBookInOrder(book3));
        System.out.println(libraryService.borrowBookInOrder(book1));

    }
}
