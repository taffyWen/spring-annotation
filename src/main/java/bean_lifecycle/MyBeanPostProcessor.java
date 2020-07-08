package bean_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author wen
 * @create 2020/7/5 14:11
 * 后置处理器，初始化前后处理工作
 * 需要将后置处理器加入到容器中，影响容器自动处理的类，如果类没有初始化，不会调用
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization......." + beanName + "=>" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization......." + beanName + "=>" + bean);
        return bean;
    }
}
