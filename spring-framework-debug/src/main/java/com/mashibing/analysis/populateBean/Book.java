package com.mashibing.analysis.populateBean;

/**
 * description  PBBook <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:09  2021/10/26
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Book {
	
	private String name;

	private String author;

	private double price;

//----------------------------------------constructor-------------------
	public Book() {
	}

	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

//--------------------------------------setter getter--------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//-----------------------------------------------toString------------------------
	@Override
	public String toString() {
		return "PBBook{" +
				"name='" + name + '\'' +
				", author='" + author + '\'' +
				", price=" + price +
				'}';
	}
}
