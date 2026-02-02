package practice2;

public class sinav3 {

	public static void main(String[] args) {
	    double kutle = 70.0;
	    double aci = 30.0;
	    
	    double kuvvet = Kayak.TOPRAK.Hesapla(kutle, aci);
	    System.out.println("Toprak zemindeki inme kuvveti: " + kuvvet);
	}

}

 enum Kayak {
    // Enum sabitleri ve onlara atanan sürtünme katsayıları
    KAR(0.21),
    TASLIK(0.34),
    TOPRAK(0.47);

      double katsayi;
      double g = 9.18; // Soruda verilen yerçekimi ivmesi

    // Constructor: Katsayıyı her enum değerine atar
    Kayak(double katsayi) {
        this.katsayi = katsayi;
    }

    public double Hesapla(double m, double alpha) {
        // Java'daki Math.sin fonksiyonu radyan ile çalışır, 
        // dereceyi radyana çevirmeliyiz.
        double radyan = Math.toRadians(alpha);

        // Sorudaki formül: N = m * g * sin(alpha)
        double N = m * this.g * Math.sin(radyan);

        // Sürtünme kuvveti: Fs = k * N
        double Fs = this.katsayi * N;
        
       return Fs;
    }
}
