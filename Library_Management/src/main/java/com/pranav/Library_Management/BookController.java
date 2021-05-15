package com.pranav.Library_Management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/getBooks")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	@GetMapping("/getBook/{id}")
	public Book getBook(@PathVariable int id)
	{
		return bookService.getBook(id);
	}
	
	@PostMapping("/saveBook")
	public void saveBook(@RequestBody Book book)
	{
		bookService.createNewBook(book);
	}

}
