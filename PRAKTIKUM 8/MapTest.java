/**
* File		: MapTest.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : program yang menggunakan Generic utk pasangan Kunci -> Nilai
*/
import java.util.*;

public class MapTest{
	public static void main(String[] args){
		//kunci -> integer, nilai ->string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai
		map.put(1,"satu");
		map.put(2,"dua");
		//mengambil elemen pertama
		System.out.println(map.get(1));
		//mengambil keseluruhan kunci sbg objek collection Set
		Set<Integer> key = map.keySet();
		
	}
}