import config.MainConfig_Property;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @Author wen
 * @create 2020/6/9 22:11
 */
public class IOCTest_PropertyValue {

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig_Property.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("容器启动-----------");
        Object person = applicationContext.getBean("person");
        System.out.println(person);

        Environment environment = applicationContext.getEnvironment();
        //TODO 需要着重看的 --》使用@PropertySource(value = "classpath:/person.properties")，此处可以获取值
        String property = environment.getProperty("person.nickName");
        System.out.println(property);
        applicationContext.close();//容器关闭
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        Object person = applicationContext.getBean("person");
        System.out.println(person.toString());

        Environment environment = applicationContext.getEnvironment();

        //TODO 需要着重看的 --》读取 .xml 是不能获取值
        String property = environment.getProperty("person.nickName");
        System.out.println(property);
    }
}
