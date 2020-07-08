import config.MainConfig_Conditional;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wen
 * @create 2020/7/5 13:19
 */
public class FactoryBeanTest {

    /**
     * 测试注解@Import
     */
    @Test
    public void test3(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig_Conditional.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");
        System.out.println(colorFactoryBean.getClass());
        // 要想获取FactoryBean对象本身，需要在bean 的id上面添加 & 符号
        Object colorFactory = applicationContext.getBean("&colorFactoryBean");
        System.out.println(colorFactory.getClass());
    }
}
