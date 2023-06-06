/**
* File		: DiskonLambda.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : Ekspresi dasar lambda utk menghitung diskon
*/
interface IDiskon{
	public double hitungDiskon(int harga);
}

public class DiskonLambda{
	public static void main(String[] args){
		//tanpa lambda
		IDiskon diskonMerdeka = new IDiskon(){
			public double hitungDiskon(int harga){
				return harga - (harga*0.3);
			}
		};
		//diskon dengan lambda
		IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
		
		//diskon lambda dengan blok statement
		IDiskon diskonBiasa = (harga) -> {
			return harga - (harga * 0.1);
		};
		System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
		System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
		System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));
	}
}