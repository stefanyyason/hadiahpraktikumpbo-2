import java.util.Scanner;
public class tipepesawat2{
	public static void main(String[] args){
		Scanner input= new Scanner (System.in);
		String nama,alamat;
		int bayar;
		double kembalian;
		
		System.out.println("|----|----------------|--------------------|");
		System.out.println("|Kode|  Tipe Pesawat  | Harga Tipe Pesawat |");
		System.out.println("|----|----------------|--------------------|");
		System.out.println("| 1  | 	      A	      |	   Rp. 5.000.000   |");
		System.out.println("| 2  | 	      B	      |	   Rp. 2.000.000   |");
		System.out.println("| 3  | 	      C	      |	   Rp. 1.000.000   |");
		System.out.println("|----|----------------|--------------------|");
	
		System.out.println();
		System.out.print("Nama          : ");
		nama=input.nextLine();
		System.out.print("Alamat        : ");
		alamat=input.nextLine();
		System.out.println();

		
		int type;
		System.out.print("Kode : ");
		type=input.nextInt();
		if(type==1){
			System.out.println("Tipe Pesawat :" +" A");
			type=5000000;
		}
		else if(type==2){
			System.out.println("Tipe Pesawat :" +" B");
			type=2000000;
		}
		else if(type==3){
			System.out.println("Tipe Pesawat :" +" C");
			type=1000000;
		}
		else{
			System.out.println("Maaf anda salah memasukkan tipe pesawat");
			}
		System.out.println("Harga Pesawat: "+type);
		System.out.print("Bayar	     : ");
		bayar=input.nextInt();
		System.out.println();
		kembalian=bayar-type;
		System.out.println("Kembalian    : "+kembalian);
	}
}