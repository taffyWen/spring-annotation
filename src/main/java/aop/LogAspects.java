package aop;


import org.aspectj.lang.JoinPoint;
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

    @Pointcut("execution(public int aop.MathCalculator.*(..))")
    public void pointCut(){}
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature() + "运行。。。参数列表为" + args);
    }

}
