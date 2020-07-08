package config;

import bean.Color;
import beanspecial.ColorFactoryBean;
import bean.Person;
import condition.MyImportBeanDefinitionRegistrar;
import condition.MyImportSelector;
import condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @Author wen
 * @create 2020/6/6 21:27
 */

@Configuration
//自动扫描
@ComponentScan(value = "controller")
//根据导入的类，id默认是全类名，MyImportSelector中方法返回的类的全类名导入到容器中
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig_Conditional {


    /**
     * 给容器中注册组件
     * 1. 包扫描 + 组件标注注解（@Controller、@Service、@Dao、@Repository、@Component）
     * 2. @Bean [导入的第三方包里面的组件]
     * 3. @Import【快速给容器导入一个组件】
     *      1）@Import ，id默认是全类名
     *      2）@ImportSelector 返回需要导入的组件的全类名数组
     *      3）@ImportBeanDefinitionRegistrar 手动注册Bean到容器中
     * 4. 使用Spring提供的 FactoryBean
     *      默认获取的是FactoryBean创建的Bean对象 -》beanspecial.ColorFactoryBean
     *      要想获取FactoryBean对象本身，需要在bean 的id上面添加 & 符号
     */
    @Conditional(WindowsCondition.class)
    @Bean("bill")
    public Person person(){
        return new Person("bill",66);
    }

    @Bean("person")
    public Person person2(){
        return new Person("wen",23);
    }

    /**
     * FactoryBean
     * @return
     */
    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }


}
