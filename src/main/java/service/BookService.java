package service;

import dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wen
 * @create 2020/7/8 22:56
 */
@Service("bookService")
public class BookService {

    /**
     * BookDao 如果只是接口，没有实现类的话，就不能实例化对象，也就不能自动注入
     */
    @Autowired
    private BookDao bookDao;

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
