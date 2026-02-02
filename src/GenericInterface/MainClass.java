package GenericInterface;


public class MainClass {

	public static <T> void main(String[] args) {
		                                                            // Interface olarak yakaladığım için daha esnek bir yapı oluyor ve daha hızlı ve performansı yüksek çalışıyor.
		IVeritabani<Musteri> veritabaniImpl = new VeritabaniImpl();  // VeritabaniImpl den bir nesne oluşturdum IVeritabani<Musteri> interface ini implements ettiği için aynı nesneyi karşılayabildi.
		// VeritabaniImpl veritabaniImpl = new VeritabaniImpl();
		
		veritabaniImpl.ekle(null);
		veritabaniImpl.sil(null);
		veritabaniImpl.guncelle(null);
	}


	}

