package Classlar;

import java.lang.reflect.Constructor;

public class classlar {
	
	public static void main(String[] args) {
		
		// Bir sınıf var. Biz bir sınıfın içindeki değişkenlere erişebilmek için
		// o classtan nesne türetmemiz gerekiyor.    new
		
		//Constructor(Yapıcı Metot)
		
		/* ERİŞİM BELİRLEYİCİLERİ (Access Modifiers)
		 * public : her yerden erişilebilir kısıtlama yok
		 * private : sadece bulunduğu class içerisinden erişilebilir
		 * protected : bulunduğu class içinden ve o classı miras alan alt classlardan erişilebilir.
		 */
		
		
	ogrenci ogrenci1 = new ogrenci("kadın");
	
	
	ogrenci1.id=5;
    ogrenci1.isim="Nilcan";	
    ogrenci1.soyisim="Deniz";

	System.out.println("Öğrencinin Bilgileri");
	System.out.println("ID: "+ ogrenci1.id);
	System.out.println("İSİM: "+ ogrenci1.isim);
	System.out.println("SOYİSİM: "+ ogrenci1.soyisim);
	ogrenci1.cinsiyetYazdir();
	
  }
}
