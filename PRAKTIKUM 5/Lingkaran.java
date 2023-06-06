/**
* File		: Lingkaran.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : kelas implementasi IArea berupa cara menghitung luas lingkaran
*/
import static java.lang.Math.PI;

public class Lingkaran implements IArea{
	public double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}