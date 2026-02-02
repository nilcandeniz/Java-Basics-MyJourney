package kosulYapilari;


import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class kosulYapilari {

	public static void main(String[] args) {
		
	/*	if(5>7) {
			System.out.println("5,7 den kucuktur"); }
		else {
			System.out.println("7, 5 den buyuktur"); }    */
		
	/*vize1 %30 ..... vize2 %30 ..... final %40
	 GECME NOTU 6O
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Adınızı Giriniz: ");
	String isim = scanner.nextLine();
	
	System.out.println("Soyadınızı Giriniz: ");
	String soyisim = scanner.nextLine();
	
	System.out.println("Dersi Giriniz: ");
	String dersIsmi = scanner.nextLine();
	
	System.out.println("Vize1 Notunuzu Giriniz: ");
	double vize1 = scanner.nextDouble();
	
	System.out.println("Vize2 Notunuzu Giriniz: ");
	double vize2 = scanner.nextDouble();
	
	System.out.println("Final Notunuzu Giriniz: ");
	double finalNot = scanner.nextDouble();
	
	double sonuc = (vize1*0.3) + (vize2*0.3) + (finalNot*0.4) ;
	
	if(sonuc>=60) {
		System.out.println(isim + " " + soyisim + " adlı öğrenci " + dersIsmi + " dersinden " + sonuc + " notuyla geçmiştir" );}
	else {
		System.out.println("Kaldınız"); }   */
		
	/* Bir kuruyemişçi toptancıdan;
	 12 kilo leblebiyi kilosunu 3.5 Tl
	 25 kilo fındık kilosunu 15.7 Tl
	 40 kilo badem kilosunu 22 Tl den almıştır
	 bu ürünleri satarken ;
	 ...> leblebinin kilosunu %50 fazlası satmış
	 ...> fındık ise %40 fazlasına
	 ...> badem ise %60 fazlasına satmıştır
	 
	 Kuruyemişçi o günki kazandığı para ile dükkanın kirasını ödemek istemektedir.
	 kira tutarı: 500 Tl 
	 kazandığı para 500 Tl den fazla ise kirayı ödeyebilsin değilse ödeyemesin.  
		
	double leblebi = 3.5;
	double findik = 15.7;
	double badem = 22;
	
	double maliyetTutar = (leblebi*12) + (findik*25) + (badem*40) ; 
	double satisTutar = ((leblebi*1.5)*12) + ((findik*1.4)*25) + ((badem*1.6)*40);
	
	double karTutar = satisTutar - maliyetTutar ;
	
	if(karTutar>=500) {
		System.out.println("Kira ödendi,tebrikler!"); }
		else {
		System.out.println("Yeterli miktara ulaşamadınız!"); }   */
		
	/* Switchcase ile haftanın günleri
		
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Lütfen bir sayı giriniz: ");
	  int sayi = scanner.nextInt();
	  
	  switch(sayi) {
	  case 1:
		  System.out.println("Pazartesi");
		  break;
	  case 2:
		  System.out.println("Salı");
		  break;
	  case 3:
		  System.out.println("Çarşamba");
		  break;
	  case 4:
		  System.out.println("Perşembe");
		  break;
	  case 5:
		  System.out.println("Cuma");
		  break;
	  case 6:
		  System.out.println("Cumartesi");
		  break;
	  case 7:
		  System.out.println("Pazar");
		  break;
		  
		default :
			System.out.println("Lütfen 1 ile 7 arasında bir değer giriniz");
	  }   */
		
	/* Emin Kaçan: IBAN TR1234 000 567 985 345 6572 23 45
		
		
		String islemsecenekleri = "Bakiye Görüntüleme---> 1 "
				                 + "Para çekmek için---> 2 "
				                 + "Farklı hesaba para yatırmak için---> 3"
				                 + "Çıkış için---> q tuşuna basınız";
		
		Scanner scanner = new Scanner(System.in);
		
	  double eminBakiye = 1250;
	  String eminIban = "TR1234 000 567 985 345 6572 23 45";
	  String eminKullanici = "emin22";
	  String eminSifre = "22";
	  
	  double gamzeBakiye = 3500;
	  String gamzeIban = "TR2345 000 646 746 984 8477 74 34";
	  String gamzeKullanici = "gamze21";
	  String gamzeSifre = "21"; 
	  
	 System.out.println("ATM ye hosgeldiniz");
	 System.out.println("Lutfen bilgilerinizi giriniz");
	 
	 System.out.print("Kullanici adi: ");
	 String kullaniciAdi = scanner.nextLine();
	 
	 System.out.println("Sifre: ");
	 String sifreAdi = scanner.nextLine();
	 
	 if(kullaniciAdi.equals("gamze21") && sifreAdi.equals("21")) {
		 System.out.println("Gamze Bolat hesabina giris yapildi");   
	     System.out.println(islemsecenekleri); 
	     
	     System.out.println("Lütfen bir seçim yapınız");
	     String secim = scanner.nextLine();
	     
	     
	 else if(kullaniciAdi.equals("emin22") && sifreAdi.equals("22")) {
		 System.out.println("Emin Kacan hesabina giris yapildi"); 
	     System.out.println(islemsecenekleri); }
	 
	 else {
		 System.out.println("Kullanici adiniz veya sifreniz yanlis!!"); }  */
		
		/* for (int i = başlangıç ; koşul ; arttırma ) {
	}
		
		for(int i = 1 ; i<=10 ; i++) {
			System.out.println(i);  }     */
		
	/* 1 den 10 a kadar olan çift sayıları yazdır
		
	 for (int i = 1; i<=10 ; i++) 
	 {
		
	 if(i%2==0) 
	 {
		 System.out.println(i); }
	 }   */
		
	/* 1 den 10 a kadar olan çift sayıların toplamı 
		
	  int toplam = 0;
		
	  for (int i = 1 ; i<=10; i++) 
	  {
		  if(i%2==0)
		  {
			  toplam+=i;
	  }
	  } 
	  System.out.println("Sonuc: " + toplam);  */
		
	/* Çift sayıların olduğu yere nilo yazdır
		
		for(int i = 1; i<=20; i++) {
			if(i%2==0) {
				System.out.println("nilo"); }
			else {
				System.out.println(i); }  
		} */
		
	/* While 
		int i = 1;
		while(i<=10) {
			if (i%2==1) {
			 System.out.println(i);
			}
			i++;
		}      */
		
	
	/*
	do {
		 System.out.println("Koşul sağlamadığı halde döngü en az bir kez çalıştı");
	} while(1>2);    */
		
		
		
	/*
	int i = 1;
	int toplam = 0 ;
	do {
		if(i%2==0) {
    	toplam+=i;
		}
		i++;
	} while(i<=10);
	System.out.println("Toplam: " + toplam);   */
		
	/* Break-Countinue Kullanımı
		
	int sayiyiBuldunMu;
	for(int i = 1; i<=10; i++)  {
		if(i==4) {
			sayiyiBuldunMu = i;
			break; // döngüyü kır, döngüden çık 
		}
	}    */
		
	/* Continue Kullanımı --> Döngüyü 1 kereye mahsus kırar
	// 1 2 3 4 5 6 (7,8) 9 10
		
	 for(int i =1; i<=10; i++) {
		 if(i==7 | i==8) {
			 continue;
		 }
		 System.out.println(i);
		  }                           */
		
	/* Çarpım Tablosu Yapımı 
		
	for(int i = 1; i<=10; i++) {
		for(int j=1; j<=10; j++) {
			System.out.println(i + "x"+ j + "=" + (i*j));
		}
		System.out.println("----------------------");
	}
	                                                              */
		
	 /* ASAL SAYI BULMA UYGULAMASI
     // 2-3-4-5-6  <----> 7 
		
		Scanner scanner = new Scanner(System.in);
		boolean asalMi = false ; 
		
		System.out.println("Asal sayı bulma uygulamasına hoşgeldiniz!");
		System.out.println("Lütfen bir sayı giriniz");
		
		int sayi = scanner.nextInt();
		
		for(int i = 2; i<sayi; i++) {
			if(sayi%i==0) {
				asalMi = false;
				break;  
			} else {
				asalMi = true;
			}
		}
		    if(asalMi) {
		    	System.out.println("Girdiğiniz "+ sayi + " sayisi asaldır");
		    } else {
		    	System.out.println("Girdiğiniz "+ sayi + " sayisi asal değildir");
		    }                                                                           */
		
		
		
	
}
}		 
		

	 
	  
	  
	  
	  
	  
	  
	  
	
	 
		
	
		


