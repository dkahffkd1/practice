package class_pra;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = 0, height = 0;

		while (true) {
			System.out.print("가로 세로 길이 입력 : ");
			width = sc.nextInt();
			height = sc.nextInt();
			if ((width<2)||(height<2)) {
				System.out.println("가로, 세로 2이상 입력해주세요");
				continue;
			}

			for (int i = 1; i <= width; i++) {
				System.out.print("*");
			}
			System.out.println();
			for (int j = 1; j <= height-2; j++) {
				System.out.print("*");
				for (int k = 1; k <= width-2; k++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			for (int i = 1; i <= width; i++) {
				System.out.print("*");
			}
			break;
}
	}
}
