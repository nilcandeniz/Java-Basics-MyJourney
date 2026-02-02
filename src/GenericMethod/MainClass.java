package GenericMethod;

public class MainClass {

	public static void main(String[] args) {
		
		Integer[] intDizi = { 1,2,3,4,5};
		
		String[] StringDizi = {"Ali","Osman","Burak","Berk","Mert"};
		
		Double[] doubleDizi = {2.5,3.2,7.4,9.5,2.7};
		
		System.out.println("INT DIZI");
		System.out.println("--------------------");
		yazdir(intDizi);
		
		System.out.println("STRING DIZI");
		System.out.println("---------------------");
		yazdir(StringDizi);
		
		System.out.println("DOUBLE DIZI");
		System.out.println("--------------------");
		yazdir(doubleDizi);
		
		}
	public static <T> void yazdir(T[] dizi) {
		for (T deger : dizi) {
			
			System.out.println(deger);
		}
	}

	/* public static void yazdır(Integer[]dizi) {  // Main method unun içindeki fonksiyona erişebimemiz için static tanımlamamız gerekir!
		 
		 for (Integer deger : dizi) {
			System.out.println(deger);
			
		}
	 }
    public static void yazdır(String[]dizi) { 
		 
		 for (String deger : dizi) {
			System.out.println(deger);
			
		}
	 }
    public static void yazdır(Double[]dizi) {
		 
		 for (Double deger : dizi) {
			System.out.println(deger);
			
		}
	 }      --BU KOD SADECE GÜNÜ KURTARIR BUNLARI GENERIC METHODLA YAPACAZ  */
	
}
