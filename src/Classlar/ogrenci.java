package Classlar;

public class ogrenci {
        public int id;  // değişken-field-property
        public String isim;
        public String soyisim;
        private String cinsiyet; // dış dünyaya kapalı.
        
        // Ctrl + N ---> yeni class açar
        // Ctrl + space ---> constructor açar
        // method overloading 
        // Ya parametre sayısı farklı olacak
        // Ya da parametre tipleri farklı olacak.
         public ogrenci() {
			
		}
         
         public ogrenci(String p_cinsiyet) {    //Private olan cinsiyeti ekrana bu şekile yazdırabildik
        	cinsiyet = p_cinsiyet;
        	
        }
         public void cinsiyetYazdir() {
        	 System.out.println("Cinsiyet: "+ this.cinsiyet);
         }
        
        
        
     //   public ogrenci(int id) {
        	
     //  }
        
        
        
	public ogrenci(int id, String isim, String soyisim) {
		// Constructor'ların geriye dönüş tipi olmaz!
		// Her sınıfın bir constructor'ı vardır.
		// this: şu an üzerinde çalıştığım class
		this.id=id;
		this.isim=isim;
		this.soyisim=soyisim;
		
	}
	 
	
	
	
	
	
	
	
	
	}


