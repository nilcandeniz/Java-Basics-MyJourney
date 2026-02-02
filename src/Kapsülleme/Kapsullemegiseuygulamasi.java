package Kapsülleme;

import java.util.Random;
import java.util.Scanner;

public class Kapsullemegiseuygulamasi {

	
	public static void main(String[] args) {
		
		// Gişe uygulaması yapalım tc si doğru ise sıra versin, yanlış girerse uyarsın.
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("GİŞE UYGULAMASINA HOŞGELDİNİZ!");
		System.out.print("Lütfen TCKN Giriniz: ");
		
		String tckn = scanner.nextLine();
		
		TCKN tcknNesne = new TCKN();
		tcknNesne.setTckn(tckn);
		
		// random rastgele değer üretmek için kullanılan bir sınıftır.
		
		}

}
  class TCKN {
	  private long id;
	  private String dogumYeri;
	  private String tckn;
	  
	  
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDogumYeri() {
		return dogumYeri;
	}
	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}
	public String getTckn() {
		return tckn;
	}
	
	boolean kontrol = true;
	
	public void setTckn(String tckn) {
		if(tckn.length()==11) {
			for(int  i=0 ; i <tckn.length() ; i++) {
				char karakter = tckn.charAt(i);
				if(Character.isDigit(karakter)) {
					kontrol = true;
				} else {
					kontrol = false;
					break;
				}
				
			}
			if(kontrol) {
				Random random = new Random();
				
				// 0-100 arasında rastgele bir değer üret
				int giseNo = random.nextInt(100);
				
				System.out.println("GİŞE NO: "+ giseNo);

			} else {
				System.out.println("Lütfen bütün karakterleri rakam olacak şekilde giriniz!");
			}
			
		} else {
			System.out.println("TC 11 karakter olmak zorundadır");
		}
		
		this.tckn = tckn;
	}
	  
	  public void sonucuYazdir(String sonuc) {
		  System.out.println(sonuc);
	  }
	  
  }