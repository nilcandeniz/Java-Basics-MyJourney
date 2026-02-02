package practice2;

public class sinav {

	public static void main(String[] args) {
		
		Fatura f1  = new Fatura(1);
		
		f1.chatbotRolu = new Chatgbt();
		f1.chatbotRolu.addButce(5, 5, "öğrenci");
		
		f1.chatbotRolu = new gemini();
		f1.chatbotRolu.addButce(5, 5, "biresysel");
		
		f1.platformRolu = new digiturk();
		f1.platformRolu.addFiyat(115, 100);
		
		f1.platformRolu = new netflix();
		f1.platformRolu.addFiyat(12, 10);
		
           
	}

}


class Fatura { 
	int uniqueId;
	int odemeTutar;
	Platform platformRolu;
	Chatbot chatbotRolu;
	
	public Fatura(int uniqueId) { 
		this.uniqueId = uniqueId;
	}
	
	public void ekleBordro(int[] fiyat) { 
		
	}
}

abstract class Chatbot { 
	int llmNo;
	int ucret;
	
	abstract void addButce(int soru,int sure,String user);
	 void setUcret(int ucret) {
		 this.ucret = ucret;
	 }
}

abstract class Platform {
	String platformAd;
	int ucret;
	
	abstract void addFiyat(int sure,int abonman);
	 void gosterTutar() { 
		 System.out.println("tutar yazıldı");
	 } 
}

class Chatgbt extends Chatbot { 
	double acilisFiyat = 140.55; 
	double toplamUcret;
	@Override
	void addButce(int soru,int sure,String user) { 
		double soruTutar = soru * 2.15;
		double sureTutar = sure * 0.45;
		
		toplamUcret = acilisFiyat + soruTutar + sureTutar;
		
		if(user.equals("öğrenci")) { 
			toplamUcret -= (toplamUcret*15)/100; 
		}
		
		System.out.println("toplam tutar : " + toplamUcret);
		
	}
	
}

class gemini extends Chatbot { 
	double acilisFiyat = 105.33;
	double toplamUcret;
	@Override
	void addButce(int soru, int sure, String user) {
		double soruTutar = soru * 3.84;
		double sureTutar = sure * 0.11;
		
		toplamUcret = soruTutar + sureTutar + acilisFiyat;
		
		if(user.equals("kurumsal")) { 
			toplamUcret += (toplamUcret*15) / 100;
		}
		
		System.out.println("toplam ücret : " + toplamUcret);
		
	}
}


class digiturk extends Platform {	
	int kdvTutar = 100;
	@Override
	void addFiyat(int sure, int abonman) {
		int artis11 = (abonman *11) /100;
		int artis20 = (abonman *20) /100;
		int artis21 = (abonman *21) /100;
		int artis50 = (abonman *50) /100;
		
		if (sure > abonman+ artis11 && sure < abonman + artis20) {
			System.out.println("toplam ücret 150 tl dir ");
		}else if(sure > abonman + artis21 && sure < abonman + artis50 ) { 
			int toplamTutar = 350 + ((kdvTutar*13)/100);
			System.out.println("toplam ücret : " + toplamTutar);
		}
		
	} 
	
}

class netflix extends Platform {

	@Override
	void addFiyat(int sure, int abonman) {
		int artis9 = (abonman *9) /100;
		int artis35 = (abonman *35) /100;
		int artis51 = (abonman *51) /100;
		int artis80 = (abonman *80) /100;
		if (sure > abonman+ artis9 && sure < abonman + artis35) {
			System.out.println("420 tl eklendi ");
		}else if(sure > abonman + artis51 && sure < abonman + artis80 ) { 
		
			System.out.println("1400 tl ekleme yapıldı ");
		}
		
		
		
	} 
	
	
}