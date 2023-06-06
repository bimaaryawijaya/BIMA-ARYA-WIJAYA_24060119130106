/**
* File		: LambdaMhs.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : Ekspresi Lambda utk map
*/
import java.util.*;

public class LambdaMhs{
	public static void main(String[] args){
		Map<Integer,String> Mhs; 
		Mhs = new HashMap<>();
		Mhs.put(24011,"Adi");
		Mhs.put(24012,"Bambang");
		Mhs.put(24013,"Cici");
		Mhs.put(24011,"Didi");
		
		//lambda digunakan sbg parameter
		for(Integer x : Mhs.keySet()){System.out.println(x);}
		for(String x : Mhs.values()){System.out.println(x);}
	}
}