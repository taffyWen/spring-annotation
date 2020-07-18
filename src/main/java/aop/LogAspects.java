package aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

/**
 * @Author wen
 * @create 2020/6/20 11:10
 *
 *
 */
@Aspect
public class LogAspects {

    /**
     * 1、抽取公共的切入点表达式
     *
     */
    @Pointcut("execution(public int aop.MathCalculator.*(..))")
    public void pointCut(){}
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature() + "运行。。。参数列表为" + args);
    }

    /**
     * execution()   //必须写
     */
    @After("execution(public int aop.MathCalculator.div(int, int))")
    public void logEnd(){
        System.out.println("除法结束了");
    }

}
