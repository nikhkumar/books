package com.mybook.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mybook.books.model.Book;
import com.mybook.books.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/book")
	private List<Book> getAllStudent() {
		return bookService.getAllBooks();
	}

	@GetMapping("/book/{id}")
	private Book getBook(@PathVariable("isbn") int isbn) {
		return bookService.getBookById(isbn);
	}

	@DeleteMapping("/book/{id}")
	private void deleteBook(@PathVariable("isbn") int isbn) {
		bookService.deleteBook(isbn);
	}

	@PostMapping("book")
	private void createBook(@RequestBody Book book) {
		bookService.createBook(book);
	}

	@PutMapping("book")
	private void updateBook(@RequestBody Book book) {
		bookService.updateBook(book);
	}

}
