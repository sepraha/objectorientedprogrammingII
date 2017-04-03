import java.util.Scanner;
import java.text.DecimalFormat;

public class NilaiMahasiswa
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat(".##");
		NilaiMahasiswa checker = new NilaiMahasiswa();
		int jumlahMahasiswa;
		int mahasiswaLulus;
		int mahasiswaTidakLulus;
		float jumlahNilai;
		float nilai;
		float ratarataIP;

		jumlahMahasiswa = 0;
		mahasiswaLulus = 0;
		mahasiswaTidakLulus = 0;
		jumlahNilai = 0;

		do{
			System.out.print("Masukan Nilai :");
			nilai = input.nextFloat();
			if(checker.isWithinRange(nilai,0,4)==1){
				jumlahMahasiswa++;
				jumlahNilai+= nilai;
				if(nilai>=2.75){
					mahasiswaLulus++;
				}else{
					mahasiswaTidakLulus++;
				}
			}
		}while(nilai!=-999);

		if(jumlahMahasiswa==0){
			System.out.println("Tidak ada data");
		}else{			
			ratarataIP = jumlahNilai / jumlahMahasiswa;
			System.out.println("");
			System.out.println("Banyak mahasiswa : "+ jumlahMahasiswa);
			System.out.println("Banyak yang lulus : "+ mahasiswaLulus);
			System.out.println("Banyak yang tidak lulus : "+ mahasiswaTidakLulus);
			System.out.println("IP rata-rata = "+ df.format(ratarataIP));
		}
	}

	public int isWithinRange(float x,float min, float max)
	{
		if((x >= min) && (x <= max))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}