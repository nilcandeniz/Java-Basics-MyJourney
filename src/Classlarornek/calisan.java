package Classlarornek;

import java.security.PublicKey;

public class calisan {

	  public int no;
	  public String isim;
	  public String soyisim;
	  public double maas;
	  public int tecrübe;
	  
	  
	  
	  public calisan() {
		
	}
	  


	public calisan(int no, String isim, String soyisim, double maas, int tecrübe) { // sağ tık + source
		
		this.no = no;
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
		this.tecrübe = tecrübe;
	}
	
	
    public void calisanBilgilerGoster() {
		  System.out.println("************MAAŞ BİLGİLERİ***********");
		  System.out.println("NO: " + no);
		  System.out.println("İSİM: " + isim);
		  System.out.println("SOYİSİM: " + soyisim);
		  System.out.println("MAAŞ: "+ maas);
		  System.out.println("TECRÜBE:"+ tecrübe);
		  
	  }
      public void zamYap(int zamDegeri) {
    	  System.out.println("Maaşınıza "+zamDegeri+" TL zam yapıldı ");
    	  System.out.println("Güncel Maaşınız: "+ (maas+zamDegeri));
      }
	  public void formatAt(String isletimSistemi , String kim ) {
		  System.out.println(kim + "şu anda"+ isletimSistemi + "işletim sistemine format atıyor");
	  }
	  
	 

}
