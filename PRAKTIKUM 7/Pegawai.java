/**
* File		: PegawaiDanGaji.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : class pegawai sebagai super class
*/
public class Pegawai{
	public String nama;
	public int gajiPokok = 5000000;
	
	public void setNama(String nama){
		this.nama = nama;
	}
	public void tampilData(){
		System.out.println("Nama : " + this.nama + ", Gaji Pokok : " + this.gajiPokok);
	}
}