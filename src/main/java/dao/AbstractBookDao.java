package dao;

import org.springframework.beans.factory.annotation.Autowired;
import service.BookService;

/**
 * @Author wen
 * @create 2020/7/22 22:31
 */
public abstract class AbstractBookDao {

    @Autowired
    private BookDao bookDao;

    public void woSay(){
        bookDao.say();
    }
}
