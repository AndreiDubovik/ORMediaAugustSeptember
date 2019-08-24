package by.ormedia.lesson4;

import java.time.Year;

public abstract class Book implements ILibraryItem{
	
	private final String finalField = "hgfjhfjhg";
	private String name;
	private String[] author;
	private String[] subjects;
	private Year year;
	private String number;
	public String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public String[] getAuthor() {
		return author;
	}
	public void setAuthor(String[] author) {
		this.author = author;
	}
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public abstract void read();

}
