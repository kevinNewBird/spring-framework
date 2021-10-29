package com.mashibing.analysis.aop.xml.service;

/**
 * description  Calculator <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:04  2021/10/29
 * company: TRS信息技术有限公司
 * version 1.0
 */
public interface Calculator {

	public Integer add(Integer i,Integer j) throws NoSuchMethodException;
	public Integer sub(Integer i,Integer j) throws NoSuchMethodException;
	public Integer mul(Integer i,Integer j) throws NoSuchMethodException;
	public Integer div(Integer i,Integer j) throws NoSuchMethodException;
}
