package com.mashibing.analysis.selfeditor;

import com.mashibing.analysis.selfaware.MyAware;

/**
 * description  Customer <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:37  2021/8/31
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Customer implements MyAware {

	private String name;

	private Address address;

	public String myAware;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", address=" + address + '\'' +
				", myAware=" + myAware +
				'}';
	}

	@Override
	public void setMyAware(String myAware) {
		this.myAware = myAware;
	}
}
