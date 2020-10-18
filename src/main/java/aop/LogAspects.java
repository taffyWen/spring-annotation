package aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
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

    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(Object result){
        System.out.println("除法正常返回。。。@AfterReturning：运行结果是" + result);
    }

    /**
     * JoinPoint --->放到参数列表的第一位
     * @param joinPoint
     * @param exception
     */
    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(JoinPoint joinPoint,Exception exception){
        System.out.println("除法正常返回。。。@logException：运行结果是" + exception);
    }
}
