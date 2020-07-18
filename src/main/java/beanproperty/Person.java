package beanproperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author wen
 * @create 2020/6/9 22:22
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@PropertySource(value = {"classpath:/person.properties"})  //{}可以配置数组

public class Person {

    /**
     * @Value  赋值
     * 1. 基本数值
     * 2. SpEL，#{}
     * 3. ${} ,取出配置文件的值  @PropertySource(value = "classpath:/person.properties")
     * 4.
     */
    @Value("wen")
    private String name;
    @Value("#{20-3}")
    private Integer age;
    @Value("${person.nickName}")
    private String nickName;
}
