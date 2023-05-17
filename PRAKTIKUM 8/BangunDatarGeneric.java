/**
* File		: BangunDatarGeneric.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : kelas konstruksi generic untuk BangunDatar
*/
public class BangunDatarGeneric<T2 extends BangunDatar>{
	private T2 bangunDatar;
	
	public void set(T2 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T2 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//Apabila T diganti dengan T2 maka hanya mengganti variabel objek dari class bangun datar sehingga tidak mengubah nilai
//hasil pada saat di compile