package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author wen
 * @create 2020/6/22 21:54
 *
 * 反射获取类信息
 *
 *
 */
public class Lesson01 {

    public static void main(String[] args) throws Exception {
        String path = "bean.Person";
        Class<?> aClass = Class.forName(path);
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println(classLoader);
        Object instance = aClass.newInstance();
        Method setName = aClass.getDeclaredMethod("setName", String.class);
        setName.invoke(instance,"wen");
        System.out.println(instance);

        Field age = aClass.getDeclaredField("age");
        // 不用做安全检查
        age.setAccessible(true);
        // 不能自动装箱拆箱，且在赋值的时候，因为不是基本数据类型，因此用set方法，不能使用setInt方法
        age.set(instance,Integer.valueOf(23));
        System.out.println(instance);



    }
}
