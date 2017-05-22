public class MainProgram{

	public static void main(String[] args){
		RodaDua motor = new RodaDua();
		motor.tipe_kendaraan();

		motor.setMerk("Honda");
		System.out.println(motor.getMerk());
	}

}