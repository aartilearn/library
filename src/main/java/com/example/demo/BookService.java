package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	private BookRepository bookrepository;

	public Book save(Book book) {
		Book book1=(Book) bookrepository.save(book);
		return book1;
		
	}

public List<Book> search(String category) {
	System.out.print("in service");
    List<Book> books=new ArrayList<>();
   List<Book> list_book= bookrepository.findByCategory(category);
   System.out.print("size is"+list_book.size());
   for(Book book:list_book)
   {
	   System.out.print("book is");
	   System.out.print(book.toString());
	   books.add(book);
   }
    return books;
		
	}


public Book update(Book book)
{
	Book book1= bookrepository.save(book);
	return book1;
}


public Book findBook(int price) {
	Book book1=bookrepository.findByPriceOrderByCategory(price);
	return book1;
}

public List<Book> getGreaterThanQuery(int price) {
    List<Book> books=new ArrayList<>();
   List<Book> list_book= bookrepository.findByPriceGretaerThan(price);
   System.out.print("size is"+list_book.size());
   for(Book book:list_book)
   {
	   System.out.print("book is");
	   System.out.print(book.toString());
	   books.add(book);
   }
    return books;
}





}
