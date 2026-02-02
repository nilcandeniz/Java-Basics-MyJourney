package döngüler;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		
		
	/* Dizi oluşturma-değer atama-yazdırma
		
		String[] isimDizisi = { "Ali", "Veli","Nilo","Gamoç"} ;
		System.out.println("DIZININ ELEMANLARI");
		System.out.println("---------------------------------------");
		
		for(int i=0; i<isimDizisi.length; i++) {
			System.out.println(isimDizisi[i]);
			}                                           */
		
	/* Diğer veri tipleri ile dizi tanımlama  int-char-double
		
		int[] sayilar = new int[6];
		sayilar[0] = 15;
		sayilar[1]= 46;
		sayilar[2]= 34;
		sayilar[3]= 94;
		sayilar[4]= 72;
		for(int i = 0; i<sayilar.length; i++) {
			System.out.println(sayilar[i]);
		}                                                    */
		
	/* Dizinin elemanlarını kullanıcıdan alma
		
	   Scanner scanner= new Scanner(System.in);
	   
	   System.out.println("Sistem kaç boyutlu olsun: ");
	   int diziUzunluk = scanner.nextInt();
	   scanner.nextLine();
	   
	   String[] isimler = new String[diziUzunluk];
	   
	   for(int i = 0; i<isimler.length; i++) {
		   System.out.println("Dizinin"+ (i)+ ". indeksini giriniz");
		   isimler[i]=scanner.nextLine();
		   
		    }                                                 
		                                */
	/* Foreach Döngüsü Kullanımı
		
	 String[] isimler = {"Enes", "Yakup","Bilal","Yasin","Eren"};
	 for (String a : isimler) {
		 System.out.println(a);
		}    */
		
	/* int[] rakamlar = {0,1,2,3,4,5,6,7,8,9};
	 for (int i : rakamlar) {
		 System.out.println(i);
		}                          */
		
	/* dizinin elemanlarını kullanıcıdan alalım
	// daha sonra dizinin içindeki elemanların asal olanlarını ve olmayanlarını ayrı bir şekilde yazdıralım.
		
	  System.out.println("ASAL SAYI BULMA UYGULAMASINA HOŞGELDİNİZ");
	  System.out.println("*************************************");
	  
	  int asalToplam=0;
	  int asalOlmayanToplam=0;
	  
	  String asalSayilar="";
	  String asalOlmayanSayilar="";
	  
	  boolean asalMi = false;
	  
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("Dizinin eleman sayısını giriniz: ");
	  int diziUzunluk = scanner.nextInt();
	  scanner.nextLine();
	 
	  int[] sayilar = new int[diziUzunluk];
	  
	  for(int i = 0; i<sayilar.length ; i++) {
		  System.out.println("Dizinin"+i+". indeks değerini giriniz.");
		  sayilar[i] = scanner.nextInt();
		  scanner.nextLine();
		  }
	  
	  
	  for (int sayi : sayilar) {
		  for(int j = 2; j<sayi; j++) {
	 
		  if(sayi%j==0) {
			  asalOlmayanToplam+=1;
			  asalOlmayanSayilar+= String.valueOf(sayi)+"";
			  break;
		  } else {
			  asalMi=true;
		  }
		
	}
	 
	   if(asalMi) {
		   asalToplam+=1;
		   asalSayilar+=String.valueOf(sayi)+"";
		   asalMi = false;   
	   }
	   
		 
	  }
	  
	 
	  System.out.println("ASAL BİLGİLERİ");
		 System.out.println("Asal toplam "+ asalToplam +" Asal Sayılar"+ asalSayilar);
		
		 System.out.println("ASAL OLMAYAN BİLGİLERİ");
		 System.out.println("Asal Olmayan Toplam "+ asalOlmayanToplam + " Asal Olmayan Sayılar "+ asalOlmayanSayilar);   */
		
	}
}


