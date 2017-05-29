public class SuryaPower implements Power, Socket, Mahasiswa{
	public String suryaPower(){
		return "Ini Surya Power";
	}
	
	public void jadwalUTS(){
		System.out.println("UTS dilaksanakan pada tanggal ");
	}

	public void jadwalUAS(){
		System.out.println("UAS dilaksanakan pada tanggal 4 Juli 2017");
	}

	public String getPower(){
		return "Ini adalah tenaga Udara";
	}

	public void countPower(){
		System.out.println("Perhitungan tenaga Udara");
	}
}