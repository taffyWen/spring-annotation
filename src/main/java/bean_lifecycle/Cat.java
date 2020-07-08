package bean_lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author wen
 * @create 2020/6/8 21:09
 */
@Component
public class Cat implements DisposableBean, InitializingBean {

    public Cat(){
        System.out.println("Cat constructor--------");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Cat destroy--------");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat afterPropertiesSet--------");
    }
}
