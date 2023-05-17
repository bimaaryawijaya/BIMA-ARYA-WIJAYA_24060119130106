/**
* File		: Lingkaran.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : implementasi Lingkaran sebagai BangunDatar
*/
public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}

