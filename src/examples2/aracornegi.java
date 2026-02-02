package examples2;

import java.util.Scanner;

public class aracornegi {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ARAÇ UYGULAMASINA HOŞGELDİNİZ!");
		System.out.println("Lütfen bir seçim yapınız.");
		String giris = "1-Kamyon\n"
		             + "2-Motorsiklet" ;
		System.out.println(giris);
		
		int secim = scanner.nextInt();
		if(secim==1) { // kamyon
			
			int trafikCezaTutari = 750;
			
			kamyon kamyon = new kamyon(1 , "KAMYON","RENK",40000, 4, "marka1","model1",trafikCezaTutari);
			
		     System.out.println("Kamyon un bilgilerini göster\n"
					 +"2-Trafik cezası öde");
			int kamyonSecim = scanner.nextInt();
			
			if(kamyonSecim==1) {
				kamyon.aracBilgileriGoster();
				
			} else if(kamyonSecim==2) {
				kamyon.trafikCezasiOde(trafikCezaTutari);
				
			} else {
				System.out.println("Lütfen kamyon için geçerli bir rakam giriniz");
			}
			
			
		} else if(secim==2) { // motorsiklet
			
		} else {  // geçersiz işlem
			System.out.println("Lütfen belirtilen aralıkta bir değer girişi yapınız");
		}
		             
	}
 }
 
 
 
 

 class araclarOrnek {


   private int id;
   private String aracİsmi;
   private String renk;
   private int fiyat ;
   private int lastikSayisi ;
   private String marka ;
   private String model ;
   
   public araclarOrnek() {
	   
   }
  
public araclarOrnek(int id, String aracİsmi, String renk, int fiyat, int lastikSayisi, String marka, String model) {
	super();
	this.id = id;
	this.aracİsmi = aracİsmi;
	this.renk = renk;
	this.fiyat = fiyat;
	this.lastikSayisi = lastikSayisi;
	this.marka = marka;
	this.model = model;
 }
public void aracBilgileriGoster() {
	System.out.println("ARAÇ BİLGİLERİ");
	System.out.println("-----------------------");
}

public void trafikCezasiOde(int cezaTutar) {
	System.out.println("TRAFİK CEZASI");
	System.out.println("-------------------------");
}

public int getId() {
	return id;
}

public void setId( int id) {
	this.id = id;
}

public String getAracİsmi() {
	return aracİsmi;
}

public void setAracİsmi(String aracİsmi) {
	this.aracİsmi = aracİsmi;
}

public String getRenk() {
	return renk;
}

public void setRenk(String renk) {
	this.renk = renk;
}

public double getFiyat() {
	return fiyat;
}

public void setFiyat(int fiyat) {
	this.fiyat = fiyat;
}

public int getLastikSayisi() {
	return lastikSayisi;
}

public void setLastikSayisi(int lastikSayisi) {
	this.lastikSayisi = lastikSayisi;
}


public String getMarka() {
	return marka;
}

public void setMarka(String marka) {
	this.marka = marka;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

   
}
  class kamyon extends araclarOrnek {
		
		private int trafikCezaTutari;
		
		
		public kamyon() 
		{
			
		}
	    public kamyon(int id, String aracİsmi, String renk, int fiyat, int lastikSayisi, String marka, String model,int trafikcezasi) {
	    	
	    	setId(id);
	    	setAracİsmi(aracİsmi);
	    	setFiyat(fiyat);
	    	setLastikSayisi(lastikSayisi);
	    	setMarka(marka);
	    	setModel(model);
	    	setRenk(renk);
	    	setTrafikCezaTutari(trafikcezasi);
	    }
	    
		@Override
		public void aracBilgileriGoster() {
			super.aracBilgileriGoster();
			
			System.out.println("ID:   " + getId());
			System.out.println("ARAC ISMI:   " + getAracİsmi());
			System.out.println("FIYAT:  " + getFiyat());
			System.out.println("LASTIK SAYISI:  " + getLastikSayisi());
			System.out.println("MARKA:  " + getMarka());
			System.out.println("MODEL:  " + getModel());
			System.out.println("RENK:  " + getRenk());
			System.out.println("trafikcezası:  " + getTrafikCezaTutari());

		}
		@Override
		public void trafikCezasiOde(int cezaTutar) {
			super.trafikCezasiOde(cezaTutar);
			
			System.out.println(getAracİsmi() + "tipli aracın trafik cezası tutarı:" + getTrafikCezaTutari());
			
		}
		public int getTrafikCezaTutari() {
			return trafikCezaTutari;
		}
		public void setTrafikCezaTutari(int trafikCezaTutari) {
			this.trafikCezaTutari = trafikCezaTutari;
		}
	    
	    
	}
 
