
public class Puppy{
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
		System.out.println("Puppy's age is :" + puppyAge + " years");
		return puppyAge;
	}

	void barking(){
		System.out.println("Puppy can barking");
	}

	void hungry(){
		System.out.println("Puppy can feel hungry, you should give some food");
	}

	void sleeping(){
		System.out.println("Puppy can sleeping, and look so cute");
	}

	public static void main (String[] args){

		Puppy myPuppy = new Puppy("Kite");


		myPuppy.setAge(2);
		myPuppy.getAge();
		myPuppy.barking();
		myPuppy.hungry();
		myPuppy.sleeping();

	}
}