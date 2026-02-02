package practice;

public class Main {

	public static void main(String[] args) {
		
	Mudur Mudur = new Mudur("Nilcan", "Deniz", 50000.0) ;
	Isci Isci = new Isci("Emin", "Kaçan", 35000.0) ;
	
	Mudur.maasHesapla();
    Isci.maasHesapla();
    
    System.out.println("----------------------------");
    
    krediKarti kk = new krediKarti() ;
    nakit nakit = new nakit() ;
    
    kk.odemeYap(1000);
    nakit.odemeYap(1000);
    

	}

} // Çalışan Yönetim Sistemi
 abstract class calisan {
	 
	 String ad;
	 String soyad;
	 double temelMaas ;
	 
  public calisan(String ad, String soyad ,double temelMaas) {
	  this.ad = ad;
	  this.soyad = soyad;
	  this.temelMaas = temelMaas;
  }
  
  abstract void maasHesapla() ;
  }
 
  class Mudur extends calisan {
	  public Mudur(String ad , String soyad , double temelMaas) {
		  super(ad, soyad, temelMaas) ;
	  }

	@Override
	void maasHesapla() {
		double toplamMaas = temelMaas + 500 ;
		System.out.println(""+ ad + " "+soyad + " Müdür Maaşı: " + temelMaas + "TL(500 TL BONUS DAHİL)");
	}
  }
  
   class Isci extends calisan {
	   int  mesaiSaati ;
	   public Isci(String ad , String soyad , double temelMaas) {
		  super(ad, soyad, temelMaas) ;
		  this.mesaiSaati = mesaiSaati ;
	   }
	@Override
	void maasHesapla() {
		double toplamMaas = temelMaas + (mesaiSaati * 100) ;
		System.out.println("" + ad + " " + soyad + " İşçi Maaşı:" + temelMaas + "TL(MESAİ DAHİL)");
		
	}
   }  // Ödeme Yöntemleri
   
   abstract class odemeYontemi {
	   
	   abstract void odemeYap(double tutar) ;
	   
   }
   
   class krediKarti extends odemeYontemi {

	@Override
	void odemeYap(double tutar) {
		double komisyon = tutar * 0.02; 
		double toplam = tutar + komisyon ;
		System.out.println("Kredi kartı ile " +  tutar + " TL ödeniyor...");
		System.out.println("%2 komisyon alındı " + komisyon + " TL toplam çekilen " + toplam + "TL");
		
	}
	   
   }
   
   class nakit extends odemeYontemi {

	@Override
	void odemeYap(double tutar) {
		System.out.println("Nakit ile " + tutar + "TL ödeniyor");
		System.out.println("İndirim uygulandı. Ödenen tutar:" + tutar + "TL");
		
	}
	   
   }