package interface2;

public class BilgisayarMuhendisi extends BaseMuhendis implements IMuhendis{
	
 private String isim;
 
 private String soyisim;
 
 private int tecrübe;
 
 private double maas;
 
 private String askerlikDurum;
 
 private String[] diller;
 
 
	
	
	public BilgisayarMuhendisi(String isim, String soyisim, int tecrübe, double maas, String[] diller) {
		
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
