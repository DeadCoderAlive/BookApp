package booksapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Book")
public class Book {
	@Id
	@Column(name="barcode")
	private String barcode;
	@Column(name="title")
	private String title;
	@Column(name="author")
	private String author;
	@Column(name="pages")
	private String pages;
	@Column(name="readbook")
	private String readbook;

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getReadbook() {
		return readbook;
	}
	public void setReadbook(String readbook) {
		this.readbook = readbook;
	}
	public String getBarcode() {
		// TODO Auto-generated method stub
		return barcode;
	}

	
	

}
