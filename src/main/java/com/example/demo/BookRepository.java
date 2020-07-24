package com.example.demo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long>{

	List<Book> findByCategory(String category);



	Book findByPriceOrderByCategory(int price);


	@Query(value = "SELECT * FROM BOOK WHERE PRICE >= ?1", nativeQuery = true)
	List<Book> findByPriceGretaerThan(int price);


}
