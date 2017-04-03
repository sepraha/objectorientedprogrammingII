public class Parameter{
	
	public static void main(String[] args){
		Parameter method = new Parameter();
		method.methodTampilkan2("Belajar Java Yuks!");
		System.out.println(method.tambahkanNilai(3,5));
	}

	private void methodTampilkan2(String nama){
		System.out.println(nama);
	}

	private int tambahkanNilai (int x, int y){
		return x+y;
	}
}