package bankaccount;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testklasse voor JUnit, test de klasse BankAccount.
 */
public class TestBankAccount {


	/**
	 * Todo 1: Test de toString methode  van BankAccount.
	 */
	@Test
	public void TestBankAccountConstructor(){
		BankAccount account = new BankAccount("1234567890123");
		assertEquals("1234 5678 9012 3",account.toString());
	}


}

