public class MethodOverloading{

	public static void main (String[] args){
		MethodOverloading method = new MethodOverloading();
		method.methodTampilkan("Belajar java yuks");
		method.methodTampilkan("Belajar java yuks", " hingga mengerti");
	}

	private void methodTampilkan(String nama){
		System.out.println(nama);
	}
	
	private void methodTampilkan(String nama1, String nama2){
		System.out.println(nama1+nama2);
	}
}