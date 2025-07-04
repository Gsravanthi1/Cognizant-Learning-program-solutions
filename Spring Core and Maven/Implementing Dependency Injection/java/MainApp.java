package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // Load Spring Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean from Spring container
        BookService bookService = (BookService) context.getBean("bookService");

        // Test method to ensure DI works
        bookService.addBook("1984 by George Orwell");
    }
}
