package com.example.demo.controllers;

import com.example.demo.dtos.SimpleBookRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    @GetMapping("/{bookId}")  // /23/johnnywalker/james/ id=23?title=johnywalekr&author=james
    public String getBookById(@PathVariable Integer bookId) {
        return "You requested book with id: " + bookId;
    }

    @GetMapping("/qparams") // qparams?id=1&title=jamesbond
    public String getBookQParams(@RequestParam(defaultValue = "0") Integer id, @RequestParam(defaultValue = "") String title) {
        return "You requested book with id: " + id + " and title = " + title;
    }

    @PostMapping("/withbody1param")
    public String getBookBody1Param(@RequestBody Integer id) {
        return "You requested a book with body id " + id;
    }

    @PostMapping("/withbody")
    public String getBookBody(@RequestBody SimpleBookRequest simpleBookRequest) {
        return "You requested a book with body id " + simpleBookRequest.getId() + " book-title = " + simpleBookRequest.getBookTitle();
    }

    @GetMapping("/withheadername")
    public String getBookHName(@RequestHeader("name") String name, @RequestHeader("User-Agent") String UA) {
        return "You requested a book header name = " + name + " UA = " + UA;
    }
}
