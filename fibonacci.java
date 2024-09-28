import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int angka1 = 1;
		int angka2 = 1;
		int angka3 = 0;
		
		System.out.print(angka1+ " ");
		for (int i = 1 ; i < a ; i++) {
			System.out.print(angka2 + " ");
			angka3 = angka1;
			angka1 = angka2;
			angka2 = angka2+angka3;
		}
		System.out.println("");
	}
}