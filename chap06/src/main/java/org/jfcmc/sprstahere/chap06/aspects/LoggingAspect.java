package org.jfcmc.sprstahere.chap06.aspects;

import java.util.Arrays;
// import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @AfterReturning(value = "@annotation(ToLog)",
		    returning = "returnedValue")
    public void log(Object returnedValue) {
	logger.info("Method executed and returned " + returnedValue);
    }

    public void setLogger(Logger logger) {
	this.logger = logger;
    }
}
