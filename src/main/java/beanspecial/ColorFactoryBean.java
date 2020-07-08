package beanspecial;

import bean.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author wen
 * @create 2020/6/7 14:57
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean----------");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * true bean是单实例
     * false bean是多实例，每次创建新的
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }

}
