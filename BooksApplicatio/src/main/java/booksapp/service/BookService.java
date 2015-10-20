package booksapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import booksapp.model.Book;
import booksapp.repository.BookRepository;
@Service
public class BookService implements BookServiceInterface {

	
	@Autowired
	BookRepository bookrepository;
	@Override
	public Book getBook(String barcode) {
		Book book = bookrepository.getOne(barcode);
		return book;
	}

	@Override
	public List<Book> findAll() {
		List<Book> books = bookrepository.findAll();
		return books;
	}

	

	@Override
	public Book addBook(Book book) {
		if (book.getBarcode() != null) {
			return null;
		}
		Book savedBook = bookrepository.save(book);
		return savedBook;
	}

	@Override
	public void deleteBook(String barcode) {
		bookrepository.delete(barcode);
		
	}

}
