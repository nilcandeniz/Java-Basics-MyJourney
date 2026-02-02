package GenericInterface;



public class VeritabaniImpl implements IVeritabani<Musteri>{

	@Override
	public void ekle(Musteri clazz) {
		System.out.println("Müşteri eklendi");
		
	}

	@Override
	public void sil(Musteri clazz) {
		System.out.println("Müşteri silindi");
		
	}

	@Override
	public void guncelle(Musteri clazz) {
		System.out.println("Müşteri güncellendi");
		
	}

}
