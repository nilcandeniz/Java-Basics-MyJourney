package datatypes02;


import java.util.Scanner;

public class java2 {

	public static void main(String[] args) {
		
	/*	-128 - +128 arasında değerler alır
	byte sayi = -128;
   System.out.println(sayi); */
		
    /* -32768 - +32768 arasında değerler alır
	 short sayi = 32000;
	 System.out.println(sayi); */
		
	/* 9 basamağa kadar çıkan sayılar için kullanılır
     int sayi = 3456098;
     System.out.println(sayi); */
		
	/*çok büyük sayılar için 
	  long maxdeger = Long.MAX_VALUE;
	  System.out.println(maxdeger); 
	  long mindeger = Long.MIN_VALUE;
	  System.out.println(mindeger); 
		
	  long sayi = 37557487877L;
	  System.out.println(sayi); */
		
    /* ondalıklı sayılar için ve noktadan sonra en çok 7 bas.
		float maxdeger = Float.MAX_VALUE;
		System.out.println(maxdeger);
		float mindeger= Float.MIN_VALUE;
		System.out.println(mindeger); 
		
		float ondaliklisayi = 6.87367F;
		System.out.println(ondaliklisayi); */
		
	/* ondalıklı sayılar için ve noktadan sonra max 17 bas.
		double sayi = 3.478547685755545;
		System.out.println(sayi);  */
		
	/*	boolean sonuc = 5>2;
		System.out.println(sonuc); */
		
	/* karakter tanımlamak için kullanılır
	 char veri tipi tek bir karakteri tutabilir
	 char veri tipi ile tanımlanan değerler tek tırnak içinde yazılır
	 char karakter = 'n';
	 System.out.println(karakter); */
	
	/* metinsel ifadeler için kullanılır
	 String metin = "Nilcan Deniz"
	          + " 2004 dogumluyum";
	 System.out.println(metin); */
	
	/* + - operatörleri
		int vize1 = 58;
		int vize2 = 72;
		int finalnot = 93;
		int sonuc = (vize1 + vize2 + finalnot)/3;
		System.out.println("Ders Gecme Notunuz:" + sonuc);  */
		
	/*   *  /  operatörleri
		int sayi1 = 20;
		int sayi2 = 2;
		int sayi3 = 5;
		int sonuc = (sayi1*sayi2) / sayi3;
		System.out.println(sonuc);    */
		
	/*    %(mod alma) operatörü
		int sayi1 = 29;
		int sayi2 = 9;
		int sonuc = 29%9;
		System.out.println("Kalan:" +sonuc);  */
		
	/*  arttırma: ++ ....> bir arttırır
		azaltma : -- ....> bir azaltır
	  int a = 4;
	  a++;
	  a++;
	  
	  a--;
	  a--;
	  System.out.println(a); */
		
	/* 
	  int a = 5;
	a%= 4;
	a+= 2;
	a-= 1;
	a*= 5;
	a/= 5;
	System.out.println(a);  */
		
   /* Relational operatörs
   ==
   !=
   <
   >
   >=
   <= 
   int sayi1 = 3;
   int sayi2 = 2;
   boolean sonuc = sayi1 == sayi2;
   System.out.println(sonuc);   */
		
   /*
    && ve
    || veya
    !  değil  ...> sonucun zıttını almak için kullanılır
    ?: üçlü operatör 
    
   int sayi1 = 3;
   int sayi2 = 2;
    
    boolean a = !true;
	boolean sonuc = a>2 && b<1 ;
	boolean sonuc = a>2 || b<1 ;
	boolean sonuc = a>4 ? true : false; 
	
	String sonuc = a>7 ? "Evet buyuktur" : "Hayir kucuktur";
	
	System.out.println(a);  */
		
	/* Kullanıcıdan değer alma nasıl yapılır?
		nextLine() -> String
		nextFloat() -> Float
		nextInt() -> Integer
		nextByte() -> Byte
		nextDouble -> Double  
		
     Scanner scanner = new Scanner(System.in);
	
	
    System.out.println("Adinizi giriniz:");
	String isim = scanner.nextLine();
	System.out.println("Soyadinizi giriniz");
	String soyisim = scanner.nextLine();
	System.out.println("Adiniz: " + isim + " Soyadiniz "+ soyisim);   
	
	System.out.println("Yasinizi giriniz: ");
	int yas = scanner.nextInt();
	System.out.println("Yasiniz: " + yas);  
	
	System.out.print("Kilonuzu giriniz");
	double kilo = scanner.nextDouble();
	System.out.println("Kilom: " + kilo);  */ 
     
    /* String tipinden int tipine dönüştürme
     
     String a = "5";
     
     int b = Integer.valueOf(a);
     
     System.out.println(b+2);
                                    */
	/* String a = "5";
	
	int b = Integer.parseInt(a);
	System.out.println(b+10);       */
		
	/*Int tipinden string tipine dönüştürme
		
	int a = 21 ;
	String b = String.valueOf(a);
	System.out.println(b+5);        */
		
	/* Double tipinden int tipine dönüştürme
	   int tipinden double tipine dönüştürme
		
	double a = 5.50 ;
	int b = (int)a;
	System.out.println(b); 
	
	int a = 5 ;
	double b = (double)a;
	System.out.println(b);          */
		
	/* float tan long tipine dönüştürme
	   long tan float tipine dönüştürme
		
	float a = 14f;
	long b = (long)a;
	System.out.println(b);          
		
	long a = 5;
	float b = (float)a;
	System.out.println(b);          */
		
	/* long tipinden string tipine dönüştürme
		
	long a = 3;
	String b = String.valueOf(a);
	System.out.println(b+2);         */
		
	/* float tipinden string tipine dönüştürme
		
	float a = 2.45f;
	String b = String.valueOf(a);
	System.out.println(b);           */
		
	/* byte tipinden string tipine dönüştürme
		
	byte  a = 28;
	String b = Byte.toString(a);
	System.out.println(b+2);          */
		
		
	
	
	
	 
	  
	  
	  
	 
	
     
    
     
		
	
	
	
		
	
		
	
	
		
		
		
	
	
	
	
	
   
		
	
	  
	
	
	
	
	 
	 
	
		

		

	}

}
