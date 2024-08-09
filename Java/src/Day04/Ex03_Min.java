package Day04;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Integer.MAX_VALUE :  21억xxx	: int 의 최e댓값
				int min = Integer.MAX_VALUE;
				for (int i = 0; i < arr.length; i++) {
					if ( min < arr[i] ) {
						min = arr[i];
					}
				}
	}
}