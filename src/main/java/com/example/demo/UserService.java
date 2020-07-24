package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired BookService bookService;
	
	public User save(User user)
	{
		User user1=userRepository.save(user);
		return user1;
	}

//	public User save(String user_name, String book_name) {
//		Book book1=bookService.findBook(book_name);
//		return null;
//	}

//	public User saveBook(String user_name, Book book1) {
//	   User user1=userRepository.saveBook(user_name,book1);
//		return user1;
//	}

}
