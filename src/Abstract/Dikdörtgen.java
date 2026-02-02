package Abstract;

import java.lang.classfile.Superclass;

public class Dikdörtgen extends GeometrikSekil {
	
	private int kısaKenar;
	private int uzunKenar;	

	
	public Dikdörtgen() {
		
	}
	
	public Dikdörtgen(int kısaKenar, int uzunKenar, String isim) {
		
		this.kısaKenar=kısaKenar;
		this.uzunKenar=uzunKenar;
		super.isim=isim;
	}

	@Override
	public void alanHesapla() {
		
		System.out.println(super.isim + "'in alanı: " + (getKısaKenar()*getUzunKenar()));
		
	}

	public int getKısaKenar() {
		return kısaKenar;
	}

	public void setKısaKenar(int kısaKenar) {
		this.kısaKenar = kısaKenar;
	}

	public int getUzunKenar() {
		return uzunKenar;
	}

	public void setUzunKenar(int uzunKenar) {
		this.uzunKenar = uzunKenar;
	}
	
	
}

