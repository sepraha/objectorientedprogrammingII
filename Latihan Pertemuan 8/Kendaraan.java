public abstract class Kendaraan{ // ini deklarasi kelas abstrak
	protected String merk;
	protected String tahun_keluaran;

	protected void pengantar(){ // ini deklarasi method konkrit
		System.out.println("Semua kendaraaan bermotor maupun konvensional");
	}

	protected void warning(){
		System.out.println("Pengendara harap tidak mengendarai kendaraan dalam keadaan mengantuk");
	}

	
	protected abstract void tipe_kendaraan();

	protected abstract void cara_mengendarai();
}
