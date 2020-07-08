package condition;

import bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author wen
 * @create 2020/6/7 12:07
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    //AnnotationMetadata 获取当前类的注解信息
    //BeanDefinitionRegistry 可以给容器中注册一个类
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // bean.Blue 必须是bean的id ---》因为此处是通过Import注册到容器的，id就是类的全类名
        if (registry.containsBeanDefinition("bean.Blue") && registry.containsBeanDefinition("bean.Red")){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
            registry.registerBeanDefinition("rainBow", rootBeanDefinition);
        }
    }
}
