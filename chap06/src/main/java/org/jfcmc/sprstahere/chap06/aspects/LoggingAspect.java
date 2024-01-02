package org.jfcmc.sprstahere.chap06.aspects;

import java.util.Arrays;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
	String methodName = joinPoint.getSignature().getName();
	Object[] arguments = joinPoint.getArgs();
	logger.info("Method " + methodName +
		    " with parameters " + Arrays.asList(arguments) +
		    " will execute");

	Object returnedByMethod = joinPoint.proceed(arguments);

	logger.info("Method executed and returned " + returnedByMethod);

	return returnedByMethod;
    }

    public void setLogger(Logger logger) {
	this.logger = logger;
    }
}
