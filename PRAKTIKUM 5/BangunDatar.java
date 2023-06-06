/**
* File		: BangunDatar.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : kelas abstract berisi abstraksi bangun datar
*/
public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
}