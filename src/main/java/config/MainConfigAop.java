package config;

import aop.LogAspects;
import aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author wen
 * @create 2020/6/20 11:12
 * 测试aop
 *
 * 1. 导入aop模块
 * 2. 定义i业务逻辑类，在业务逻辑运行时将日志进行打印
 *
 *      @EnableAspectJAutoProxy
 *          @Import(AspectJAutoProxyRegistrar.class)
 */
@EnableAspectJAutoProxy   //---》开启aop
@Configuration
public class MainConfigAop {

    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
