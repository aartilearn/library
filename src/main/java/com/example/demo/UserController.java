package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
@Autowired
private UserService userservice;

@Autowired
private BookService bookservice;

@PostMapping("/save")
public ResponseEntity<User> save(@RequestBody User user)
{
	User user1=userservice.save(user);
	return new ResponseEntity<User>(user1,HttpStatus.OK);	
}

//@PostMapping("/order/{user_name}/{book_name}")
//public ResponseEntity<User> save(@PathVariable String user_name,@PathVariable String book_name)
//{
//	Book book1=bookservice.findBook(book_name);
//	User user1=userservice.saveBook(user_name,book1);
//	return new ResponseEntity<User>(user1,HttpStatus.OK);
//}


}
