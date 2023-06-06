/**
* File		: PegawaiDanGaji.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : class Programmer sebagai child class dari Pegawai
*/
public class Programmer extends Pegawai{
	private int tunjangan = 450000;
	
	public Programmer(String nama){
		super.nama = nama;

	}
	
	public void tampilData(){
		System.out.println("nama : "+super.nama+",Gaji Pokok : "+super.gajiPokok+ "\nTunjangan :"+tunjangan);
	}
	
}