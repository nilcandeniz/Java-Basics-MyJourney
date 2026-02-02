package GenericClass;

public class Veritabani <T>{
	


	public T kaydet(T obje) {   // buranın değişken bir yapıya bürünmesini istiyoruz
		
		// Veritabanına kaydetme işlemi yaptığını hayal et
		System.out.println("veritabanına kaydedildi...");
		
		return obje ;
		
		
	}
	
    public void sil( T obje) {
	
		System.out.println("veritabanından silindi...");
    }

}
