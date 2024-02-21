package org.example.services.ServicesImpl;

import org.example.model.Books;
import org.example.model.Person;
import org.example.model.PersonComparator;
import org.example.services.LibraryServices;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LibraryServiceImpl implements LibraryServices {

    Queue<Person> orderedUsersQueue;
    PriorityQueue<Person> libraryUsersOnQueue;
    public LibraryServiceImpl(){
        libraryUsersOnQueue = new PriorityQueue<>(new PersonComparator());
        orderedUsersQueue = new LinkedList<>();
    }

    @Override
    public String borrowBook(Books book) {
        if (book.getNumberOfBooks() > 0){
            book.setNumberOfBooks(book.getNumberOfBooks()-1);

            Person person = libraryUsersOnQueue.poll();

            return person.getName() + ", You have successfully borrowed " + book.getBookName();
        } else {

            return book.getBookName() + " is taken";
        }

    }

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
