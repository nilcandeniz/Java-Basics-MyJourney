package Abstract;

public class Ucgen extends GeometrikSekil{
	
	private int yukseklik;
	private int taban;
	
 public  Ucgen() {
	 
 }
 
 public Ucgen(int yukseklik , int taban) {
	 
	 this.taban = taban;
	 this.yukseklik = yukseklik; 
	 isim="Üçgen";
	 
 }	 
 
	

	@Override
	public void alanHesapla() {
		
		System.out.println(isim + "'in alanı: "+ (getTaban()*getYukseklik())/2);
		
	} // Bir abstract class ı miras aldığımızda o abstract class ın içindeki abstract metotları override etmek zorundayız!

	public int getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}

	public int getTaban() {
		return taban;
	}

	public void setTaban(int taban) {
		this.taban = taban;
	}
	
 

}
