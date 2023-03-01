/**
* File		: OperasiTitik.java
* Penulis	: Bima Arya Wijaya
* Deskripsi : kelas berisi class Titik
*/class Titik{
	public double absis;
	public double ordinat;
	private static int counterTitik;

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	/*Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}*/
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	int getCounterTitik(){
		return counterTitik;
	}
}