package Chapter8.Exercise;

/**
 * @author : Dimpho Phala
 * Date : 13/10/2026
 **/

public class Department {

    private String departmentName;
    private int departmentID;
    private int maxEmployees;

    public Department(String departmentName, int departmentID,
                      int maxEmployees) throws DepartmentException {

        if (departmentName == null || !departmentName.matches("[A-Za-z]{2}")) {
            throw new DepartmentException(departmentName, departmentID,
                    maxEmployees);
        }

        if (departmentID < 100 || departmentID > 499) {
            throw new DepartmentException(departmentName, departmentID,
                    maxEmployees);
        }

        if (maxEmployees < 4 || maxEmployees > 10) {
            throw new DepartmentException(departmentName, departmentID,
                    maxEmployees);
        }

        this.departmentName = departmentName;
        this.departmentID = departmentID;
        this.maxEmployees = maxEmployees;
    }
}

