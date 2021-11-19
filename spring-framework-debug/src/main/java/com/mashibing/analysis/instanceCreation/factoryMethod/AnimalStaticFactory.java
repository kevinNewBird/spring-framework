package com.mashibing.analysis.instanceCreation.factoryMethod;

/**
 * description  AnimalStaticFactory <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:22  2021/10/20
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class AnimalStaticFactory {

	public static Animal getAnimal(String name) {
		Animal animal = new Animal();
		animal.setId(1);
		animal.setName(name);
		return animal;
	}

	public static Animal getAnimal(int id) {
		Animal animal = new Animal();
		animal.setId(id);
		animal.setName("lisi");
		return animal;
	}

	public static Animal getAnimal(int id, String name) {
		Animal animal = new Animal();
		animal.setId(id);
		animal.setName(name);
		return animal;
	}
}
