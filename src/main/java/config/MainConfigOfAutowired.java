package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wen
 * @create 2020/7/8 22:58
 * @Autowired  自动注入
 *      1、默认优先按照类型去容器中找对应的组件： applicationContext.getBean(BookService.class)
 *      2、如果找到多个相同类型的组件，再将属性的名称作为组件的id去容器中查找
 *                  applicationContext.getBean("bookService")
 *      3、标注在方法上，Spring容器创建当前对象就会调用方法，完成赋值，方法使用的参数，自定义类型从ioc容器中获取
 *
 * @Resource  默认按照属性名称装配
 *
 */
@Configuration
//@ComponentScan({"service","dao","controller"})
@ComponentScan({"dao"})
public class MainConfigOfAutowired {
}
