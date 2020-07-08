import bean.Person;
import config.MainConfig;
import config.MainConfig_Conditional;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wen
 * @create 2020/6/6 21:34
 */
public class IOCTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
        Object person = applicationContext.getBean("person");
        Object person2 = applicationContext.getBean("person");
        System.out.println(person.toString());
        System.out.println(person == person2);
    }

    /**
     * 测试注解Conditional，Persion类是否注入成功
     */
    @Test
    public void test4(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig_Conditional.class);
        String[] beanDefinitionNames = applicationContext.getBeanNamesForType(Person.class);
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
        Object person = applicationContext.getBean("person");
        System.out.println(person.toString());
    }
}
