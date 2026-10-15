package Chapter9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author : Dimpho Phala
 * Date : 14/10/2026
 **/

public class BankAccountTest {

    BankAccount objAcc;

    @BeforeEach
    void setupAccount(){
        objAcc = new BankAccount("Jessica Jones", "9625887",AccountType.CHEQUE,15000);
    }
    @Test
    void testDeposit(){
        //Arrange
        double amountToDeposit = 600;
        double expectedBalance = 15600;
        //actual
        objAcc.deposit(amountToDeposit);
        double actualBalance = objAcc.getBalance();
        //Assert
        assertEquals(expectedBalance, actualBalance);

    }

    @Test
    void testInvalidDeposit(){
        assertThrows(IllegalArgumentException.class, () -> objAcc.deposit(-500));
    }

    @Test
    void testWithdraw(){
        double amountToWithdraw = 1500;
        double expectedBalance = 13500;
        //actual
        try {
            objAcc.withdraw(amountToWithdraw);
            double actualBalance = objAcc.getBalance();
            assertEquals(expectedBalance, actualBalance);
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }

    }
    @Test
    void testInvalidWithdrawalNegativeAmount(){
        assertThrows(IllegalArgumentException.class,
                () -> objAcc.withdraw(-100));
    }

    @Test
    void testWithdrawalInsufficientFunds(){
        double amountToWithdraw = objAcc.getBalance() + 1;
        assertThrows(InsufficientFundsException.class,
                () -> objAcc.withdraw(amountToWithdraw));
    }


    @Test
    void testAccountNumberPrefixes() {

        objAcc.setAccountType(AccountType.DEBIT);
        objAcc.setAccountNumber("12345");
        assertEquals("DB-12345", objAcc.getAccountNumber());

        objAcc.setAccountType(AccountType.LOAN);
        objAcc.setAccountNumber("12345");
        assertEquals("LN-12345", objAcc.getAccountNumber());

        objAcc.setAccountType(AccountType.SAVINGS);
        objAcc.setAccountNumber("12345");
        assertEquals("SV-12345", objAcc.getAccountNumber());

        objAcc.setAccountType(AccountType.CREDIT);
        objAcc.setAccountNumber("12345");
        assertEquals("CR-12345", objAcc.getAccountNumber());

        objAcc.setAccountType(AccountType.CHEQUE);
        objAcc.setAccountNumber("12345");
        assertEquals("CQ-12345", objAcc.getAccountNumber());
    }


    @AfterEach
    void getAccountDetails(){
        System.err.println(objAcc.displayDetails());
    }
}