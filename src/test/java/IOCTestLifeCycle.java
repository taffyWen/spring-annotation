import config.MainConfigLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

/**
 * @Author wen
 * @create 2020/6/8 21:02
 */
public class IOCTestLifeCycle {

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("容器启动-----------");

        // 如果bean --》 @Scope("prototype")  即是多实例的，只有在使用到的时候才创建,而且容器销毁的时候，bean不会自动销毁
       // applicationContext.getBean("dog");
        System.out.println("容器销毁----------开始");
        applicationContext.close();//容器关闭
        System.out.println("容器销毁----------结束");
    }
}
