/**
* File		: MLingkaran2.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : kelas implementasi cara menghitung luas lingkaran dengan melakukan input scan angka yang diinginkan
*/
import java.util.Scanner;

public class MLingkaran2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Lingkaran l = new Lingkaran(1);
		System.out.print("Masukkan jejari lingkaran : ");
		double jejari = scan.nextDouble();
		System.out.println("Luas lingkaran dengan jejari "+jejari+" satuan adalah "+l.hitungLuas());
	}
}