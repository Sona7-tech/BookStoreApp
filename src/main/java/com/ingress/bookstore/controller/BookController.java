package com.ingress.bookstore.controller;
import com.ingress.bookstore.service.impl.BookServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    private  final BookServiceImpl bookService;
    @GetMapping("/hello")
    public String welcome(){
        return "Hello";
    }
}
