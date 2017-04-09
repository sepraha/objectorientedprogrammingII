public class PenggunaanSuperChild extends PenggunaanSuper{
	int num = 10;

	public void tampilkan(){
		System.out.println("Ini tampilan dari sub kelas");
	}

	public void PenggunaanSuper(){
		tampilkan();
		super.tampilkan();
		System.out.println("Nilai dari variable num sub kelas " + num);
		System.out.println("Nilai dari variable num super kelas " + super.num);
	}

	public static void main(String[] args){
		PenggunaanSuperChild obj = new PenggunaanSuperChild();
		obj.PenggunaanSuper();
	}
}