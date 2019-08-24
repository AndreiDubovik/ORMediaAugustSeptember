package by.ormedia.lesson4;

import java.util.ArrayList;

public class Library {
	
	private java.util.List<Book>books = new ArrayList<>();
	
	public void add(Book book){
		this.books.add(book);
	}
	
	public Book[] getBooks(){
		return (Book[]) this.books.toArray();
	}
	
	
	

}
