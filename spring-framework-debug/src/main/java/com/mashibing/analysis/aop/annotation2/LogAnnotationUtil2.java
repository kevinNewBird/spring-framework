package com.mashibing.analysis.aop.annotation2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * description  LogAnnotationUtil2 <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:00  2021/12/11
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Aspect
@Component
public class LogAnnotationUtil2 {
	@Pointcut("execution(public Integer com.mashibing.analysis.aop.annotation2.ThirdCalculator.*(Integer,Integer))")
	public void myPointCut() {
	}

	@Pointcut("execution(* *(..))")
	public void myPointCut1() {
	}

	@Before(value = "myPointCut()")
	private int start(JoinPoint joinPoint) {
		//获取方法签名
		Signature signature = joinPoint.getSignature();
		//获取参数信息
		Object[] args = joinPoint.getArgs();
		System.out.println("logAnnotation---" + signature.getName() + "方法开始执行：参数是" + Arrays.asList(args));
		return 100;
	}

	@AfterReturning(value = "myPointCut()", returning = "result")
	public static void stop(JoinPoint joinPoint, Object result) {
		Signature signature = joinPoint.getSignature();
		System.out.println("logAnnotation---" + signature.getName() + "方法执行结束，结果是：" + result);
	}

	@AfterThrowing(value = "myPointCut()", throwing = "e")
	public static void logException(JoinPoint joinPoint, Exception e) {
		Signature signature = joinPoint.getSignature();
		System.out.println("logAnnotation---" + signature.getName() + "方法抛出异常：" + e.getMessage());
	}

	@After("myPointCut()")
	public static void logFinally(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("logAnnotation---" + signature.getName() + "方法执行结束。。。。。over");

	}

	@Around("myPointCut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		Signature signature = pjp.getSignature();
		Object[] args = pjp.getArgs();
		Object result = null;
		try {
			System.out.println("logAnnotation---环绕通知start：" + signature.getName() + "方法开始执行，参数为：" + Arrays.asList(args));
			//通过反射的方式调用目标的方法，相当于执行method.invoke(),可以自己修改结果值
			result = pjp.proceed(args);
//            result=100;
			System.out.println("logAnnotation---环绕通知stop" + signature.getName() + "方法执行结束");
		} catch (Throwable throwable) {
			System.out.println("logAnnotation---环绕异常通知：" + signature.getName() + "出现异常");
			throw throwable;
		} finally {
			System.out.println("logAnnotation---环绕返回通知：" + signature.getName() + "方法返回结果是：" + result);
		}
		return result;
	}
}
