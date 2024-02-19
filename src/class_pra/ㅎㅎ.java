package class_pra;

import java.util.Scanner;

public class ㅎㅎ {
	public static void main(String[] args) {
		String id=null,pwd=null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.회원 탈퇴");
			System.out.println("4. 종료");
			int a = sc.nextInt();

			if(a==1) {
				System.out.println("아이디를 입력해주세요.");
				String id2 = sc.next();
				System.out.println("비밀번호를 입력해주세요.");
				String pwd2 = sc.next();
				if(!(id.equals(id2))){
					System.out.println("존재하지 않는 id입니다.");
				}else if(!(pwd.equals(pwd2))){
					System.out.println("비밀번호가 틀렸습니다.");
				}else if(id.equals(id2) && pwd.equals(pwd2)) {
					System.out.println("인증 통과");
				}
			}
			if(a==2) {
				System.out.println("id :");
				String id3 = sc.next();
				System.out.println("pwd :");
				String pwd3 = sc.next();
				if(id3==null) {
					System.out.println("회원가입을 성공했습니다.");

				}else {
					System.out.println("사용자 존재합니다. 탈퇴");
				}

			}
		}
	}
}
