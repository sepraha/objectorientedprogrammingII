package Pertemuan13;

public class Manager{
	
	public String nama;

	public void setNamaManager(String nama){
		this.nama = nama;
	}

	public String getNamaManager(){
		return nama;
	}

	public static <T> bagian(T divisi){
		System.out.println(divisi);
	}

	public static void main(String[] args){
		bagian("Support");
		Manager support = new Manager();
		support.setNamaManager("Septi Rahayu");
		support.getNamaManager();
		
	}

}