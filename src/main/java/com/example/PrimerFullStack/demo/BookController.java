package com.example.PrimerFullStack.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = {"http://localhost:4200/"})
public class BookController {
    @GetMapping
    public List<Book> findAll(){

        System.out.println("findAll()");
        return List.of(
                new Book(1L, "Libro1"),
                new Book(2L, "Libro2"),
                new Book(3L, "Libro3")
                );
    }


    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id){
        System.out.println("findById()" + id);
        return new Book(id, "book ejemlo");
    }
}
