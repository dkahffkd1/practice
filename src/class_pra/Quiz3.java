package class_pra;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pwd;

		while(true) {
			System.out.println("----로그인 화면 ------");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.println("4. 종료");
			System.out.println("----로그인 화면 -------");
			int a = sc.nextInt();

			if(a==2) {
				System.out.println("아이디 :");
				id = sc.next();
				System.out.println("비밀번호 :");
				pwd = sc.next();
			}else if(id == null) {
				System.out.println("회원 가입 성공");
			}else {
				System.out.println("이미 등록된 계정이 있음");
			}
			
			if(a==1) {
					System.out.println("아이디 :" );
					id = sc.next();
					String userId= id;
					System.out.println("비밀번호 :");
					pwd = sc.next();
					String userPwd = pwd;
	
				}
				if(a==3) {
					id = null;
					pwd = null;
					System.out.println("탈퇴 되었습니다.");
				}

			}
		}
	}
}