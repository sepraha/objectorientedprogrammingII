package Pertemuan13;

public class GenApp2 <T>{
	private T type;

	public T getType(){
		return type;
	}

	public void setType(T type){
		this.type = type;
	}

	private static <N> void anythingYouWanted(N freeParType){
		System.out.println(freeParType);
	}

	public static void main(String[] args) {
		anythingYouWanted("Welcome");
	}

}