public abstract class Kendaraan{ // ini deklarasi kelas abstrak
	private String merk;
	private String tahun_keluaran;

	protected void pengantar(){ // ini deklarasi method konkrit
		System.out.println("Semua kendaraaan bermotor maupun konvensional");
	}

	protected void warning(){
		System.out.println("Pengendara harap tidak mengendarai kendaraan dalam keadaan mengantuk");
	}

	protected abstract void tipe_kendaraan();

	protected abstract void cara_mengendarai();

	public void setMerk(String merk){
		this.merk=merk;
	}

	public String getMerk(){
		return merk;
	}

	public void setTahunKeluaran(String tahunkeluaran){
		tahun_keluaran = tahunkeluaran;
	}

	public String getTahunKeluaran(){
		return tahun_keluaran;
	}
}
