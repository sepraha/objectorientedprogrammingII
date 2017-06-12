public class MainProgram{
	public static void main(String[] args){
		Karyawan<Manager> support = new Karyawan<>();
		support.setNama(new Manager());
		support.getNama().setNamaManager("Sepraha");
		System.out.println(support.getNama().getNamaManager());
	}

}