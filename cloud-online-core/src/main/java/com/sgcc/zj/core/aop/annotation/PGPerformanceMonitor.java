package com.sgcc.zj.core.aop.annotation;

import java.lang.annotation.*;


@Target({ElementType.PARAMETER, ElementType.METHOD})    
@Retention(RetentionPolicy.RUNTIME)    
@Documented    
public  @interface PGPerformanceMonitor {

	String name()  default "";    
    
}   
