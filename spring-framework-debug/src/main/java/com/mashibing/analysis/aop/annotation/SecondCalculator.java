package com.mashibing.analysis.aop.annotation;

import com.mashibing.analysis.aop.base.Calculator;


public class SecondCalculator implements Calculator {
	public Integer add(Integer i, Integer j) throws NoSuchMethodException {
		return i + j;
	}

	public Integer sub(Integer i, Integer j) throws NoSuchMethodException {
		return i - j;
	}

	public Integer mul(Integer i, Integer j) throws NoSuchMethodException {
		return i * j;
	}

	public Integer div(Integer i, Integer j) throws NoSuchMethodException {
		return i / j;
	}

	public Integer show(Integer i) {
		System.out.println("show .....");
		return i;
	}
}
