/**
* File		: PegawaiDanGaji.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : class Manajer sebagai child class dari Pegawai
*/
public class Manajer extends Pegawai{
	private int tunjangan = 700000;
	
	public Manajer(String nama){
		super.nama = nama;

	}
	
	public void tampilData(){
		System.out.println("nama : "+super.nama+",Gaji Pokok : "+super.gajiPokok+ "\nTunjangan :"+tunjangan);
	}
	
}