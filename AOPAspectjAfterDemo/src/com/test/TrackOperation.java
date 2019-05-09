package com.test;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation{
	@Pointcut("execution(* Operation.*(..))")
	public void k1(){
		System.out.println("point cut for msg");		
	}//pointcut name
	
	@Pointcut("execution(* Operation.k*(..))")
	public void ok(){
		System.out.println("Point cut call ");
	}//pointcut name
	
	@After("k1()")//applying pointcut on after advice
	public void myadvice(JoinPoint jp)//it is advice (after advice)
	{
		System.out.println("additional concern");
		//System.out.println("Method Signature: "  + jp.getSignature());
	}
}
