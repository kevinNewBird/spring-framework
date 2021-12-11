package com.mashibing.analysis.aop.proxy.cglib;

/**
 * description  HuaweiCalculator <BR>
 * <p>
 * author: zhao.song
 * date: created in 20:38  2021/12/10
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class HuaweiCalculator {

	public int add(int i, int j) {
		int result = i + j;
		return result;
	}

	public int sub(int i, int j) {
		int result = i - j;
		return result;
	}

	public int multi(int i, int j) {
		int result = i * j;
		return result;
	}

	public int div(int i, int j) {
		int result = i / j;
		return result;
	}
}
