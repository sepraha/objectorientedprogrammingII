package Pertemuan13;

public class Karyawan{

	private static <T> void saywelcome()
	{
		System.out.println("Welcome");
	}

	private static <T,N> void fullname(T first,N last){
		System.out.print(first);
		System.out.println(last);
	}

	public static void main(String[] args){
		saywelcome();
		fullname("Septi"," Rahayu");
	}

}