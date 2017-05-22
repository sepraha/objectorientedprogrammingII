public class MainProgram{

	public static void main(String[] args){
		Sekolah smp = new Sekolah();
		smp.setNamaSekolah("SMP Negeri 4 Cimahi");
		smp.setKepalaSekolah("Drs. Tonton Rustono");

		System.out.println(smp.getNamaSekolah());
		System.out.println(smp.getKepalaSekolah());
	}

}