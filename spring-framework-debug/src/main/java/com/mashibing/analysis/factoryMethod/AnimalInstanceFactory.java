package com.mashibing.analysis.factoryMethod;

/**
 * description  AnimalInstanceFactory <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:24  2021/10/20
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class AnimalInstanceFactory {

	public Animal getAnimal(String name) {
		Animal animal = new Animal();
		animal.setId(2);
		animal.setName(name);
		return animal;
	}
}
