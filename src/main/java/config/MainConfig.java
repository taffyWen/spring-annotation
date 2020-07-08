package config;

import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * @Author wen
 * @create 2020/6/6 21:27
 */

@Configuration
//自动扫描
@ComponentScan(value = "controller")
public class MainConfig {

    @Bean
    @Scope(value = SCOPE_PROTOTYPE)
    public Person person(){
        Person persion = new Person();
        persion.setName("wen");
        persion.setAge(23);
        System.out.println("给容器中添加一个Person--------");
        return persion;
    }
}
