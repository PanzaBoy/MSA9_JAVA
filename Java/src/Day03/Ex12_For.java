package Day03;

public class Ex12_For {

	public static void main(String[] args) {
		// for( 1초기식 ; 2조건식 ; 4증감식 ){ 3실행문 }
		// - 실행 순서 : 1 → 반복(2 → 3 → 4 )
		
		// 1. 1~10까지의 정수를 출력하시오.
		for (int i = 1; i <= 10; i++) {
			System.out.println( i + " " );
			
		}
		
		// 2. 50~100 까지 정수를 출력하시오.
		for (int i = 50; i <= 100; i++) {
			System.out.println( i + " ");
			// 10개씩 개행(엔터)하여 출력
			
		}
		
		// 3. 1~20 까지 정수 중 짝수만 출력하시오.
		for (int i = 2; i <= 20 ; i = i + 2) {
			System.out.println( i + " ");
		}
		// 4. 1~20 까지의 정수 중 홀수만 출력하시오.
		for (int i = 1; i <= 20 ; i = i + 2) {
			System.out.println( i + " ");
			
		}
	}

}
