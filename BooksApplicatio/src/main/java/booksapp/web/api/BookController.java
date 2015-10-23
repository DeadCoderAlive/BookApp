package booksapp.web.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import booksapp.model.Book;
import booksapp.service.BookService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.awt.PageAttributes.MediaType;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/")
public class BookController {

	
	@Autowired
	BookService bookservice;
	@RequestMapping(value="/books/allbooks",method=RequestMethod.GET,produces=APPLICATION_JSON_VALUE)
	 public ResponseEntity<List<Book>> getBooks(){
		List<Book>  books = bookservice.findAll();
		return new ResponseEntity<List<Book>>(books,HttpStatus.OK);
		
			
		}
		
		
		 

	
	
	
	
	@RequestMapping(value="/books/{barcode}",method=RequestMethod.GET,produces=APPLICATION_JSON_VALUE)
	 public ResponseEntity<Book> getBook(@PathVariable("barcode") String barcode){
		Book book = bookservice.getBook(barcode);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
		
		
		 
	 }
	 @RequestMapping(value="/books",
			 method=RequestMethod.POST,
			 consumes=APPLICATION_JSON_VALUE,
			 produces=APPLICATION_JSON_VALUE)
	 public ResponseEntity<Book> addBook(@RequestBody Book book){
		 Book savedBook = bookservice.addBook(book);
		return new ResponseEntity<Book>(savedBook,HttpStatus.CREATED);
		 
	 }

	 @RequestMapping(value="books/delete/{barcode}",method=RequestMethod.DELETE)
	 public ResponseEntity<Book> deleteBook(@PathVariable("barcode") String barcode){
		 bookservice.deleteBook(barcode);
		return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
		 
	 }
	 

}
