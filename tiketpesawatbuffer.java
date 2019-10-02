import java.io.*;
public class tiketpesawatbuffer{
	public static void main (String[] args) throws IOException{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		String nama,alamat;
		int kode,bayar, harga;
		double kembalian;
		
		System.out.println("|----|----------------|--------------------|");
		System.out.println("|Kode|  Tipe Pesawat  | Harga Tipe Pesawat |");
		System.out.println("|----|----------------|--------------------|");
		System.out.println("| 1  | 	      A	      |	   Rp. 5.000.000   |");
		System.out.println("| 2  | 	      B	      |	   Rp. 2.000.000   |");
		System.out.println("| 3  | 	      C	      |	   Rp. 1.000.000   |");
		System.out.println("|----|----------------|--------------------|");
	
		System.out.println();
		System.out.println("inputan Buffered Reader");
		System.out.print("Nama          : ");
		nama=br.readLine();
		System.out.print("Alamat        : ");
		alamat=br.readLine();
		System.out.println();
		
	
		System.out.print("Kode : ");
		kode=Integer.parseInt(br.readLine());
		System.out.println();
		

			if(kode==1)
			{
				System.out.println("A");
				System.out.println();
				System.out.println("Harga : 5000000");
				kode=5000000;
	
			
			}	
			else if(kode==2){
				System.out.println("B");
				System.out.println();
				System.out.println("Harga : 2000000");
				kode=2000000;
	
			}
			else if (kode==3){
				System.out.println("C");
				System.out.println();
				System.out.println("Harga : 1000000");
				kode=1000000;
			}
			else{
			System.out.println("Maaf anda salah memasukkan tipe pesawat");
			}
			
			System.out.print("Bayar: ");
			bayar=Integer.parseInt(br.readLine());
			kembalian=bayar-kode;
			System.out.println("kembalian: "+kembalian);
				
		}	
	}
		
			
		
	