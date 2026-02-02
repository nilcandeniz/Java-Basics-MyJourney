package examples3;


// Maaş Hesaplama Sistemi

public class practice {

	public static void main(String[] args) {

		System.out.println("----YAZILIMCI MAAŞ HESAPLAMASI-----");
		// Yazılımcı nesnesi oluşturuluyor- 3 dil biliyor - temel maaş: 15000
		
		Yazilimci nilcan = new Yazilimci("Nilcan", "Deniz", 15000.0 , 3) ;
		double nilcanMaas = nilcan.maasHesapla();
		System.out.println("Nilcan'ın net maaşı:  " + nilcanMaas + "TL\n");
		
	    nilcan.kodYaz();
	    
	    System.out.println("-----\n YÖNETİCİ MAAŞ HESAPLAMASI------");
	    //Yönetici nesnesi oluşturuluyor- 5 kişilik ekip yönetiyor- temel maaş: 25000
	    
	    Yonetici gamze = new Yonetici("Gamze", "Bolat",25000.0, 5);
	    double gamzeMaas = gamze.maasHesapla();
	    System.out.println("Gamze'nin net maaşı: " + gamzeMaas + "TL\n");
	    
	    gamze.toplantıYap();
	    
	    System.out.println("-----\n Polymorphism Girişi(İsteğe Bağlı)------");
	    // Calisan türünde bir referans , Yazilimci nesnesini işaret ediyor
	    Calisan genelCalisan = new Yazilimci("Emin","Kaçan", 10000.0, 2) ; 
	    
	    // Calisan referansı üzerinden çağrılmasına rağmen,
	    // **override edilmiş** Yazılımcı metodu çalışır! (RUNTIME POLYMORPHISM)
	    
	    double eminMaas = genelCalisan.maasHesapla();
		System.out.println("Emin'in(Genel Çalışan Referansı) Net Maaşı: " + eminMaas);
		
	}

}

 class Calisan {
	  private String isim;
	  private String soyIsim;
	  protected double temelMaas;
  
 
     Calisan(String isim, String soyIsim, double temelMaas ) {
	 
	  this.isim = isim;
      this.soyIsim = soyIsim;
      this.temelMaas = temelMaas;
  }
     
         public double maasHesapla() {
    	 System.out.println(isim + "için maaş hesaplanıyor...");
    	 return temelMaas;
     }
         public String getisimsoyIsim() {
        	 return isim + "" + soyIsim ;
         }
 
 }
 
  class Yazilimci extends Calisan {
	 private int bildigiDilSayisi;
	 private final int dilBonusu = 500;  //Her dil için 500 TL Bonus
	 
	  Yazilimci(String isim, String SoyIsim, double temelMaas, int bildigiDilSayisi) {
		super(isim, SoyIsim, temelMaas) ;
		this.bildigiDilSayisi = bildigiDilSayisi;
	}

	@Override
	public double maasHesapla() {
		
		double toplamBonus = bildigiDilSayisi*dilBonusu;
		double netMaas = temelMaas + toplamBonus;
		
		System.out.println(getisimsoyIsim() + "(Yazılımcı) için maaş hesaplandı.");
		System.out.println("Dil Bonusu: " + toplamBonus + "TL(" + bildigiDilSayisi);
		
		return netMaas;
	}
	
	public void kodYaz() {
		System.out.println(getisimsoyIsim() + "kod yazıyor");
	}
	  
  }
 
  class Yonetici extends Calisan {
	  private int yonetilenEkipBuyuklugu;
	  private final double ekipPrimiOrani = 0.10 ; // Temel maasin %10 u kadar ekip prim oranı
	  
	  Yonetici(String isim, String soyIsim, double temelMaas, int yonetilenEkipBuyuklugu) {
		  super(isim, soyIsim, temelMaas) ; 
		  this.yonetilenEkipBuyuklugu = yonetilenEkipBuyuklugu;
	  }

	@Override
	public double maasHesapla() {
		
		double ekipPrimi = yonetilenEkipBuyuklugu*ekipPrimiOrani;
		double netMaas = temelMaas + ekipPrimi;
		
		System.out.println(getisimsoyIsim() + "(Yönetici) için maaş hesaplandı.");
		System.out.println("Ekip primi: " + ekipPrimi + "TL(" + yonetilenEkipBuyuklugu);
		
		return netMaas;
	}
	  
	public void toplantıYap() {
		System.out.println(getisimsoyIsim() + "bir toplantı yönetiyor.");
	}
	  
	
  }
  
  
  /*Inheritance: Yazilimci , Yonetici ve Calisan sınıfından ortak özellikleri ve temel yapıyı miras almıştır (extends).

  Constructor Zinciri (super): Alt sınıflarda nesne oluşturulurken, super(ad, soyad, temelMaas) çağrısı ile üst sınıftaki yapıcı metodun ilk olarak çalışması sağlanmıştır.

  Method Overriding: Temel sınıfın ortak metodu olan maasHesapla(), alt sınıflar (Yazilimci ve Yonetici) tarafından kendi iş kurallarına göre (@Override) yeniden tanımlanmıştır.

  Erişim Belirleyiciler (protected): temelMaas alanının protected tanımlanması, bu alana miras alan alt sınıflardan doğrudan erişim imkanı sağlar.

  Polymorphism (Ekstra): Son kısımda gösterildiği gibi, 
  Calisan referansının bir Yazilimci nesnesini tutması ve doğru maasHesapla() metodunu çalıştırması, inheritance'ın sağladığı en büyük güç olan çok biçimliliğe (polymorphism) giriş yapmanızı sağlar.*/
    