/**
* File		: ArrayListTest.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : program penggunaan objek ArrayList sebagai collection class
*/

import java.util.ArrayList;

class ArrayListTest{
	public static void main(String[] args){
		//inisisalisasi ArrayList yang hanya dapat berisi objek string
		ArrayList<String> strings = new ArrayList<String>();
		//menambah elemen
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan generics");
		//menghapus elemen
		strings.remove("praktikum");
		//iterasi pada keseluruhan ArrayList
		for(String s : strings){
			System.out.print(s + " ");
		}
	}
}