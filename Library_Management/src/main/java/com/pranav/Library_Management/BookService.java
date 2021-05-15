package com.pranav.Library_Management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	
	public void createNewBook(Book book)
	{
		bookRepo.save(book);
		
	}
	
	public List<Book> getAllBooks()
	{
		return bookRepo.findAll();
	}
	
	public Book getBook(int id)
	{
		return bookRepo.findById(id).orElse(null);
		
	}
	

}
