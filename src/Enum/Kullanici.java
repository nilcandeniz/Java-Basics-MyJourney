package Enum;

public class Kullanici {

	private String kullaniciAdi = "Nilcan";
	
	private String sifre = "123";
	
	public GirisSonuc kontrolEt(String kullaniciAdi , String sifre) {
		if(kullaniciAdi.equals(this.kullaniciAdi)&& sifre.equals(this.sifre)) {
			return GirisSonuc.BASARILI;
		} else {
			return GirisSonuc.BASARISIZ;
		}
		
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	
	
	
}
