package Day13_14.Ex05_Compare.Comparator;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			 int menu = sc.nextInt();
			// 작성 위치
			switch(menu) {
            case 1:  // 예금
                System.out.print("예금액 : ");
                int moneyin = sc.nextInt();
                balance += moneyin;
                System.out.println(moneyin + "원이 예금 되었습니다.");
                break;
                
            case 2:  // 출금
                System.out.print("출금액 : ");
                int moneyout = sc.nextInt();
                if (moneyout > balance) {
                    System.out.println("잔고가 부족합니다.");
                } else {
                    balance -= moneyout;
                    System.out.println(moneyout + "원이 출금 되었습니다.");
                }
                break;
                
            case 3:  // 잔고 조회
                System.out.println("잔고 : " + balance);
                break;
                
            case 4:  // 종료
                System.out.println("프로그램을 종료합니다.");
                run = false;
                break;
                
            default:
                System.out.println("잘못된 번호입니다. 다시 선택해주세요.");
                break;	
			}
		}
		
		System.out.println("프로그램 종료");
		System.out.println("할 줄 알았줴~? 응 구라야~");
		sc.close();
	
	}
}













