package Metotlar;

public class Metotlar {

	public static void main(String[] args) {
		
	// Parametresiz ve geriye değer döndürmeyen metot tanımlama
	// Parametreli ve geriye değer döndürmeyen metot tanımlama
		
	// Parametreli ve geriye değer döndüren metot tanımı- return
		
	 // isimYazdir();
	 //topla(15,7);
	 //isimSoyisimYazdir("Nilcan ","Deniz");
	 //int metottanGelenSonuc = carp(5, 4);
		String donenDeger = isimDondur("Nilo");
	
	
	}
	//1. return ifadesi bir değeri döndürmek için kullanılır
	//2. bir metodu sonlandırmak için kullanılır 
	public static String isimDondur(String isim)
	{
		return isim;
	}
	
	
	public static int carp(int sayi1 , int sayi2 )
	{
		
	int sonuc = sayi1*sayi2;
	return sonuc;
	}
	
	
	
	
	public static void isimSoyisimYazdir(String isim ,String soyisim ) 
	{
		System.out.println("isim ve soyisim: "+ (isim + "" + soyisim )); 
	}
	
	
	
	public static void topla (int sayi1, int sayi2 )
	{
		int sonuc = sayi1 + sayi2 ;
		System.out.println("Sonuç: "+ sonuc);
	}
// 1 kez yaz istediğin yerde çağır ve kullan
	
/* erisim_belirleyicisi donus_tipi adi() 
 * 
 * metotlar size hizmet eden kod blocklarıdır. Bir kere yazar her yerde kullanabilirsiniz
 */
	public static void  isimYazdir()
	{
		System.out.println("Nilo");
	}
}
