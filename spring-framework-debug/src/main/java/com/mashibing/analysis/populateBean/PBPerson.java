package com.mashibing.analysis.populateBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.awt.print.Book;
import java.util.*;

/**
 * description  PBPerson <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:08  2021/10/26
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class PBPerson {

	private int id;

	private String name;

	private int age;

	private String gender;

	private PBAddress paddress;

	private String[] hobbies;

	private List<Book> books;

	private Set<Integer> sets;

	private Map<String, Object> maps;

	private Properties properties;


	@PostConstruct
	public void init(){
		System.out.println("init---person");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("destroy---person");
	}

//-----------------------constructor-----------------------------
	public PBPerson(int id, String name, int age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("有参构造器");
	}

	public PBPerson(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println("Age");
	}

	public PBPerson(int id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("gender");
	}


	public PBPerson() {
	}
//-----------------------setter getter-----------------------------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public PBAddress getPaddress() {
		return paddress;
	}

	public void setPaddress(PBAddress paddress) {
		this.paddress = paddress;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Set<Integer> getSets() {
		return sets;
	}

	public void setSets(Set<Integer> sets) {
		this.sets = sets;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

//-------------------------toString-----------------------
	@Override
	public String toString() {
		return "PBPerson{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				", address=" + paddress +
				", hobbies=" + Arrays.toString(hobbies) +
				", sets=" + sets +
				", maps=" + maps +
				", properties=" + properties +
				'}';
	}
}
