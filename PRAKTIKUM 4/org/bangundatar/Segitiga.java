/**
* File		: Segitiga.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : representasi objek segitiga, turunan kelas poligon
*/
package org.bangundatar;


import org.poligon.Poligon;
public class Segitiga extends Poligon{
	private double alas, tinggi;
	
	public Segitiga(double alas, double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas2(){
		return (alas*tinggi)/2;
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi());
	}
}