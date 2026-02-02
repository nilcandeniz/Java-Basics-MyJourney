package Kapsülleme;

public class Kapsülleme {

	public static void main(String[] args) {
		
		calisan calisan = new calisan();
		
		calisan.setId(15L);
		calisan.setMaas(3500);
		
		System.out.println("Çalışanın id'si"+  calisan.getId());
		System.out.println("Maaş: "+ calisan.getMaas());
		
		// değişkeni private ile sakladım
		// set metodu ile erişip değer atadım
		// get metodunu kullanarak değerine eriştim
		
		

	}

}
