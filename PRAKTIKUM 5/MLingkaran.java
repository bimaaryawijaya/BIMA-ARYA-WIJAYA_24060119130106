/**
* File		: MLingkaran.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : kelas implementasi cara menghitung luas lingkaran
*/
public class MLingkaran{
	public static void main(String[] args){
		Lingkaran l = new Lingkaran(10.2);
		System.out.println("Luas Lingkaran dengan jejari " + l.jejari+ " adalah "+l.hitungLuas());
	}
}