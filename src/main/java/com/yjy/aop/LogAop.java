package com.yjy.aop;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

@Aspect
@Component
public class LogAop {
    Date visitTime;
    Class<?> aClass;
    HttpServletRequest request;
    Method method;
    @Before(value = "execution(public * com.yjy.controller.*.*(..))")
    public void before(JoinPoint joinPoint){
        visitTime = new Date();
        aClass = joinPoint.getTarget().getClass();
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        method = signature.getMethod();

    }
    @After(value = "execution(public * com.yjy.controller.*.*(..))")
    public void after(){
        long time = new Date().getTime()-visitTime.getTime();
        String principal = (String) SecurityUtils.getSubject().getPrincipal();
        String ip = request.getRemoteAddr();

    }
}
