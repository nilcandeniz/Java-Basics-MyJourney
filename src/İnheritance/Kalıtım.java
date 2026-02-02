package İnheritance;

import java.nio.channels.Pipe.SourceChannel;

public class Kalıtım {

	public static void main(String[] args) {
		
		// Kalıtımın en büyük avantajı üst sınıflarda tanımlanan metot ve değişkenleri tekrar tekrar yazmaktan kurtarmasıdır.
		
		/**
		 * Bir classı yüzlerce class miras alabilir, sadece bir kişiyi miras alabilir.
		 * Protected erişim beliirleyicisi nedir?   miras alan class içinde metot oluşturup ulaşabildiğimiz değerdir.
		 * Yapıcı metotların çalışma yapısı
		 * Method override kavramı
		 * this, super, super() -----> kullanımı
		 */
		
		hayvan hayvan = new hayvan();
		hayvan.nefesAl();
		
		System.out.println("---------------------");
		
		kopek kopek = new kopek();
		kopek.nefesAl();
		

	}

}
