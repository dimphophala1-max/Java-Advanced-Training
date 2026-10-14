package Chapter8.Exercise;

/**
 * @author : Dimpho Phala
 * Date : 13/10/2026
 **/

public class DepartmentException extends Exception {

    public DepartmentException(String departmentName, int departmentID,
                               int maxEmployees) {

        super("Invalid department: " + departmentName
                + ", ID: " + departmentID
                + ", Maximum employees: " + maxEmployees);
    }
}

