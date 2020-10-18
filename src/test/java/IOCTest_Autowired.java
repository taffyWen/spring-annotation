import config.MainConfigOfAutowired;
import dao.AbstractBookDao;
import dao.BookDao;
import dao.BookDaoImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.BookService;

/**
 * @Author wen
 * @create 2020/7/8 23:00
 *
 */
public class IOCTest_Autowired {


    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        /*Object bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

        BookDao bookDao = applicationContext.getBean(BookDao.class);
        System.out.println(bookDao);
        applicationContext.close();*/

        BookDaoImpl bookDaoImpl = applicationContext.getBean(BookDaoImpl.class);
        System.out.println(bookDaoImpl);
        bookDaoImpl.woSay();



    }
}
