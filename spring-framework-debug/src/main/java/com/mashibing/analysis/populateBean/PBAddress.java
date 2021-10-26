package com.mashibing.analysis.populateBean;

/**
 * description  PBAddress <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:09  2021/10/26
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class PBAddress {

	private String province;
	private String city;
	private String town;

//-----------------------------------------------------constructor--------------------
	public PBAddress() {
		System.out.println("address被创建了");
	}

	public PBAddress(String province, String city, String town) {
		this.province = province;
		this.city = city;
		this.town = town;
	}

//-----------------------------------------------------setter getter----------------
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
//---------------------------------------toString-----------------------
	@Override
	public String toString() {
		return "PBAddress{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				", town='" + town + '\'' +
				'}';
	}
}
