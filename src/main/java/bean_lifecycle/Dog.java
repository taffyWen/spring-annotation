package bean_lifecycle;

import org.springframework.context.annotation.Bean;

/**
 * @Author wen
 * @create 2020/6/8 20:56
 */
public class Dog {

    public Dog(){
        System.out.println("dog constructor------");
    }


    public void init(){
        System.out.println("dog init------");
    }

    public void destory(){
        System.out.println("dog destory------");
    }
}
