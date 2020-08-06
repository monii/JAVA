package algorithm;

import java.util.Scanner;

public class algorithm11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			System.out.print("\"");
			for (int j = 0; j < a; j++) {
				System.out.print("*");
				if (j != 0 && (j+1) % a == 0 ) {
					System.out.println();
				}
			}
		}

		System.out.println(a + b);
	}

}
