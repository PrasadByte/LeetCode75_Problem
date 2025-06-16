package oop_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person>{
	private String name;
	private int ram;
	private int price;
	
	Person(String name,int ram, int price){
		this.name=name;
		this.ram= ram;
		this.price = price;
	}
public void steName(String name) {
	this.name = name;
}
public void setRam(int ram) {
	this.ram = ram;
	
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public int getram() {
	return ram;
}
public int getPrice() {
	return price;
}
@Override
public int compareTo(Person o) {
	// TODO Auto-generated method stub
	return 0;
}
	
	
}

public class ComparableDemo {
	public static void main(String[] args) {
		List<Person> lapy = new ArrayList<Person>();
		lapy.add(new Person("HCL", 16,800));
		lapy.add(new Person("Lenevo", 8,8000));
		lapy.add(new Person("Asus", 16,82214));
		lapy.add(new Person("Apply", 16,800));
		lapy.add(new Person("dell", 16,800));
		
		Comparator<Person>namecomparator = (d1 ,o2)-> d1.getName().compareTo(o2.getName());
		Collections.sort(lapy,namecomparator);
		for(Person lap : lapy) {
			System.out.println(lap.getName()+ "  "+lap.getram()+"  "+lap.getPrice());
		}
		System.out.println(namecomparator);
		
	}

}
