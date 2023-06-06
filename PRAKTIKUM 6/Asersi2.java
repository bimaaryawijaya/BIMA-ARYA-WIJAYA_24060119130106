/**
* File		: Asersi2.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : program untuk demo asersi yang akan menolak input jarijari lingkaran bernilai nol
*/
//class Lingkaran
class Lingkaran{
	private double jarijari;
	public Lingkaran(double jarijari){
		this.jarijari = jarijari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jarijari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jarijari = 7;
		assert(jarijari > 0) : "jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jarijari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}