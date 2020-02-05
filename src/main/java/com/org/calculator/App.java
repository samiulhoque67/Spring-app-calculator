package com.org.calculator;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
    	Calculator cal=context.getBean("sum",Calculator.class);
    	ArrayList<Double>list=new ArrayList<Double>();
    	
    
    	Scanner sc=new Scanner(System.in);
    	while(true) {
    		int n,q,n1,q1=0;
        	double g,p,r;
    	System.out.println("enter the number of case");
    	n=sc.nextInt();
    	switch(n)
    	{case 1:
    		System.out.println("enter the number of input");
    	    n1=sc.nextInt();
    	System.out.println(" input");
    	for(int i=0;i<n1;i++)
    	{
    		g=sc.nextDouble();
    		list.add(g);
    	}
    	
        System.out.println( "the sum is "+ cal.sum(list) );
        break;
    	case 2:
    		System.out.println("enter the  input");
    		p=sc.nextDouble();
    		r=sc.nextDouble();
    		System.out.println( "the sub is "+ cal.sub(p,r) );
    		break;
    	case 3:
    		System.out.println("enter the number of input");
    		n1=sc.nextInt();
        	System.out.println(" input");
        	for(int i=0;i<n1;i++)
        	{
        		g=sc.nextDouble();
        		
        		list.add(g);
        	}
        	
            System.out.println( "the mul is "+ cal.mul(list) );
            break;
    	case 4:
    		System.out.println("enter the  input");
    		p=sc.nextDouble();
    		r=sc.nextDouble();
    		System.out.println( "the div is "+ cal.div(p,r) );
    		break;
    		default :
    		q1=1;
    			break;
    	}
    	if(q1==1)
    	{
    		break;
    	}
    }
    	context.close();
}}
