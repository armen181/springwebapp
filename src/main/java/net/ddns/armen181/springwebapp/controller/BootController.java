package net.ddns.armen181.springwebapp.controller;


import net.ddns.armen181.springwebapp.repositoies.AuthorRepository;
import net.ddns.armen181.springwebapp.repositoies.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootController {
        @Autowired
        private BookRepository bookRepository;
        @Autowired
        private AuthorRepository authorRepository;

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books",bookRepository.findAll());
        return "books";
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors",authorRepository.findAll());
        return "authors";
    }
}
