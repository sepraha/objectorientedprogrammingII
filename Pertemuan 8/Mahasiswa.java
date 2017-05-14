public abstract class Mahasiswa{ // ini deklarasi kelas abstrak
	protected String nama;
	protected String nim;
	protected double ipk;

	protected void tidakLulus(){ // ini deklarasi method konkrit
		System.out.println("Semua mahasiswa tidak ingin tidak lulus");
	}

	//ini deklarasi abstract method atau method abstrak
	protected abstract void lulus();

	protected abstract void kuliah();
}