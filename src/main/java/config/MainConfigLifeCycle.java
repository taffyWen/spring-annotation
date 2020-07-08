package config;

import bean_lifecycle.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author wen
 * @create 2020/6/8 20:59
 */
@ComponentScan("bean_lifecycle")  // 设置的是包名。创建bean生命周期的方法
@Configuration
public class MainConfigLifeCycle {

    /**
     * 对象的创建
     *  单实例：在容器启动的时候创建对象
     *  多实例：在每次获取的时候创建对象
     */

    /**
     * bean的初始化和销毁方法
     * 1. 通过@Bean注解，指定init  多实例的bean，在容器销毁时，不会管理bean，不会调用销毁方法
     * 2. InitializingBean 初始化方法。DisposableBean 销毁方法
     * 3. PostConstruct -->在bean创建完成并且属性赋值完成后来执行该方法    PreDestroy --》容器销毁bean之前
     * 4. BeanPostProcessor 接口
     *      postProcessBeforeInitialization
     *      postProcessAfterInitialization
     */

    @Bean(initMethod = "init",destroyMethod = "destory")
    public Dog dog(){
        return new Dog();
    }
}
