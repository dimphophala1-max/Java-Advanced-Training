package Chapter9;

/**
 * @author : Dimpho Phala
 * Date : 14/10/2026
 **/
public class BankAccountRunner {
    public static void main(String[] args) {

        try {
            BankAccount objAcc = new BankAccount("Jessica Jones", "9625887",AccountType.CHEQUE,15000);

            objAcc.deposit(500);//15500
            objAcc.withdraw(1000);//14500

            System.out.println(objAcc.displayDetails());
        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}