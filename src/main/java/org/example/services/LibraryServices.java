package org.example.services;

import org.example.model.Books;
import org.example.model.Person;

public interface LibraryServices {

    public String borrowBook(Books book);

    public String borrowBookInOrder(Books book);
    public String returnBook(Books book);
    public void readersOnQueue(Person person);

}
