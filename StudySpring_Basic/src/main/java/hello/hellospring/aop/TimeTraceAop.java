package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component // 컴포넌트 등로해서 쓰기도하지만 이런 케이스는 spring Config 에 등록해서 사용. AOP 등록한거 인지하기위해
public class TimeTraceAop {
    @Around("execution(* hello.hellospring..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println("START : "+ joinPoint.toString());
        try {
            return joinPoint.proceed();
        } finally {
            long finish= System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END : "+ joinPoint.toString() + " " + timeMs + "ms");
        }
    }
}
