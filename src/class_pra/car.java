package class_pra;

import java.util.Scanner;

public class car {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
			
	        System.out.print("Input star length: ");
	        int len = sc.nextInt();
	        int n = (len/2)+1; 
	      
	      
			    // 6) top-down 별 트리
	        for(int i=0; i<n; i++) {
	            for(int j=0; j<i+1; j++) {
	                System.out.print(" ");
	            }
	            for(int j=0; j<n-i; j++) {
	                System.out.print("*");
	            }
	            for(int j=1; j<n-i; j++) {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	        // 5) bottom-up 별 트리
	        for(int i=1; i<n; i++) { 
	            // iterator의 시작을 1에서 시작함으로써 중간 중복을 제거
	            for(int j=n-i; j>0; j--) {
	                System.out.print(" ");
	            }
	            
	            for(int j=0; j<i+1; j++) {
	                System.out.print("*");
	            }
	            
	            for(int j=0; j<i; j++) {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	    }
	}