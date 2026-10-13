package Chapter7.Inheritance;

/**
 * @author : Dimpho Phala
 * Date : 12/10/2026
 **/
public class EmployeeRunner {
    public static void main(String[] args) {
        PermanentEmployee objPEmp = new PermanentEmployee("123456","Jessica Smith", "jess@net.com", 15500);

        ContractEmployee objCEmp = new ContractEmployee("987654","Mike Ross", 38, 250.75);

        objPEmp.display();

        objCEmp.display();
    }
}
