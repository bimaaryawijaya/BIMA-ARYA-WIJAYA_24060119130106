/**
* File		: MKubus.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : driver class untuk kubus menjalankan fungsi Luas Permukaan dan Volume kubus
*/

package org.main;

import org.bangunruang.*;
import org.bangundatar.BujurSangkar;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar persegi = new BujurSangkar(4);
		Kubus kubus = new Kubus(persegi);
		System.out.println("Luas Permukaan kubus dgn panjang sisi 4 satuan: "+kubus.hitungLuasAlas());
		System.out.println("Volume kubus dgn panjang sisi 4 satuan: "+kubus.hitungVolume());
	}
}