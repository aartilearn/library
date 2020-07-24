package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/book")
public class BookController {

@Autowired
private BookService bookservice;

@PostMapping("/save")
public ResponseEntity<List<Book>> save(@RequestBody List<Book> books)
{
	List<Book> result=new ArrayList<>();
	for(Book book:books)
	{
	bookservice.save(book);
	result.add(book);
	}
	return new ResponseEntity<List<Book>> (result,HttpStatus.OK);
} 

@GetMapping("/search/{category}")
public List<Book>  search(@PathVariable String category)
{
	System.out.print("in controller");
	List<Book> books=bookservice.search(category);
	return books;
}

@PutMapping("/update")
public ResponseEntity<Book> update(@RequestBody Book book)
{
	
	Book book1=bookservice.save(book);
	return new ResponseEntity<Book>(book1,HttpStatus.OK);
}

@GetMapping("/find/{price}")
public Book  findbook(@PathVariable int price)
{
	System.out.print("in controller");
	Book books=bookservice.findBook(price);
	return books;
}


@GetMapping("/get/{price}")
public List<Book>  getGreaterThanQuery(@PathVariable int price)
{
	System.out.print("in controller");
	List<Book> books=bookservice.getGreaterThanQuery(price);
	return books;
}


}
