import java.util.Scanner;
import java.util.Arrays;

public class matriks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size_matriks = 4;
		int[] matriks1 = new int[size_matriks];
		int[] matriks2 = new int[size_matriks];
		
		System.out.println("Isi matriks 1:");
		for (int i = 0; i <= size_matriks-1; i++) {
			matriks1[i] = scanner.nextInt();
		}
		System.out.println("Isi matriks 2:");
		for (int j = 0; j <= size_matriks-1; j++) {
			matriks2[j] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(matriks1));
		System.out.println(Arrays.toString(matriks2));
		
		penjumlahan(matriks1, matriks2);
	}
	
	
	public static void penjumlahan(int[] matriks1, int[] matriks2) {
		System.out.println("Hasil perkalian:");
				
		System.out.print(matriks1[0] * matriks2[0] + matriks1[1] * matriks2[2] + " ");
		
		System.out.println(matriks1[0] * matriks2[1] + matriks1[1] * matriks2[3]);
		
		System.out.print(matriks1[2] * matriks2[0] + matriks1[3] * matriks2[2] + " ");
		
		System.out.println(matriks1[2] * matriks2[1] + matriks1[3] * matriks2[3]);
 	 }
}

