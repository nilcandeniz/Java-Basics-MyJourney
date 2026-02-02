/*package GenericClass;

public class mainClass {

	public static void main(String[] args) {
		
		// GENERIC CLASS, METHOD IN JAVA - sabit değil değişken bir yapısı olduğundan dinamik yapılıdır!
		// <> -----> Generic yapıların gösterimi     --- Sınıfın içinde T gördüğü heryere o tipi verecek o metodun dönüş tipi ona evrilecek
		
		Veritabani veritabani = new Veritabani();
		veritabani.kaydet(null);   // burada sadece ogrenci parametresini alabiliyor  - generic yapıları kullanıp bu durumu değiştirecez 
		
	//	Veritabani<Ogrenci> veritabani = new Veritabani<Ogrenci>();
		
		Veritabani<Calisan> veritabaniCalisan = new Veritabani<Calisan>();
		Calisan calisan = veritabaniCalisan.kaydet(new Calisan(1L,"Nilcan","Deniz")) ;
		
		System.out.println("ID: " + calisan.getId());
		System.out.println("ISIM: "+ calisan.getIsim());
		System.out.println("SoyIsim: " + calisan.getSoyIsim());

	}

}
     */