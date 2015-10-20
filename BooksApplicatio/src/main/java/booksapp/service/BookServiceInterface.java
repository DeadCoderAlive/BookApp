package booksapp.service;


import java.util.List;

import booksapp.model.Book;

public interface BookServiceInterface {
	Book getBook(String barcode);
	
	List<Book> findAll();
	
	Book addBook(Book book);
	void deleteBook(String barcode);

}
