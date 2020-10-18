package aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

/**
 * @Author wen
 * @create 2020/7/22 22:55
 * 自定义组件实现xxxAware，在创建对象时，会调用接口规定的方法注入相关组件。Aware
 * xxxAware 功能使用xxxProcessor
 */
public class Red implements ApplicationContextAware, EmbeddedValueResolverAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {

    }
}
