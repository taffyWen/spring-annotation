package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wen
 * @create 2020/7/8 22:58
 */
@Configuration
@ComponentScan({"service","dao","controller"})
public class MainConfigOfAutowired {
}
