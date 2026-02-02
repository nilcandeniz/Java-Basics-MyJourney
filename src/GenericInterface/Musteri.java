package GenericInterface;

public class Musteri {
	
	private Long id;
	
	private String isim;
	
	private String soyIsim;
	
	public Musteri() {
		
	}

	public Musteri(Long id, String isim, String soyIsim) {
		this.id = id;
		this.isim = isim;
		this.soyIsim = soyIsim;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	
	

}

