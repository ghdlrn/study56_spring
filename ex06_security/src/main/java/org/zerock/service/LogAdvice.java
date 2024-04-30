package org.zerock.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import lombok.extern.log4j.Log4j;

@Aspect   // 3
@Service
@Log4j
public class LogAdvice implements Advice{

	
	@Pointcut("execution(* org.zerock.service.BoardServiceImpl.*(..) )   ")  // 1
	public void allPointCut() {};
	
	@Around("allPointCut()")  //2
	public Object logAdvice(ProceedingJoinPoint pjp)  throws Throwable{
		
//		String method = pjp.getSignature().getName();
//		Object[] arg  = pjp.getArgs();
//		
//		log.info("--------------------------------------------------");
//		log.info("method : " + method);
//		log.info("arg : " + arg);
//		
//		StopWatch watch = new StopWatch();
//		
//		watch.start();
//		Object obj = pjp.proceed();
//		watch.stop();
//		
//		log.info(method + "() 메소드 수행에 걸린 시간 : " + watch.getTotalTimeMillis());
//		log.info(obj);
//		log.info("--------------------------------------------------");
		
		String method = pjp.getSignature().getName();
		log.info(method + "........................");
		Object obj = pjp.proceed();
		
		return obj;
		
	}

	@Override
	public void advice() {
		log.info("[BoardController] 로그 기록====================");
		
	}
}
