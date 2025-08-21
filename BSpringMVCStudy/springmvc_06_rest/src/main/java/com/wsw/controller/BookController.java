package com.wsw.controller;

import com.wsw.domain.Book;
import org.springframework.web.bind.annotation.*;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("save book ..." + book);
        return "{'module': 'book save'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("delete book ..." + id);
        return "{'module': 'book delete'}";
    }

    @PutMapping
    public String update(@RequestBody Book book) {
        System.out.println("update book ..." + book);
        return "{'module': 'book update'}";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("book getById..." + id);
        return "{'module': 'book getById'}";
    }

    @GetMapping
    public String getAll() {
        System.out.println("book getAll...");
        return "{'module': 'book getAll'}";
    }
}
