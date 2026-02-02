package static1;

public class ogrenci {

	 private Long id ;
	 private String ad ; 
	 private String soyad ;
	 public static String numara ; 
	 
	 
	 // Static bir metot içerisinde static olmayan hiçbir şeye erişemeyiz. (değişken,metot)
	 
	 public static void numaraYazdir() {
		 
		// System.out.println("Numara: "+ ogrenci.numara);
	 }
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	 
	 

}
