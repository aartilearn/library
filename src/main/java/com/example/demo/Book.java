package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
public class Book {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long book_id;

private String book_name;
private String author_name;
private int price;
private String category;
public Long getBook_id() {
	return book_id;
}
public void setBook_id(Long book_id) {
	this.book_id = book_id;
}
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public String getAuthor_name() {
	return author_name;
}
public void setAuthor_name(String author_name) {
	this.author_name = author_name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}


}
