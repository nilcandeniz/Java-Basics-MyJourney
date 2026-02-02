package Enum;

import İnterface.interface2;

public class mainClass {

	public static void main(String[] args) {
	
		Kullanici kullanici = new Kullanici();
		GirisSonuc sonuc = kullanici.kontrolEt("Nilcan", "123") ; 
		
		if(sonuc==GirisSonuc.BASARILI) {
		  System.out.println("Başarılı giriş!");
		} else {
			System.out.println("Hatalı giriş!");
		}

	}

}
