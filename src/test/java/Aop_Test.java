import aop.MathCalculator;
import config.MainConfigAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author wen
 * @create 2020/6/20 11:47
 */
public class Aop_Test {


    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigAop.class);
        MathCalculator bean = applicationContext.getBean(MathCalculator.class);
        int div = bean.div(1, 1);
        System.out.println(div);
    }
}
