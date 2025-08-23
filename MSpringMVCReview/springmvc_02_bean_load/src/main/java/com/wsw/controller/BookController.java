package com.wsw.controller;

import com.wsw.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @date 2025/8/23
 * @description
 */
@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @ResponseBody
    @RequestMapping("/book/save")
    public String save() {
        System.out.println("book controller save ...");
        bookService.save();
        return "{'module': 'book save'}";
    }
}
