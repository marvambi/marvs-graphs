package com.marvambi.graph;

import com.marvambi.graph.querydsl.book.Book;
import com.marvambi.graph.querydsl.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringGraphqlWorkoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGraphqlWorkoutApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;

	@EventListener(value = ApplicationReadyEvent.class)
	public void addBooks(){
		Book entity = new Book();
		entity.setId("1");
		entity.setName("ambrose");
		bookRepository.save(entity);
		Book entity2 = new Book();
		entity2.setId("2");
		entity2.setName("marvin");
		bookRepository.save(entity2);
	}

}
