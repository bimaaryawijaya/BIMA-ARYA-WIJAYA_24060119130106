/**
* File		: PegawaiDanGaji.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : main program untuk pegawai dan gaji
*/
public class PegawaiDanGaji{
	public static void main(String[] args){
		Pegawai pegawai = new Programmer("Suki");
		Pegawai pegawai2 = new Manajer("Juki");
		
		Payroll  payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
	}
}