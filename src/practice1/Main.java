package practice1;

public class Main {

	public static void main(String[] args) {
		
		Kutu<String> adKutusu = new Kutu<>() ;
		adKutusu.ekle("Nilo");
		System.out.println("Ad Kutusu İçeriği:" + adKutusu.getir());
		
		Kutu<Integer> sayiKutusu = new Kutu<>() ;
		sayiKutusu.ekle(38);
		System.out.println("Sayı Kutusu İçeriği:" + sayiKutusu.getir());
		
		System.out.println("---------------------------------------");
		
		Ikili<String,Integer> not = new Ikili("Matematik", 90) ;
		not.yazdir();
		
		Ikili<Integer,String> ogrenci = new Ikili(21, "Nilcan") ;
		ogrenci.yazdir();

	}

}

 class Kutu<T> {
	 
	 private T nesne ;
	 
	 public void ekle(T nesne) {
		 this.nesne = nesne;
		 
	 }
	 
	 public T getir() {
		return nesne;
		 
		 
	 }
 }
 
 class Ikili<K,V> {
	 private K nesne1 ;
	 private V deger1 ;
	 
	 public Ikili(K nesne1 , V deger1) {
		 this.nesne1 = nesne1 ;
		 this.deger1 = deger1 ;
	 }
	  
	 public void yazdir() {
		 System.out.println("K nesnesi: " + nesne1 + " V degeri: " + deger1);
	 }
 }