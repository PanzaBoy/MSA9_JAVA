package Day09.Ex06_UserException;

public class AccountTest {
	
	public static void main(String[] args) {
		Account account = new Account();
		
		// 10000원 입금
		account.deposit(10000);
		
		// 20000원 출금
		try {
			account.withdeaw(20000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
	
	}


}



