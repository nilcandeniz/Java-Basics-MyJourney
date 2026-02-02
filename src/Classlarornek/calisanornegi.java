package Classlarornek;

import java.io.DataOutput;
import java.util.Scanner;

public class calisanornegi {

	public static void main(String[] args) {
		// çalışan sınıfını oluşturup iş başlayalım
		
	 System.out.println("**********UYGULAMAYA HOŞGELDİNİZ*******");
	 
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("No değerini giriniz: ");
	 int no = scanner.nextInt();
	 scanner.nextLine();
	 
	 System.out.print("İsim değerini giriniz: ");
	 String isim = scanner.nextLine();
	 
	 System.out.print("Soyisim değerini giriniz: ");
	 String soyisim = scanner.nextLine();
	 
	 System.out.print("Tecrübe değerini giriniz: ");
	 int tecrube = scanner.nextInt();
	 scanner.nextLine();
	 
	 System.out.println("Maaş değerini giriniz: ");
	 double maas = scanner.nextDouble();
	 scanner.nextLine();
	 
	calisan calisan = new calisan(no, isim, soyisim, maas, tecrube) ;
	 
	 
	 
	 String islemler = "1-Çalışan bilgilerini göster\n "
			       + "2-Zam yap\n"
			       + "3-Format at";
	 System.out.println("-----------------------------------------------");
	 System.out.println(islemler);
	 System.out.println("Seçim yapınız: ");
	 int secim = scanner.nextInt();
	 
	 switch (secim) {
	case 1: 
		
		calisan.calisanBilgilerGoster();
		break;
	case 2: 
		System.out.println("Zam değerini giriniz: ");
		int zamDegeri = scanner.nextInt();
		calisan.zamYap(zamDegeri);
		break;
	case 3:
		System.out.println("Kim format atacak: ");
		String kisi = scanner.nextLine();
	     
		System.out.println("İşletim sistemini yazınız: ");
		String isletimSistemi = scanner.nextLine();
		calisan.formatAt(isletimSistemi, kisi );
		break;
		
	
	default:
		System.out.println("LÜTFEN BELİRTİLEN ARALIKTA DEĞER GİRİNİZ");
		break;
	}

	}

}
