package com.mashibing.analysis.selfeditor;

/**
 * description  Address <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:32  2021/8/31
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Address {

	private String province;

	private String city;

	private String town;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "Address{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				", town='" + town + '\'' +
				'}';
	}
}
