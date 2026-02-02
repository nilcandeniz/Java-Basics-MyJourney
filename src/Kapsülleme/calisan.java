package Kapsülleme;

public class calisan {
   
	 // Constructor-----getter setter(kapsülleme)
	
	private Long id;
	private String soyisim;
	private String isim;
	private int maas ;
	
	public calisan() {
		
	}
	
	public calisan(Long id, String soyisim, String isim, int maas) {
		
		this.id = id;
		this.soyisim = soyisim;
		this.isim = isim;
		this.maas = maas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
		
		
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		if(maas>=1000 && maas<=5000) {    // verinin güvenliğini sağladık
			this.maas = maas;
		}
		
	}
	
	

}
