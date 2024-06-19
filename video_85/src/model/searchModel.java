package model;

public class searchModel {
	private String vanban;
	private String tukhoa;
	private String ketqua;
	public searchModel() {
		this.ketqua = "";
		this.tukhoa = "";
		this.vanban = "";
		
	}
	public String getVanban() {
		return vanban;
	}
	public void setVanban(String vanban) {
		this.vanban = vanban;
	}
	public String getTukhoa() {
		return tukhoa;
	}
	public void setTukhoa(String tukhoa) {
		this.tukhoa = tukhoa;
	}
	public String getKetqua() {
		return ketqua;
	}
	public void setKetqua(String ketqua) {
		this.ketqua = ketqua;
	}
	
	public void Search() {
		int vt = 0;
		int dem = 0;
		while(true) {
			int i = this.vanban.indexOf(this.tukhoa,vt);
			if(i == -1) {
				break;
			}
			else {
				dem++;
				vt = i + 1;
			}
			this.ketqua = "Ket qua: co " + dem + " " + this. tukhoa;
			System.out.println(this.ketqua);
		}
	}
	
}
