package interface2;

public class MakineMuhendisi extends BaseMuhendis implements  IMuhendis{
	
	public MakineMuhendisi() {
		
	}

	public MakineMuhendisi(String isim, String soyisim, int tecrübe, double maas, String[] diller) {
		setIsim(isim);
		setSoyisim(soyisim);
		setMaas(maas);
		setTecrübe(tecrübe);
		setAskerlikDurum(askerlikDurum);
		setDiller(diller);
		
		
	}
	@Override
	public void bilgileriYazdir() {
		System.out.println("İsim:  "+ getIsim());
		System.out.println("Soyisim:  "+ getSoyisim());
		System.out.println("Tecrübe:  "+ getTecrübe());
		System.out.println("Maaş:  "+ getMaas());
		System.out.println("Askerlik Durum:  "+ getAskerlikDurum());
		System.out.println("Diller:  ");
		for (String dil : getDiller()) {
			System.out.println(dil+ " , ");
			
		}
		
	}

	@Override
	public void askerlikYapildiMi(boolean deger) {
		if(deger) {
			setAskerlikDurum("Askerlik Yapıldı...");
		} else {
			setAskerlikDurum("Askerlik Yapılmadı...");
		}
		
		
	}

	
	
	

}
