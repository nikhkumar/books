package com.mybook.books.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybook.books.entity.BookEntity;
import com.mybook.books.model.Book;
import com.mybook.books.repository.BookRepository;
import com.mybook.books.util.BookConverter;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	@Autowired
	BookConverter bookConverter;

	public List<Book> getAllBooks() {

		System.out.println("In service class");
		
	System.out.println(bookRepository.findAll());
		
		return bookConverter.createFromEntities(bookRepository.findAll());
	}

	public Book getBookById(int isbn) {
		
		Optional<BookEntity> bookEntity = bookRepository.findById(isbn);
		return(bookEntity.isPresent() ? 
			 bookConverter.createFrom(bookEntity.get()) : new Book());
	}

	public void deleteBook(int isbn) {
		// TODO Auto-generated method stub

	}

	public void createBook(Book book) {
		// TODO Auto-generated method stub

	}

	public void updateBook(Book book) {
		// TODO Auto-generated method stub

	}

}
