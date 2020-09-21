package com.mybook.books.model;

public class Book {

	private Integer isbn;
	private String title;
	private String publishYear;
	private String genere;
	private Integer author;

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(String publishYear) {
		this.publishYear = publishYear;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Integer getAuthor() {
		return author;
	}

	public void setAuthor(Integer author) {
		this.author = author;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", publishYear=" + publishYear + ", genere=" + genere
				+ ", author=" + author + "]";
	}

}
