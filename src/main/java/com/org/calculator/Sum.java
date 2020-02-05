package com.org.calculator;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Sum implements Calculator{

	@Override
	public double sum(ArrayList<Double> A) {
		
		
		double sum1=0.0;
		for(double i:A) {
			sum1=sum1+i;
		}
		return sum1;
	}

	@Override
	public double sub(double p,double q) {
		double sum1=0.0;
		sum1=p-q;
		return sum1;
	}

	@Override
	public double mul(ArrayList<Double> A) {
		double sum1=1.0;
		for(double i:A) {
			sum1=sum1*i;
		}
		return sum1;
	}

	@Override
	public double div(double p,double q) {
		double div=0.0;
		div=p/q;
		
		return div;
	}

	
	
}
