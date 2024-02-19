package class_pra;

import java.util.Scanner;

public class ㅇㅇ {
	DTO d = new DTO();
	Scanner sc = new Scanner(System.in);
	public void display() {
		input();
		circulation();
		output();
		
}
	public void input() {

		System.out.println("이름 입력");
		//name = sc.next();
		d.setName(sc.next());
		System.out.println("국어 입력");
		//kor = sc.nextInt();
		d.setKor(sc.nextInt());
		System.out.println("영어 입력");
		//eng = sc.nextInt();
		d.setEng(sc.nextInt());
		System.out.println("수학 입력");
		//math = sc.nextInt();
		d.setMath(sc.nextInt());
		
		
	//	sum = kor+eng+math;
		d.setSum(d.getKor()+d.getEng()+d.getMath());
	// avg = sum/3;
		d.setAvg(d.getSum()/3);
		
	}
	public void circulation() {
		if(d.getAvg() >= 90) {
			d.setGrade("A");
			System.out.println("A");
		}
		else if(d.getAvg() >= 80) {
			d.setGrade("B");
			System.out.println("B");
		}else {
			d.setGrade("C");	
		}

	}
	public void output() {
		System.out.println("이름 :" + d.getName());
		System.out.println("국어 :" + d.getKor());
		System.out.println("영어 :" + d.getEng());
		System.out.println("수학 :" + d.getMath());
		System.out.println("합계 :" + d.getSum());
		System.out.println("등급 :" + d.getGrade());
		System.out.println("평균 :" + d.getAvg());


	}
}