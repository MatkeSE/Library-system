package com.library.library.contoller;

import com.library.library.dto.BookDTO;
import com.library.library.dto.BookSaveDTO;
import com.library.library.dto.BookUpdateDTO;
import com.library.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(path = "/save")
    public String saveBook(@RequestBody BookSaveDTO bookSaveDTO)
    {
        try {
            String booktitle = bookService.addBook(bookSaveDTO);
            return "Added Successfully";
        }
        catch (Exception e){}
        return "Error with id";
    }
    @GetMapping(path = "/getAllBook")
    public List<BookDTO> getAllBook()
    {
        List<BookDTO> allBooks = bookService.getAllBook();
        return allBooks;
    }
    @PutMapping(path = "/update")
    public String updateBook(@RequestBody BookUpdateDTO bookUpdateDTO)
    {
        String bookname = bookService.updateBook(bookUpdateDTO);
        return  bookname;
    }
    @DeleteMapping(path = "/delete/{id}")
    public String deleteBook(@PathVariable(value = "id")int id)
    {
        String Bookname = bookService.deleteBook(id);
        return  "deleteddd";
    }
}