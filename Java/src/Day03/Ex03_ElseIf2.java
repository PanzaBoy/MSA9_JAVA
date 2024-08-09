package Day03;

import java.util.Scanner;

public class Ex03_ElseIf2 {

	public static void main(String[] args) {
		// 성적을 입력받아서, 성적에 따른 학점 A~F 를 출력하시오.
				Scanner sc = new Scanner(System.in);
				System.out.println("성적 : ");
				int score = sc.nextInt();
				
				// 90점 이상, A
				// 80점 이상, B
				// 70점 이상, C
				// 60점 이상, D
				// 50점 이상, F
				if ( score >= 90 && score <= 100) System.out.println("A");
				if ( score >= 80 && score < 90) System.out.println("B");
				if ( score >= 70 && score < 80) System.out.println("C");
				if ( score >= 60 && score < 70) System.out.println("D");
				if ( score < 60 && score >= 0) System.out.println("F");
				sc.close();
	}
}
