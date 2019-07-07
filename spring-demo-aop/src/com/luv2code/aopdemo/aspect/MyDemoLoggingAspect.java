package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//this is where we add all of our related to advices for logging
	
	//let's start with the @Before advice
	
//	@Before("execution(public void addAccount())")
//	public void beforeAddAccountAdvice()
//	{
//		System.out.println("\n=======>>>>> Execution @Before advice on method");
//	}
	
//	@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
//	public void beforeAddAccountAdvice()
//	{
//		System.out.println("\n=======>>>>> Execution @Before advice on method");
//	}
	
//	@Before("execution(public void add*())")
//	public void beforeAddAccountAdvice()
//	{
//		System.out.println("\n=======>>>>> Execution @Before advice on method");
//	}
	
//	@Before("execution(* add*(Account))") //exception thrown
//	public void beforeAddAccountAdvice()
//	{
//		System.out.println("\n=======>>>>> Execution @Before advice on method");
//	}
	
//	@Before("execution(* add*(com.luv2code.aopdemo.Account))")
//	public void beforeAddAccountAdvice()
//	{
//		System.out.println("\n=======>>>>> Execution @Before advice on method");
//	}
	
//	@Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
//	public void beforeAddAccountAdvice()
//	{
//		System.out.println("\n=======>>>>> Execution @Before advice on method");
//	}
	
//	@Before("execution(* add*(..))")
//	public void beforeAddAccountAdvice()
//	{
//		System.out.println("\n=======>>>>> Execution @Before advice on method");
//	}
	
//	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
//	public void beforeAddAccountAdvice()
//	{
//		System.out.println("\n=======>>>>> Execution @Before advice on method");
//	}

	@Before("execution(* com.luv2code.aopdemo.dao.*.add*(..))")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n=======>>>>> Execution @Before advice on method");
	}

}





















