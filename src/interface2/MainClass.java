package interface2;

public class MainClass {

	public static void main(String[] args) {
		
		BilgisayarMuhendisi bilgisayarMuhendisi = new BilgisayarMuhendisi("Nilcan" , "Deniz" , 3 , 3500 , new String[] {"SQL","Java","C++"}) ;
		
		MakineMuhendisi makineMuhendisi = new MakineMuhendisi("Gamze", "Bolat", 5 , 5000, new String[] {"C", "Spring","C#"});
		
		System.out.println("BİLGİSAYAR MÜHENDİSİ");
		muhendisBilgileriYazdir(bilgisayarMuhendisi);
		System.out.print("------------------------");
		System.out.println("MAKİNE MÜHENDİSİ");
		muhendisBilgileriYazdir(makineMuhendisi);
		
		
		
		}

	/* public static void muhendisBilgileriYazdir(BilgisayarMuhendisi bilgisayarMuhendisi) {
		bilgisayarMuhendisi.askerlikYapildiMi(true);
		bilgisayarMuhendisi.bilgileriYazdir();
		
	}
	
	public static void muhendisBilgileriYazdir(MakineMuhendisi makineMuhendisi) {
		makineMuhendisi.askerlikYapildiMi(false);
		makineMuhendisi.bilgileriYazdir();
		
	} */
	
	  public static void muhendisBilgileriYazdir(IMuhendis muhendis) {
		  muhendis.askerlikYapildiMi(true);
		  muhendis.bilgileriYazdir();
	  }
	}
