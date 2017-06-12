class GenericTwoTypes<T, N>
{
	private T type;
	private N type1;

	public T getType(){
		return type;
	}

	public N getType1(){
		return type1;
	}

	public void setType1(N type1){
		this.type1 = type1;
	}

	public void setType(T type){
		this.type = type;
	}
}

public class GenericMainTwoTypes{
	public static void main(String[] args){
		GenericTwoTypes<Character, Integer>
		genCharInt = new GenericTwoTypes<>();
		genCharInt.setType1(1);
		genCharInt.setType('N');
		System.out.println(genCharInt.getType1());
		System.out.println(genCharInt.getType());
	}
}