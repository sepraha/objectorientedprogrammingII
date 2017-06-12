public class Generic <T>{
	private T type;

	public T getType(){
		return type;
	}

	public void setType(T type){
		this.type = type;
	}
}

public class UseGeneric{
	Generic<Character> genChar = new Generic<>();
	genChar.setType('1');
}