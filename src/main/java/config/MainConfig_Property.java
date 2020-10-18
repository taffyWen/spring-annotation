package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wen
 * @create 2020/6/9 22:12
 */
@Configuration
@ComponentScan("beanproperty")  // 设置的是包名 beanproperty.Person---》给出属性的配置方式
public class MainConfig_Property {


}
