/**
* File		: Poligon.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : representasi dasar dari objek poligon (segi banyak)
*/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
	public void poligon(){
		this.jumlahSisi = 0;
	}
	
	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	}
	
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
}