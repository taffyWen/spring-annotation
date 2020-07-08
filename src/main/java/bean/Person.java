package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sun.reflect.generics.scope.Scope;

/**
 * @Author wen
 * @create 2020/6/6 21:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;

    private Integer age;

}
