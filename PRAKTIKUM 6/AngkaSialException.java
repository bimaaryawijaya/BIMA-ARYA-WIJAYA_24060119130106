/**
* File		: AngkaSialException.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13
*/
public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("Jangan masukkan angka 13 karena angka sial!!!");
	}
}