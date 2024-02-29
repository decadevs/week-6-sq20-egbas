package org.example.services.ServicesImpl;

import org.example.exceptionHandling.SchoolLibException;
import org.example.model.Books;
import org.example.model.Person;
import org.example.services.LibraryServices;

import java.util.*;

public class LibraryServiceImpl implements LibraryServices {

    Queue<Person> orderedUsersQueue;
    PriorityQueue<Person> libraryUsersOnQueue;
    public LibraryServiceImpl(){
        Comparator<Person> personComparator = (p1,p2) -> Integer.compare(p1.getID(), p2.getID());
        libraryUsersOnQueue = new PriorityQueue<>(personComparator);
        orderedUsersQueue = new LinkedList<>();

    }

    @Override
    public String borrowBook(Books book) {
//        libraryUsersOnQueue.stream()
//                .filter(person -> book.getNumberOfBooks() > 0)
//                .findFirst()
//                .ifPresentOrElse(
//                        person -> {
//                            book.setNumberOfBooks(book.getNumberOfBooks() - 1);
//                            System.out.println(person.getName() + ", You have successfully borrowed " + book.getBookName());
//                        },
//                        () -> {
//                            String result = book.getBookName() + " is taken";
//                            System.out.println(result);
//                        }
//                );
        libraryUsersOnQueue.forEach(person -> {
            if (book.getNumberOfBooks() > 0) {
                book.setNumberOfBooks(book.getNumberOfBooks() - 1);
                System.out.println(person.getName() + ", You have successfully borrowed " + book.getBookName());

            } else {

                throw new SchoolLibException("Book is no longer available");

            }
        });
        return "";
//        return null;
    }


//    public String borrowBook(Books book) {
//        while (!libraryUsersOnQueue.isEmpty()) {
//            if (book.getNumberOfBooks() > 0){
//                book.setNumberOfBooks(book.getNumberOfBooks()-1);
//
//                Person person = libraryUsersOnQueue.poll();
//
//                System.out.println(person.getName() + ", You have successfully borrowed " + book.getBookName());
//            }
//            else {
//
//                return book.getBookName() + " is taken";
//            }
//        }
//
//        return "";
//
//
//    }

    @Override
    public String borrowBookInOrder(Books book) {
        if (book.getNumberOfBooks() > 0){
            book.setNumberOfBooks(book.getNumberOfBooks()-1);

            Person person = orderedUsersQueue.poll();

            return person.getName() + ", You have successfully borrowed " + book.getBookName();
        } else {

            return book.getBookName() + " is taken";
        }
    }

    @Override
    public String returnBook(Books book) {
            book.setNumberOfBooks(book.getNumberOfBooks()+1);

            return "You have successfully returned " + book.getBookName();


    }

    @Override
    public void readersOnQueue(Person person) {

        libraryUsersOnQueue.add(person);

        orderedUsersQueue.add(person);


    }
}
