package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.BookService;

/**
 * @Author wen
 * @create 2020/7/8 23:21
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
}
