package bean_lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * @Author wen
 * @create 2020/6/8 21:17
 */
@Component
public class Car {

    public Car(){
        System.out.println("Car constructor-----");
    }

    // bean 创建万层并且属性复制完成，来执行初始化方法
    @PostConstruct
    public void init(){
        System.out.println("Car init------");
    }

    // 在容器销毁bean前，通知进行清理工作
    @PreDestroy
    public void destory(){
        System.out.println("Car destory------");
    }
}
