package Kapsülleme;

import java.security.PrivateKey;
import java.security.KeyStore.PrivateKeyEntry;

public class deneme {

	public static void main(String[] args) {
		
		/*
		banka eminBanka = new banka(500, "eminBanka");
		
		int withdraw = 300;
		int bakiye = eminBanka.getBakiye();
		
		
		if (bakiye < withdraw) {
			System.out.println("yeterli bakiye yok");
		}else {
			eminBanka.setBakiye(bakiye-withdraw);
			System.out.println("kalan tutar : " + eminBanka.getBakiye());	
		}
		
	}
	*/
		 ogrenci ogrenci = new ogrenci ("Nilcan", 21, 85) ;  
		 
		 int ogrenciAge = 21;
		 String ogrenciName = ogrenci.getName();
		 double notOrtalama = ogrenci.getAverage();
		 
		 if(notOrtalama<=60) {
			 System.out.println("Kaldınız");
		 } else {
			 ogrenci.setAverage(notOrtalama+ogrenciAge);
			 System.out.println("Ortalaman yükseldi ve son ortalaman: " + ogrenci.getAverage());
			 
		 }
		 
		 System.out.println("Yaş: "+ ogrenciAge);
		 System.out.println("İsim: "+ ogrenciName);
		 System.out.println("Ortalama: "+ notOrtalama);
		 
		 

}

/*
class banka {
	private int bakiye;
	private String hesapNo;
	
	public banka(int bakiye,String hesapNo) { 
		this.bakiye = bakiye;
		this.hesapNo = hesapNo;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public String getHesapNo() {
		return hesapNo;
	}

	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;               
		
	    
	}
}
*/
	
}
	
	
class ogrenci {
	private String name;
    private int age;
    private double average;
    
    public ogrenci(String name, int age, double average) {
    	
    	this.name = name;
    	this.age=age;
    	this.average=average;
    	
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
      
    
    
    
}
	
	
      
	

