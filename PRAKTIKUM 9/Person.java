/**
* File		: Person.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : Person database mode
*/
public class Person{
	private int id;
	private String name;
	
	public Person(String n){
		name = n;
	}
	
	public Person(int i, String n){
		id = i;
		name = n;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
}