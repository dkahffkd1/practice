package class_pra;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = null;
		int A,kor=0,eng=0,math=0;
		while(true) {
			System.out.println("1.이름, 국,영,수 입력받기");
			System.out.println("2. 수정하기");
			System.out.println("3. 결과확인");
			System.out.println("4. 종료");
			A = sc.nextInt();
		
		if(A==1){
			System.out.println("이름 입력");
			name = sc.next();
			System.out.println("국어 입력" );
			kor = sc.nextInt();
			System.out.println("영어 입력");
			eng = sc.nextInt();
			System.out.println("수학 입력");
			math = sc.nextInt();
			System.out.println("이름 : "+ name );
			System.out.println("국어 : "+ kor );
			System.out.println("영어 : "+ eng );
			System.out.println("수학 : "+ math );
			System.out.println("저장 되었습니다.");
		
		}else if(A==2) {
			name = null;
			System.out.println("수정할 이름 입력");
			name = sc.next();
			kor = 0;
			System.out.println("수정할 국어 점수 입력");
			kor = sc.nextInt();
			eng = 0;
			System.out.println("수정할 영어 점수 입력");
			eng = sc.nextInt();
			math = 0;
			System.out.println("수정할 수학 점수 입력");
			math = sc.nextInt();
			System.out.println("이름 : "+ name );
			System.out.println("국어 : "+ kor );
			System.out.println("영어 : "+ eng );
			System.out.println("수학 : "+ math );
			System.out.println("수정 되었습니다.");
		
		}else if(A==3){	
			System.out.println("-----성적-------");
			System.out.println("<<<");
			System.out.println("이름 : "+ name );
			System.out.println("국어 : "+ kor );
			System.out.println("영어 : "+ eng );
			System.out.println("수학 : "+ math );
			int sum = kor+eng+math;
			double avg = sum/3; 
			System.out.println("합계 : "+ sum);
			System.out.println("평균 : "+ avg);
			System.out.println("확인 되었습니다.");
		
		}else {
			System.out.println("종료 되었습니다.");
			break;
		}
		}
	}
}



