package bankaccount;

import org.junit.Test;

import static org.junit.Assert.fail;

public class TestBankAccountValidator {
    // Testdata:
    private String[] accounts = {
            "BE65409407376196", "BE39230033988719", //juiste nummers
            "BE2873402525022",  "BA28734025250220",
			"BE2873402525o220","BE29734025250220"}; //foutieve nummers

    /**
     * TODO 2: Test BankAccountValidator: Test de validatie van twee goede
		 * rekeningnummers.
     * Er mag geen exception optreden.
     */
    @Test
		public void TestValideAccounts(){
    	try {
				BankAccountValidator.validateAccount(accounts[0]);
				BankAccountValidator.validateAccount(accounts[1]);
			}catch(IllegalArgumentException x){
    		fail("Validation of correct number failed");
			}
		}


    /**
     * TODO 3: Test de validatie van een rekeningnummer met te weinig cijfers.
     * Er moet een IllegalArgumentException optreden.
     */
		@Test(expected = IllegalArgumentException.class)
		public void TestKorteAccounts(){
				BankAccountValidator.validateAccount(accounts[2]);
		}

    /**
     * TODO 4: Test de validatie van een rekeningnummer met een verkeerde landcode.
     * Er moet een IllegalArgumentException optreden.
     */
		@Test(expected = IllegalArgumentException.class)
		public void TestInvalidLandcode(){
			BankAccountValidator.validateAccount(accounts[3]);
		}

    /**
     * TODO 5: Test de validatie van een rekeningnummer dat niet numerieke tekens bevat.
     * Er moet een IllegalArgumentException optreden.
     */
		@Test(expected = IllegalArgumentException.class)
		public void TestIllegalcharacterAccounts(){
			BankAccountValidator.validateAccount(accounts[4]);
		}

    /**
     * TODO 6: Test de validatie van een niet geldig rekeningnummer.
     * Er moet een IllegalArgumentException optreden.
     */
		@Test(expected = IllegalArgumentException.class)
		public void TestOngeldignrAccounts(){
			BankAccountValidator.validateAccount(accounts[5]);
		}
}