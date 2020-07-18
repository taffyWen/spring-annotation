package config;

import bean.Person;
import org.springframework.context.annotation.*;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

/**
 * @Author wen
 * @create 2020/6/6 21:27
 */

@Configuration
//自动扫描
public class MainConfig {

    @Bean
    @Lazy //懒加载，只有在单实例的时候有效。在第一次使用bean的时候加载
    @Scope(value = SCOPE_SINGLETON)
    public Person person(){
        Person persion = new Person();
        persion.setName("wen");
        persion.setAge(23);
        System.out.println("给容器中添加一个Person--------");
        return persion;
    }
}
