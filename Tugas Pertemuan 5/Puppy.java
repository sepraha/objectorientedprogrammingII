public class Puppy extends Animals{
	String breed;
	int puppyAge;
	String color;
	String name;

	public Puppy(String name){
		System.out.println("Name choosen is :" + name);
	}

	public void setAge(int age){
		puppyAge = age;
	}

	public int getAge(){
		System.out.println("Puppy's age is : " + puppyAge + " years");
		return puppyAge;
	}

	public void eat(){
		System.out.println("Puppy eat");
		super.eat();
	}

	void barking(){
		System.out.println("Puppy can barking");
	}

	public static void main (String[] args){

		Puppy myPuppy = new Puppy("Kite");
		myPuppy.setAge(2);
		myPuppy.getAge();
		myPuppy.barking();

		myPuppy.eat();

	}
}