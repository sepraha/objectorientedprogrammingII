public class Method{

	public static void main (String [] args){
		Method method = new Method();
		method.methodTampilkan();
		System.out.println(method.kembalikanNilai());
	}

	private void methodTampilkan () {
		System.out.println("Belajar Java Yuks");
	}

	private int kembalikanNilai(){
		return 1;
	}
}