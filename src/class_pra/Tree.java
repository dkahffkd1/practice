package class_pra;

import java.util.Scanner;

public class Tree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("가로를 입력 해주세요");
			int length = sc.nextInt();
			System.out.println("세로를 입력 해주세요");
			int height = sc.nextInt();
			if(length <2 || height <2) {
				System.out.println("2이상 입력해주세요");
				continue;
			}
			for(int i =1; i<=length;i++) {
				System.out.print("*");
			}
			System.out.println();
			for(int j=1; j<=height-2;j++) {
				System.out.print("*");
				for(int k=1; k<=length-2;k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			for(int i = 1; i<=length; i++) {
				System.out.print("*");
			}
		}

	}
}
